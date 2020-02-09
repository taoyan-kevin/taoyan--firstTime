package org.smart4j.chapter1;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello" )

public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTimes = dateFormat.format(new Date());
        System.out.print(currentTimes);
        req.setAttribute("currentTime",currentTimes);
        req.getRequestDispatcher("/JSP/hello.jsp").forward(req,resp);
        
    }
}
