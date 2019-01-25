package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_3_6;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet06")
public class Servlet06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strNum1 = request.getParameter("number1");
        if (StringUtils.isBlank(strNum1)) {
            getServletContext().getRequestDispatcher("/addNumbers.jsp").forward(request, response);
        }
        int number1 = Integer.parseInt(strNum1);
        String strNum2 = request.getParameter("number2");
        int number2 = Integer.parseInt(strNum2);
        String strNum3 = request.getParameter("number3");
        int number3 = Integer.parseInt(strNum3);
        String strNum4 = request.getParameter("number4");
        int number4 = Integer.parseInt(strNum4);

            request.setAttribute("num1", number1);
            request.setAttribute("num2", number2);
            request.setAttribute("num3", number3);
            request.setAttribute("num4", number4);

            double srednia = (number1 + number2 + number3 + number4) / 4;
            int sum = (number1 + number2 + number3 + number4);
            int iloczyn = (number1 * number2 * number3 * number4);
            request.setAttribute("srednia", srednia);
            request.setAttribute("sum", sum);
            request.setAttribute("iloczyn", iloczyn);

            getServletContext().getRequestDispatcher("/Servlet06_results.jsp").forward(request, response);

    }
}
