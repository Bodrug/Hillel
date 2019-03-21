package ua.hillel.bodrug.lesson29;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class myWebApp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String string = "<HTML>"+
                "<HEAD>"+
                "<TITLE>"+
                "First page"+
                "</TITLE>"+
                "</HEAD>"+
                "<BODY>"+
                "<H1>"+
                "<Hello amigos \n>"+ LocalDateTime.now()+
                "<H1>"+
                "</BODY>"+
                "";
        final PrintWriter printWriter = resp.getWriter();
        printWriter.println(string);

    }
 }
