<%-- 
    Document   : PageGenerator2
    Created on : Jan 27, 2014, 5:21:36 PM
    Author     : Nathaniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1">
            <% 
                for(int i = 1; i < 4; i++){
                    out.println("<tr>");
                    for(int j = 1; j < 4; j++){
                        out.println("<td> r" + i + " c" + j + "</td>");
                    }
                    out.println("</tr>");
                }
            %>
        </table>
    </body>
</html>
