package com.bodejidi;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class ManageServlet extends HttpServlet{
     public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,java.io.IOException
     {
         
/*		 //resp.getWriter().println("hello world!!!");    
         String firstName = req.getParameter("first_name");
         String lastName = req.getParameter("last_name");
		try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }
		

        Connection conn = null;
        Statement stmt = null;

        try {
            conn =
                DriverManager.getConnection("jdbc:mysql://localhost/test?"
                                            + "user=root"
                                            + "&password=");
			resp.getWriter().println("Add " + firstName + " " + lastName + " success!");	
         }
catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            resp.getWriter().println("Error!");
        } finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                    // ignore
                }
                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                    // ignore
                }
                conn = null;
            }
         		 
     }
	 
	 */
	 }
	 
	 public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
     {
         //resp.getWriter().println("hello world!!!");    
         String firstName = req.getParameter("first_name");
         String lastName = req.getParameter("last_name");
		try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }
		

        Connection conn = null;
        Statement stmt = null;

        try {
            conn =
                DriverManager.getConnection("jdbc:mysql://localhost/test?"
                                            + "user=root"
                                            + "&password=");
			stmt = conn.createStatement();
			String sql = "insert into member(first_name,last_name,date_created,last_updated)"+ "VALUES('" + firstName + "', '" + lastName + "', now(), now());";
			System.out.println("SQL"+sql);
			stmt.execute(sql);
			resp.getWriter().println("Add " +firstName + lastName+" success!");	
         }
catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            resp.getWriter().println("Error!");
        } finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                    // ignore
                }
                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                    // ignore
                }
                conn = null;
            }
        }		 
			 
    
}

}