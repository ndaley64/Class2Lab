<%-- 
    Document   : result
    Created on : Jan 27, 2014, 6:15:05 PM
    Author     : Nathaniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area</title>
    </head>
    <body>
    <p>

    <%
        String area = (String)request.getAttribute("area");
        out.print(area);
    %>
    
    <p><a href="calculator.html">Back
    
    </body>
</html>
