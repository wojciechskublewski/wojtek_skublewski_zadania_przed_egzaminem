package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/homepage")
public class homepage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        boolean isApp = false;
        String cookieVal = "approved";
        for (Cookie c : cookies) {
            if (cookieVal.equals(c.getValue())) {
                isApp = true;
                break;
            }
        }
            request.setAttribute("link",isApp);
            getServletContext().getRequestDispatcher("/homepage.jsp").forward(request, response);

        }

}
