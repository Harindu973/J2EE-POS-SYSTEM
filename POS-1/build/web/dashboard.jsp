<%-- 
    Document   : dashboard
    Created on : May 3, 2020, 8:54:32 PM
    Author     : Bhashitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://fonts.googleapis.com/css2?family=Arvo&family=Baloo+2&family=Fondamento&display=swap" rel="stylesheet">
        <link href="css/dashboard-1.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DASHBOARD</title>
    </head>
    <body>
        <div class="container">
            <div class="contact-info">
            <h2>Dashboard</h2>
            <h4>Directs to all Sections !</h4>
        </div>
        </div>
        <div class="link-container">
            <a href="add.jsp"><button class="button"><i class="fa fa-plus-square"></i>   Add Products</button></a>
            <a href="edit.jsp"><button class="button"><i class="fa fa-pencil-square" aria-hidden="true"></i> Update/Delete Product</button></a>
            <a href="content.jsp"> <button class="button"><i class="fa fa-th-list" aria-hidden="true"></i> Product Details</button></a>
            <button class="button"><i class="fa fa-percent" aria-hidden="true"></i>Discount Update</button>
            <a href="cashier.jsp"><button class="button"><i class="fa fa-calculator" aria-hidden="true"></i> Cashier</button></a>
            <a href="cashier_reg.jsp"><button class="button"><i class="fa fa-user" aria-hidden="true"></i> Cashier Signup</button></a>
            <a href="lyality_customer.jsp"><button class="button"><i class="fa fa-id-card" aria-hidden="true"></i> Loyality Customer</button></a>
            <button class="button"><i class="fa fa-money" aria-hidden="true"></i> Payment Records</button>
            <button class="button"><i class="fa fa-address-book-o" aria-hidden="true"></i> Loyality Customer Records</button>
            <a href="login.jsp"><button class="button"><i class="fa fa-sign-out" aria-hidden="true"></i>Logout</button></a>
        </div>
    </body>
</html>
