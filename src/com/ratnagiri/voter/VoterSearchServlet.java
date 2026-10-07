package com.ratnagiri.voter;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/search")
public class VoterSearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        String pincode = request.getParameter("pincode");
        String query = request.getParameter("query");

        if (pincode == null || pincode.trim().isEmpty()) {
            pincode = "all";
        }
        if (query == null) {
            query = "";
        }

        // Complete polling stations dataset matching the HTML file
        String jsonResponse = "{"
            + "\"status\":\"success\","
            + "\"data\":["
                + "{\"pin\":\"415612\", \"area\":\"नाचणे रोड / Nachane Road\", \"station\":\"फाटक हायस्कूल (नवीन इमारत), खोली क्र. २\", \"blo\":\"श्री. आर. व्ही. सावंत\", \"phone\":\"94220XXXX1\"},"
                + "{\"pin\":\"415612\", \"area\":\"कारवांचली / Karwanchali\", \"station\":\"गोगटे जोगळेकर कॉलेज, विज्ञान शाखा हॉल\", \"blo\":\"सौ. एस. एस. जोशी\", \"phone\":\"98231XXXX2\"},"
                + "{\"pin\":\"415612\", \"area\":\"झाडगाव व किल्ला / Zadgaon\", \"station\":\"जिल्हा परिषद शाळा झाडगाव क्र. १\", \"blo\":\"श्री. ए. पी. कदम\", \"phone\":\"94043XXXX3\"},"
                + "{\"pin\":\"415612\", \"area\":\"शिरगाव / Shirgaon\", \"station\":\"ग्रामपंचायत हॉल शिरगाव\", \"blo\":\"श्री. एम. डी. पाटणकर\", \"phone\":\"99701XXXX4\"},"
                + "{\"pin\":\"415612\", \"area\":\"मिऱ्या & भगवती / Mirya\", \"station\":\"मच्छीमार संस्था प्राथमिक शाळा मिऱ्या\", \"blo\":\"सौ. के. एन. बांदकर\", \"phone\":\"98224XXXX5\"},"
                + "{\"pin\":\"415639\", \"area\":\"एमआयडीसी / Mirjole MIDC\", \"station\":\"जि. प. शाळा मिरजोळे क्र. २\", \"blo\":\"श्री. एस. बी. पवार\", \"phone\":\"94211XXXX6\"},"
                + "{\"pin\":\"415605\", \"area\":\"मालगुंड / Malgund\", \"station\":\"कवी केशवसुत स्मारक प्राथमिक शाळा\", \"blo\":\"श्री. व्ही. टी. सुर्वे\", \"phone\":\"94224XXXX7\"},"
                + "{\"pin\":\"415606\", \"area\":\"पावस / Pawas\", \"station\":\"स्वामी स्वरूपानंद हायस्कूल पावस\", \"blo\":\"श्री. के. आर. देसाई\", \"phone\":\"98235XXXX8\"}"
            + "]"
            + "}";

        out.print(jsonResponse);
        out.flush();
    }
}