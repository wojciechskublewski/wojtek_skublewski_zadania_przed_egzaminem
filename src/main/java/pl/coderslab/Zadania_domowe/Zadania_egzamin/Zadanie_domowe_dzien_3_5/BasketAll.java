package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_3_5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/BasketAll")
public class BasketAll extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int sum = 0;
        List<Basket> basketList = (List<Basket>) session.getAttribute("basket");

        for (int i=0; i<basketList.size(); i++) {
            sum =sum+ (basketList.get(i).getNumber()*basketList.get(i).getPrice());
        }

        request.setAttribute("sum", sum);
        request.setAttribute("basket", basketList);
        getServletContext().getRequestDispatcher("/BasketAll.jsp").forward(request,response);
    }
}
