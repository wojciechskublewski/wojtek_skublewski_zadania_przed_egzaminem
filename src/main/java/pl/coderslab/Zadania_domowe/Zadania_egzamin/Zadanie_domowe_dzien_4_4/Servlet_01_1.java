package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_4_4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/Servlet_01_1")
public class Servlet_01_1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("lang", "de");
        response.addCookie(cookie);
        Map<String, String> lang = new HashMap<>();
        lang.put("en", "Hello");
        lang.put("pl", "Cześć");
        lang.put("de", "Ehre");
        lang.put("es", "Hola");
        lang.put("fr", "Bienvenue");


        HttpSession session = request.getSession();

        session.setAttribute("lang", lang);

        Cookie[] cookies = request.getCookies();
        String language = "lang";
        for (Cookie c : cookies) {
            if(language.equals(c.getName())) {
                request.setAttribute("lang", c.getValue());
                request.setAttribute("czesc", lang.get(c.getValue()));
                getServletContext().getRequestDispatcher("/Servlet_01_1.jsp").forward(request,response);
            }

        }
    }
}
