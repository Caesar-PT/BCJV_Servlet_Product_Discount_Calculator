<%--
  Created by IntelliJ IDEA.
  User: thanh
  Date: 01/02/2021
  Time: 2:45 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form method="post" action="/display-discount">
    <input type="text" name="pd"  placeholder="Product Description"><br>
    <input type="text" name="lp" placeholder="List Price"><br>
    <input type="text" name="dp" placeholder="Discount Percent"><br>
    <button>Calculate Discount</button>
  </form>
  </body>
</html>
