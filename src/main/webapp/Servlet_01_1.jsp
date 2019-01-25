<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 25.01.19
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        ${czesc},
    <c:if test="${isCookie==false}">
        wybierz jezyk: <br>
    <form action="/Servlet_01_2" method="post">
        <c:forEach items="${langMap}" var="langMap">
            <input type="radio" name="language" value="${langMap.key}"> ${langMap} <br>
        </c:forEach>
        <input type="submit">
    </form>
    </c:if>
</body>
</html>
