package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_4_4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_01_3")
public class Servlet_01_3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        for(Cookie c : cookies) {
            if(c.getName().equals("lang")){
                c.setMaxAge(0);
                response.addCookie(c);
                response.getWriter().append("cookie delted");
            }
        }
    }
}
