<%-- 
    Document   : agecalculator
    Created on : Jun 2, 2021, 10:59:12 AM
    Author     : Sana zi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        
        <h1>Age Calculator</h1>
        
        <form method="post"
    <lable>Enter Your Age: </lable>
    <input type="number" name="AgeNumber" min="1" max="100" 
           placeholder=" A numeric value">  </input>
    <br>
    <input type="submit" value="Age Next Birthday"> </input>
    <br>
    <% https://www.w3schools.com/html/html_links.asp for the hyperlink learning
    %>
    </form>
    
    <a href="/Lab3/arithmetic"> Arithmetic Calculator</a>
    
    <p> ${Message} </p>
    <p> ${AgeMessage} </p>
    
    
    </body>
</html>
