package com.ratnagiri.voter;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/quiz")
public class QuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        String jsonResponse = "{"
            + "\"status\":\"success\","
            + "\"questions\":["
                + "{"
                    + "\"q\":\"भारत निवडणूक आयोगाच्या नियमानुसार मतदानासाठी किमान पात्रता वय किती असावे लागते?\","
                    + "\"q_en\":\"What is the minimum eligible age for voting in India?\","
                    + "\"options\":[\"१६ वर्षे\", \"१८ वर्षे\", \"२१ वर्षे\", \"२५ वर्षे\"],"
                    + "\"options_en\":[\"16 Years\", \"18 Years\", \"21 Years\", \"25 Years\"],"
                    + "\"correct\":1,"
                    + "\"exp\":\"१८ वर्षे पूर्ण झालेल्या सर्व भारतीय नागरिकांना मतदानाचा अधिकार मिळतो.\""
                + "},"
                + "{"
                    + "\"q\":\"रत्नागिरी शहराचा (415612) मुख्य विधानसभा मतदारसंघ क्रमांक कोणता आहे?\","
                    + "\"q_en\":\"What is the Assembly Constituency Number for Ratnagiri City (415612)?\","
                    + "\"options\":[\"२६३ (दापोली)\", \"२६५ (चिपळूण)\", \"२६६ (रत्नागिरी)\", \"२६७ (राजापूर)\"],"
                    + "\"options_en\":[\"263 (Dapoli)\", \"265 (Chiplun)\", \"266 (Ratnagiri)\", \"267 (Rajapur)\"],"
                    + "\"correct\":2,"
                    + "\"exp\":\"रत्नागिरी शहर व लगतचा परिसर विधानसभा क्रमांक २६६ मध्ये येतो.\""
                + "},"
                + "{"
                    + "\"q\":\"नवीन मतदार नोंदणीसाठी (New Voter Registration) कोणता अर्ज (Form) भरावा लागतो?\","
                    + "\"q_en\":\"Which Form is used for New Voter Registration?\","
                    + "\"options\":[\"फॉर्म ६ (Form 6)\", \"फॉर्म ७ (Form 7)\", \"फॉर्म ८ (Form 8)\", \"फॉर्म ६-क\"],"
                    + "\"options_en\":[\"Form 6\", \"Form 7\", \"Form 8\", \"Form 6A\"],"
                    + "\"correct\":0,"
                    + "\"exp\":\"नवीन मतदार नोंदणीसाठी 'नमुना अर्ज ६' (Form 6) भरावा लागतो.\""
                + "},"
                + "{"
                    + "\"q\":\"राष्ट्रीय मतदार हेल्पलाइन टोल-फ्री क्रमांक कोणता आहे?\","
                    + "\"q_en\":\"What is the National Voter Helpline Toll-Free Number?\","
                    + "\"options\":[\"१०८\", \"१००\", \"१९५०\", \"११२\"],"
                    + "\"options_en\":[\"108\", \"100\", \"1950\", \"112\"],"
                    + "\"correct\":2,"
                    + "\"exp\":\"१९५० हा निवडणूक आयोगाचा अधिकृत टोल-फ्री हेल्पलाइन क्रमांक आहे.\""
                + "}"
            + "]"
            + "}";

        out.print(jsonResponse);
        out.flush();
    }
}