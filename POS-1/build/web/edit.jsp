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
    <link href="https://fonts.googleapis.com/css2?family=Arvo&family=Baloo+2&family=Fondamento&display=swap" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/edit-1.css">
    <title>Edit Product</title>
</head>
<body>
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
