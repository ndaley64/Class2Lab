package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CalculatorService;

/**
 *
 * @author Nathaniel
 */
@WebServlet(name = "welcomeController", urlPatterns = {"/calculator"})
public class CalculatorController extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method. Not currently used.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    } // </editor-fold>

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        CalculatorService cs = new CalculatorService();
        
        String calcType = request.getParameter("calcType");
        double area = 0;
        
        if(calcType.equals("rectangle")){
            double length = Double.parseDouble(request.getParameter("length"));
            double width = Double.parseDouble(request.getParameter("width"));
            area = cs.getRectangleArea(length, width);
        }else if(calcType.equals("circle")){
            double radius = Double.parseDouble(request.getParameter("radius"));
            area = cs.getCircleArea(radius);
        }else if(calcType.equals("triangle")){
            double base = Double.parseDouble(request.getParameter("base"));
            double height = Double.parseDouble(request.getParameter("height"));
            area = cs.getTriangleArea(base, height);
        }

        request.setAttribute("area", area);

        RequestDispatcher view
                = request.getRequestDispatcher("calculatorResult.jsp");
        view.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Main Controller";
    }// </editor-fold>

}
