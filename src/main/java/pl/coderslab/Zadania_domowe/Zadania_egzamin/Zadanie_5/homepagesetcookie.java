package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/homepagesetcookie")
public class homepagesetcookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("link", "approved");
        String cookieVal = "appoved";
        response.addCookie(cookie);
        response.sendRedirect("/homepage");
    }
}
