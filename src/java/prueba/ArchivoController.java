/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniela
 */
//@WebServlet(name = "archivoController", urlPatterns = {"/archivoController"})
@WebServlet("/archivoController")
public class ArchivoController extends HttpServlet {
     public ArchivoController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String action = request.getParameter("action");
            System.out.println(action);
            switch (action) {
                case "subir":
                    subir(request, response);
                    break;
            }
        } catch (SQLException ex) {
             Logger.getLogger(ArchivoController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet archivoController</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet archivoController at " + request.getParameter("csv1")+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    private void subir(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String csv1 = request.getParameter("csv1");
    }
}
