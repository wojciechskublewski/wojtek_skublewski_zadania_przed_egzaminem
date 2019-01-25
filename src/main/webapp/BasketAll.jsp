<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 25.01.19
  Time: 07:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${basket}" var="basket">
        ${basket.product} - ${basket.number} x ${basket.price} = ${basket.number* basket.price}<br>
    </c:forEach>
        Suma : ${sum}

</body>
</html>
