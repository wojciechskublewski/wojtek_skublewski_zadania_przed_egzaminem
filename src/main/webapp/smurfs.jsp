<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 30.01.19
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>smerfy</title>
</head>
<body>
    Smurfy:<br>
    <c:forEach var="smurfs" items="${smurfs}">
        ${smurfs.name}, ${smurfs.attribute}, ${smurfs.description} <br>
    </c:forEach>
</body>
</html>
