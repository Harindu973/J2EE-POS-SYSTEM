<%-- 
    Document   : login
    Created on : May 4, 2020, 1:55:01 PM
    Author     : Bhashitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/navbar.css">
        <link href="https://fonts.googleapis.com/css2?family=Arvo&family=Baloo+2&family=Fondamento&display=swap" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/loyality.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
        <li class="home"><a href="dashboard.jsp">Dashboard</a></li>
        <li><a href="cashier_reg.jsp">Cashier Registraion</a></li>
        <li><a href="lyality_customer.jsp">Loyality Registraion</a></li>
        <li class="dropdown">
          <a href="javascript:void(0)" class="dropbtn">Products</a>
          <div class="dropdown-content">
            <a href="add.jsp">Add Product</a>
            <a href="edit.jsp">Edit Product</a>
            <a href="content.jsp">Product List</a>
            <a href="#">Discount Update</a>
          </div>
        </li>
        <li class="log"><a href="login.jsp">Logout</a></li>
    </ul>
         <div class="col-md-3">
        <div class="contact-info">
            <h2>Loyality Customer Registration</h2>
            <h4>Add Loyality Customer Details !</h4>
        </div>
    </div>
    <form  action="" method="post">
        <input type="hidden" name="method" value="add">
        <div id="login">
            <div class="text-input">
            <input type="text" name="fname" required="required" placeholder="Full Name" /><br/>
            <input type="text" name="nnic" required="required" placeholder="NIC Number"/><br/>
            <input type="text" name="phone" required="required" placeholder="Phone Number"/><br/>
            <input type="text" name="address" required="required" placeholder="Address"/><br/>
            <input class="button" type="submit" name="submit" value="Register">
            <input class="button" type="reset" name="reset" value="Cancel">
            </div>
        </div>
    </form>
    </body>
</html>
