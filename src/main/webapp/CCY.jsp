<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 24.01.19
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>CCY</title>
</head>
<body>
    <form action="/CCY" method="post">
        <input type="number" name="number"><br>
        <input type="radio" name="ccy" value="EURUSD"> EUR -> USD<br>
        <input type="radio" name="ccy" value="USDEUR"> USD -> EUR<br>
        <input type="radio" name="ccy" value="EURPLN"> EUR -> PLN<br>
        <input type="radio" name="ccy" value="PLNEUR"> PLN -> EUR<br>
        <input type="radio" name="ccy" value="USDPLN"> USD -> PLN<br>
        <input type="radio" name="ccy" value="PLNUSD"> PLN -> USD<br>

        <input type="submit">
    </form>
</body>
</html>
