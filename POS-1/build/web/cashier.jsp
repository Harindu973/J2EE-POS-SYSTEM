<%-- 
    Document   : cashier
    Created on : May 4, 2020, 11:51:39 PM
    Author     : Bhashitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://fonts.googleapis.com/css2?family=Arvo&family=Baloo+2&family=Fondamento&display=swap" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/navbar.css"/>
        <link rel="stylesheet" href="css/cashier.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
        <li class="home"><a href="dashboard.jsp">Dashboard</a></li>
        <li><a href="cashier.jsp">Cashier</a></li>
        <li><a href="content.jsp">Product List</a></li>
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
        <div class="table-container">
            <table border="1" id="customers">
                <thead>
                    <tr>
                        <th>Item Name</th>
                        <th>Unit Price</th>
                        <th>Buying Ammount</th>
                        <th>Discount</th>
                        <th>Total Cost</th>
                    </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
        <div class="customer-container">
            <h3 align="center">Loyality Customer</h5>
            <input type="checkbox" name="loyality" value="Loyality Customer" /><br>
            <input type="text" name="phone" placeholder="Phone Number" /><br>
            <input type="text" name="cname" placeholder="Customer Name" />
        </div>
        <div class="calculation">
            <input class="txt-cal" type="text" name="barcode" required="required" placeholder="Item Code" />
            <input class="button" type="submit" value="Add" name="finsh" /><br>
            <input class="txt-cal" type="text" name="name" required="required" placeholder="Name"/>
            <input class="button" type="submit" value="End Process" name="finsh" />
            <input class="txt-cal" type="text" name="units" required="required" placeholder="Unit Price"/><br/>
            <input class="txt-cal" type="text" name="purchasePrice" required="required" placeholder="Ammount"/><br/>
            <input class="txt-cal-1" type="text"  class="total" name="salePrice" required="required" placeholder="Cost" /><br/>
        </div>
        <div class="img-container">
            contain a item image
        </div>
    </body>
</html>
