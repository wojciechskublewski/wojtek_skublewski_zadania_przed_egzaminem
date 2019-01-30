package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/smurfs")
public class smurfs extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Smurf> smurfs = SmurfDao.getList();

        request.setAttribute("smurfs",smurfs);
        getServletContext().getRequestDispatcher("/smurfs.jsp").forward(request,response);
    }
}
