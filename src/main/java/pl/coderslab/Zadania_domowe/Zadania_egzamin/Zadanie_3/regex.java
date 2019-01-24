package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_3;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

@WebServlet("/regex")
public class regex extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param1 = request.getParameter("param1");
        boolean regex = false;
        if(StringUtils.isBlank(param1)||param1==null) {
            request.setAttribute("regex",regex);
            getServletContext().getRequestDispatcher("/regex.jsp").forward(request,response);
        }

        regex = Pattern.matches("[a-z]+(\\.gif|\\.jpg|\\.png)",param1);
        if (regex==true){
                response.sendRedirect("https://www.google.pl/#q="+param1);
        } else {
            request.setAttribute("regex",regex);
            request.setAttribute("par",param1);
            getServletContext().getRequestDispatcher("/regex.jsp").forward(request,response);
        }

    }
}
