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
        //validating if the user has inputted any numeric values
        if (!isNumeric(AgeNumba)) {

            //this line gets the id we for the error from the ${---} in jsp code 
            request.setAttribute("Message", "You must enter a number.");
            //send it to display on user's webpage
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }

        //parse the age to only be int type to prevent negative numbers
        int newAge = Integer.parseInt(AgeNumba);
        //now incrementing it to display their age next year 
        newAge++;
        //show this message 
        request.setAttribute("AgeMessage", "Your age next birthday will be " + newAge);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);

    }

    //found how to use this method on the stringUtils package
    public static boolean isNumeric(String numberInput) {

//checks if there is no number or user input in the field
        if (numberInput == null || numberInput.equals("")) {
            //shows this meesage to the user
            System.out.println("You must give your current age");
            return false;
        }

        //by parsing the string inside this method's parameter we make sure it is working and is 
        // ready for validating any value we want -> throws exeption if the value is not
//numeric value 
        try {
            double testNumber = Double.parseDouble(numberInput);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}
