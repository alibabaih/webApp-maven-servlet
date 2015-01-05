package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s") // this servlet will be accessible by http://localhost:8080/s
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) // post request
            throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) // get request
            throws ServletException, IOException {
        response.setContentType("text/html");

        String varTextA = "Hello World!";
        request.setAttribute("textA", varTextA);
        String varTextB = "It JSP.";
        request.setAttribute("textB", varTextB);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}
//and add this servlet on jsp page (index.jsp)
