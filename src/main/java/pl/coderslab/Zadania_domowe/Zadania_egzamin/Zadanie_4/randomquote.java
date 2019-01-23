package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@WebServlet("/randomquote")
public class randomquote extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Quote> quotes = (List<Quote>) session.getAttribute("quote");

        int listSize = quotes.size();
        Random random = new Random();
        int randomNum = random.nextInt(listSize);

        request.setAttribute("quotes",quotes.get(randomNum));
        getServletContext().getRequestDispatcher("/random_zadanie_4.jsp").forward(request,response);
    }
}
