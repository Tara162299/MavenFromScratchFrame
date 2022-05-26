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
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>Login Page</h1>");

        printWriter.print("<form action= \"/MavenFromScratchFrame/UserLoginSuccessfully\" method = 'post'>");
        printWriter.print("<label for=\"userName\">Username:</label><br>");
        printWriter.print("<input type=\"text\" id=\"userName\" name=\"userName\" value=\"\"><br>");
        printWriter.print("<label for=\"passWord\">Password:</label><br>");
        printWriter.print("<input type=\"text\" id=\"passWord\" name=\"passWord\" value=\"\"><br><br>");
        printWriter.print("<input type=\"submit\" value=\"Submit\"><br><br>");
        printWriter.print("<input type=\"forgot password\" value=\"Forgot password\">");
        //printWriter.print("<p for=\"fname\">Forgot password</p><br>");
        printWriter.print("</form>");


        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();

    }
}
