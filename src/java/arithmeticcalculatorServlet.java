/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 850354
 */
public class arithmeticcalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //creating the string
        String fNumber = request.getParameter("firstNumber");
        String lNumber = request.getParameter("lastNumber");
        String  math  = request.getParameter("mathematics");
        
        //set attributes for the JSP 
        request.setAttribute("fNumber",fNumber);
        request.setAttribute("lNumber",lNumber);
        
        if( fNumber == null || fNumber.equals("") || lNumber == null || lNumber.equals("")){
            // this will display the result of the operation to the user
            request.setAttribute("result", "Invalid");
            //this will forward the request to the JSP specified and displays the form
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;//stops code
        }
        //initialize a variable to use in the Switch statement
        int resultant =0; 
        try{
            //parse the number into integers since we want to use them as numbers 
            //and not strings
            int firstNumber = Integer.parseInt(fNumber);
            int secondNumber = Integer.parseInt(lNumber);
            
            //create a switch statement to go thru each math operation and decide 
            //what to do for each button/submit
           switch (buttons){
               case"+":
                   
           } 
        }catch()
        
    }

}
