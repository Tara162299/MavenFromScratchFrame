package com.techvify.main;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        printWriter.print("<html>");
        printWriter.print("<body>");

        printWriter.print("<h1>Login Page</h1>");
        printWriter.print("<p> Username :: " + userName + "</p>");
        printWriter.print("<p> Password :: " + passWord + "</p>");

        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();

        System.out.println("Username :: " + userName);
        System.out.println("Password :: " + passWord);
    }
}
