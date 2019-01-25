<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 25.01.19
  Time: 07:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Basket</title>
</head>
<body>
    ${comment}<br>
    <br>
    <form action="/addToBasket" method="post">
        Wprowadz produkt: <input type="text" name="product"><br>
        Wprowadz ilosc:   <input type="number" name="number"><br>
        Wprowadz cene:    <input type="number" name="price"><br>
        <input type="submit" value="add to basket">
    </form>

    <a href="/BasketAll">Zobacz swoj koszyk</a>
</body>
</html>
