package com.bodejidi;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ManageServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse resp)
    throws ServletException,IOException
    {
        resp.getWriter().println("hello manageservlet");
    }
}
