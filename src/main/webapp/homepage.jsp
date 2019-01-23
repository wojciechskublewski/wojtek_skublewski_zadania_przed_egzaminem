<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 23.01.19
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>cookie</title>
</head>
<body>

    <c:if test="${link==false}"><a href="/homepagesetcookie">Ta strona zawiera pliki cookies jak w nia klikniesz zaakeptujesz</a><br></c:if>
    <c:if test="${link==true}">Cookies all good</a><br></c:if>


</body>
</html>
