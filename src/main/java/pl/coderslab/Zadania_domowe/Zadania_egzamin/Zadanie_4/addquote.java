package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addquote")
public class addquote extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String author = request.getParameter("author");
        String content = request.getParameter("content");

        List<Quote> quotes;
        if (session.isNew()|| session.getAttribute("quote")==null) {
            quotes = new ArrayList<>();
        } else {
            quotes = (List<Quote>) session.getAttribute("quote");

        }

        Quote quote = new Quote(author,content);
        quotes.add(quote);
        session.setAttribute("quote",quotes);
        getServletContext().getRequestDispatcher("/Egzamin_zadanie_4.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/Egzamin_zadanie_4.jsp").forward(request,response);
    }
}
