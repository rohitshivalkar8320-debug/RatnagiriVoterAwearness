package com.ratnagiri.voter;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/pledge")
public class PledgeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        String name = request.getParameter("name");
        String area = request.getParameter("area");
        String category = request.getParameter("category");

        if (name == null || name.trim().isEmpty()) {
            name = "जागरूक मतदार";
        }
        if (area == null || area.trim().isEmpty()) {
            area = "रत्नागिरी (415612)";
        }

        String certId = "RTN-SVEEP-" + (100000 + (int)(Math.random() * 899999));
        String date = java.time.LocalDate.now().toString();

        String jsonResponse = "{"
            + "\"status\":\"success\","
            + "\"certId\":\"" + certId + "\","
            + "\"name\":\"" + name.replace("\"", "\\\"") + "\","
            + "\"area\":\"" + area.replace("\"", "\\\"") + "\","
            + "\"category\":\"" + (category != null ? category.replace("\"", "\\\"") : "Regular Voter") + "\","
            + "\"date\":\"" + date + "\""
            + "}";

        PrintWriter out = response.getWriter();
        out.print(jsonResponse);
        out.flush();
    }
}