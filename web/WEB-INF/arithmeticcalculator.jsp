<%-- 
    Document   : arithmeticcalculator
    Created on : Jun 2, 2021, 7:22:00 PM
    Author     : 850354
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
           <h1>Arithmetic Calculator</h1>
        
        <form method="post"
    <lable>First: </lable>
    <input type="number" name="FirstNumber" min="1" max="100" 
           placeholder=" A numeric value">  </input>
    <br>
    <lable>Last: </lable>
    <input type="number" name="LastNumber" min="1" max="100" 
           placeholder=" A numeric value">  </input>
    <br>
    
    
  <input type="submit" value="+" name="mathematics"> </input>
  <input type="submit" value="-" name="mathematics"> </input>
  <input type="submit" value="*" name="mathematics"> </input>
  <input type="submit" value="%" name="mathematics"> </input>
   
  
  
    </form>
           
    <% https://www.w3schools.com/html/html_links.asp for the hyperlink learning
    %>
    
    <a href="/Lab3/Age"> Age Calculator</a>
     
    
    <p> Result: ${Result} </p>
    
    </body>
</html>
