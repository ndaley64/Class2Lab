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
        <title>Welcome Message</title>
    </head>
    <body>
    <p>

    <%
        String welcome = (String)request.getAttribute("welcomeMessage");
        out.print(welcome);
    %>
    
    <p><a href="welcome.html">Back
    
    </body>
</html>
