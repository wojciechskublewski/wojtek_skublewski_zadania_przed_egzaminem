<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 25.01.19
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="someName" value="Witaj w coderslab."/>



<c:if test = "${fn:contains(someName, 'coderslab')}">
<p>Ok jest codeslab<p>
    </c:if>



</body>
</html>
