<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 23.01.19
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${cookie.link.value}
    <c:if test="${cookie.link.value.equals('approved')}"> ty chyuju</c:if>
</body>
</html>
