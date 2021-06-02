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






public class AgeCalculatorServlet extends HttpServlet {
    
    
    

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String AgeNumba = request.getParameter("AgeNumber");
        
        request.setAttribute("AgeNumba", AgeNumba);
        
        //validating if the user has inputted any 
        if(!isNumeric(AgeNumba)){
            
        }
        
        
    }
    
    //found how to use this method on the stringUtils package
public static boolean isNumeric(String numberInput){

//checks if there is no number or user input in the field
 if( numberInput== null || numberInput.equals("")){
   //shows the meesage to the user 
   System.out.println("You must give your current age");
return false;
}
 return false;
}
}
