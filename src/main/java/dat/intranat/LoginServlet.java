package dat.intranat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Først modtager vi requestværdier fra en input form

        String name = request.getParameter("login");
        String password = request.getParameter("password");

        //Gem login.navn/værdi i request-objektet
        //request.setAttribute("login", login);
        //Forward til index.jsp siden
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
