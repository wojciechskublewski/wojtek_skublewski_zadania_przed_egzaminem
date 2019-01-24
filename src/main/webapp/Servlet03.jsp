<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 24.01.19
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form method="get" action="Servlet03">
            <input type="text" name="text1" value="${text.text1}"><br>
            <input type="text" name="text2" value="${text.text2}"><br>
            <input type="text" name="text3" value="${text.text3}"><br>
            <input type="text" name="text4" value="${text.text4}"><br>
            <input type="text" name="text5" value="${text.text5}"><br>

            <input type="submit"><br>
        </form>

        ${text.text1}
</body>
</html>
