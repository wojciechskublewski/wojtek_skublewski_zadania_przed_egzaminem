package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_4_4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_01_2")
public class Servlet_01_2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lang = request.getParameter("language");
        Cookie cookie = new Cookie("lang", lang);
        response.addCookie(cookie);
        response.sendRedirect("/Servlet_01_1");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
