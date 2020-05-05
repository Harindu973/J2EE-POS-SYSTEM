<%-- 
    Document   : login
    Created on : May 4, 2020, 2:11:25 PM
    Author     : Bhashitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/css2?family=Arvo&family=Baloo+2&family=Fondamento&display=swap" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/loyality.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="col-md-3">
        <div class="contact-info">
            <h2>Login</h2>
            <h4>Enter NIC and Password to start the Day!</h4>
        </div>
    </div>
    <form  action="" method="post">
        <input type="hidden" name="method" value="add">
        <div id="login">
            <div class="text-input">
            <input type="text" name="nnic" required="required" placeholder="NIC Number"/><br/>
            <input type="password" name="phone" required="required" placeholder="Pasword"/><br/>
            <input class="button" type="submit" name="submit" value="Login">
            <input class="button" type="reset" name="reset" value="Cancel">
            </div>
        </div>
    </body>
</html>
