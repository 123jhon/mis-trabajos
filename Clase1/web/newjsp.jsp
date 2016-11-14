<%-- 
    Document   : newjsp
    Created on : 02-nov-2016, 21:03:00
    Author     : jhone
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola Mundo</h1>
        <form name=="Login">
            
            <label> usuario: </label>
            <input type="text" name="usuario" > 
            <label>passowrd</label>
            <input type="password" name="password" > 
            
            <input type="submit" value ="ingresar" >
        </form>
        <br> <a target="a_blank" href="registrar.jsp"> No tienes una cuenta?</a> </br>
        
    </body>
</html>
