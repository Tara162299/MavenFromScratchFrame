package com.techvify.main;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UserLoginSuccessfully")
public class UserLoginSuccessfully extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        if(userName.equalsIgnoreCase("Quinton") && passWord.equals("Tara162299")) {
            printWriter.print("<html>");
            printWriter.print("<body>");
            printWriter.print("<h3>You are in!</h3>");

            printWriter.print("You have successfully logged in, " + userName);

            printWriter.print("<form action= \"/MavenFromScratchFrame/LoginServlet\" method = 'get'>");
            printWriter.print("<input type=\"submit\" value=\"Logout\">");
            printWriter.print("</form>");
        }

        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();

    }
}
