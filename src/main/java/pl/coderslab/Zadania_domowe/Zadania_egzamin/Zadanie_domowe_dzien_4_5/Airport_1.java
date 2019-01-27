package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_4_5;

import org.checkerframework.checker.units.qual.A;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Airport_1")
public class Airport_1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameArr = request.getParameter("nameArr");
        String nameDep = request.getParameter("nameDep");
        String timeDep = request.getParameter("timeDep");
        String hours = request.getParameter("hours");
        String price = request.getParameter("price");

        response.getWriter().append(nameDep).append(", ").append(nameArr)
                .append(", ")
                .append(timeDep)
                .append(", ")
                .append(hours)
                .append(", ")
                .append(price);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        List<Airport> airportList;

        if(session.isNew()|| (List<Airport>)session.getAttribute("airportList")==null){
            airportList = new ArrayList<>();
            airportList = AirportDao.getList();
            session.setAttribute("airportList",airportList);
        } else {
            airportList = (List<Airport>) session.getAttribute("airportList");
         }

         request.setAttribute("airportList",airportList);
        getServletContext().getRequestDispatcher("/airport.jsp").forward(request,response);

    }
}
