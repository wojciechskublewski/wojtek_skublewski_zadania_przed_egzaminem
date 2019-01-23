package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/allquotes")
public class allquotes extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Quote> quotes = (List<Quote>) session.getAttribute("quote");
        request.setAttribute("quotes",quotes);
        getServletContext().getRequestDispatcher("/exam_zadanie_4a.jsp").forward(request,response);

        //for (int i =0; i< quotes.size(); i++) {
            //response.getWriter().append(quotes.get(i).getAuthor()).append("; ");
        //}

    }
}
