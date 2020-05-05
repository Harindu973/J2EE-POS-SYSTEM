<%--
  Created by IntelliJ IDEA.
  User: 94545
  Date: 2018/1/20
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/navbar.css">
    <link href="https://fonts.googleapis.com/css2?family=Arvo&family=Baloo+2&family=Fondamento&display=swap" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/edit-1.css">
    <title>Edit Product</title>
</head>
<body>
    <ul>
        <li class="home"><a href="dashboard.jsp">Dashboard</a></li>
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
    <div class="col-md-3">
        <div class="contact-info">
            <h2>Product Details</h2>
            <h4>Update or Delete product details !</h4>
        </div>
    </div>
    <form  action="ProductServlet" method="post">
        <input type="hidden" name="method" value="edit"/>
        <input type="hidden" name="id" value="${product.id}">
        <div id="edit">
            <div class="text-input">
            <input type="text" name="barcode" required="required" placeholder="Barcode" value="${product.barcode}"/>
            <input class="btn-search" type="submit" name="Search" value="Search" />
            <input type="text" name="name" required="required" placeholder="Name" value="${product.name}"/>
            <input type="text" name="units" required="required" placeholder="Units" value="${product.units}"/>
            <input type="text" name="purchasePrice" required="required" placeholder="PurchasePrice" value="${product.purchasePrice}"/>
            <input type="text" name="salePrice" required="required" placeholder="SalePrice" value="${product.salePrice}"/>
            <input type="text" name="inventory" required="required" placeholder="Inventory" value="${product.inventory}"/>
            <input class="button" type="submit" name="submit" value="Update"/>
            <input class="button" type="submit" name="submit" value="Delete"/>
            <input class="button" type="reset" name="reset" value="Cancel"/>
            </div>
        </div>
    </form>
</body>
</html>
