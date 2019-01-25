package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_3_4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet04")
public class Servlet04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();

        for (Cookie c : cookies) {
            if (c.getName().equals("visits")) {
                String strVisits = c.getValue();
                int numVis = Integer.parseInt(strVisits);

                if (numVis > 0) {
                    numVis++;
                    strVisits = Integer.toString(numVis);
                    c.setValue(strVisits);
                    response.addCookie(c);
                    response.getWriter().append("jestes to juz: ").append(strVisits);
                }
            } else {
                Cookie cookie = new Cookie("visits", "1");
                cookie.setMaxAge(60*60*24*365);
                response.addCookie(cookie);

            }

        }
    }
}
