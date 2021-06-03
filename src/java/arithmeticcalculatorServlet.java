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
        
        int resultant =0;
        //set attributes for the JSP 
        request.setAttribute("fNumber",fNumber);
        request.setAttribute("lNumber",lNumber);
        
        if( fNumber == null || fNumber.equals("") || lNumber == null || lNumber.equals("")){
            // this will display the result of the operation to the user
            request.setAttribute("result", "---");
            //this will forward the request to the JSP specified and displays the form
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;//stops code
        }
        //initialize a variable to use in the Switch statement
         
        try{
            
            String plus  = request.getParameter("add");
            String minus = request.getParameter("minus");
            String multiplication = request.getParameter("multiply");
            String modules = request.getParameter("modules");
            
            //parse the number into integers since we want to use them as numbers 
            //and not strings
            int firstNumber = Integer.parseInt(fNumber);
            int secondNumber = Integer.parseInt(lNumber);
            
               //if statement for plus
               //checking if the user has selected them first 
               if (plus !=null){
               resultant =  firstNumber + secondNumber;
                 
               }
                 //if statement for minus
               //checking if the user has selected them first
               // && firstNumber> secondNumber
               //  } else {
                      // request.setAttribute("result", "make sure the first number is "
                              // + "greater please"); 
                   //}
               
               else if (minus !=null ){
                resultant =  firstNumber - secondNumber;
                 
                 
               }
                  //if statement for multiplication
               //checking if the user has selected them first
                  else if (multiplication !=null ){
                resultant =  firstNumber * secondNumber;
                
                 
                  }
               
                  else if (modules !=null){
                resultant =  firstNumber % secondNumber;
                 
                
        }
                //setting the attribite for the result of the operation
                 request.setAttribute("result", resultant); 
               getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);  
           }
              
          catch (NumberFormatException ex){
    // this will display the result of the operation to the user
            request.setAttribute("result", "Invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);  
    
        
    }
    }



