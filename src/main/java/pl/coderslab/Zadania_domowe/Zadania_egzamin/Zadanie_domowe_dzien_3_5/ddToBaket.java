package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_3_5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addToBasket")
public class ddToBaket extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String product = request.getParameter("product");
        String number = request.getParameter("number");
        String price = request.getParameter("price");
        String comment = "";

        int numberInt = Integer.parseInt(number);
        int priceInt =  Integer.parseInt(price);

        Basket basket = new Basket(product,numberInt, priceInt);

        List<Basket> basketList;

        if (session.isNew()|| session.getAttribute("basket")==null) {
            basketList = new ArrayList<>();
        } else {
            basketList = (List<Basket>) session.getAttribute("basket");
        }
        basketList.add(basket);
        session.setAttribute("basket", basketList);
        comment = "Produkt dodany";
        request.setAttribute("comment", comment);
        getServletContext().getRequestDispatcher("/addToBasket.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/addToBasket.jsp").forward(request, response);
    }
}
