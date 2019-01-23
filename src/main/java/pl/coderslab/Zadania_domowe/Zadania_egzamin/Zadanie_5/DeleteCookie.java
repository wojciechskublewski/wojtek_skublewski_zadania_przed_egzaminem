package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteCookie")
public class DeleteCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String cookieVal="approved";
        for (Cookie c : cookies){
            if(cookieVal.equals(c.getValue())){
                c.setMaxAge(0);
                response.addCookie(c);
                response.getWriter().append("deleted");
            }
        }
    }
}
