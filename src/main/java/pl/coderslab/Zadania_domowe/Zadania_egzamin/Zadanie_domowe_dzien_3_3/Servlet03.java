package pl.coderslab.Zadania_domowe.Zadania_egzamin.Zadanie_domowe_dzien_3_3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Servlet03")
public class Servlet03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<FiveText> fiveTextList;
        HttpSession session = request.getSession();
        String text1 = request.getParameter("text1");
        String text2 = request.getParameter("text2");
        String text3 = request.getParameter("text3");
        String text4 = request.getParameter("text4");
        String text5 = request.getParameter("text5");
        FiveText fiveText = new FiveText(text1, text2, text3, text4, text5);

        if (session.isNew() || session.getAttribute("textlist")==null){
            fiveTextList = new ArrayList<>();
        } else fiveTextList = (List<FiveText>) session.getAttribute("textlist");
        fiveTextList.add(fiveText);

        session.setAttribute("text", fiveText);
        session.setAttribute("textlist",fiveTextList);
        getServletContext().getRequestDispatcher("/Servlet03.jsp").forward(request,response);

    }
}
