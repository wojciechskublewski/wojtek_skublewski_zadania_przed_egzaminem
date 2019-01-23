<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 23.01.19
  Time: 08:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>allquotes</title>
</head>
<body>

    <table>
        <c:forEach items="${quotes}" var="quotes">
            <tr>
            <td>${quotes.author}, ${quotes.content}<td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
