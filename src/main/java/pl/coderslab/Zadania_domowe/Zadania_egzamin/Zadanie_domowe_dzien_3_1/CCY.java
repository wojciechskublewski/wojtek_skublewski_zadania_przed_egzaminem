package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_3_1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CCY")
public class CCY extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ccyPar = request.getParameter("ccy");
        String number = request.getParameter("number");
        double numD = Double.parseDouble(number);
        //response.getWriter().append(ccyPar);
        List<FxCCy> fxCCyList = FxCCy.addCcyFx();
        double result=0;

        for (int i=0; i<fxCCyList.size(); i++) {
            String supCCY = fxCCyList.get(i).getCcy1()+fxCCyList.get(i).getCcy2();
            if (ccyPar.equals(supCCY)) {
                result = numD*fxCCyList.get(i).getRate();
                request.setAttribute("ccy", result);
                getServletContext().getRequestDispatcher("/CCYresult.jsp").forward(request, response);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/CCY.jsp").forward(request,response);
    }
}
