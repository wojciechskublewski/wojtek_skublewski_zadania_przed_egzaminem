<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 30.01.19
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
</head>
<body>
    <form action="/receiver" method="get">
        <label>Name:
            <input type="text" name="name"><br>
        </label>
        <label>mail:
            <input type="text" name="mail"><br>
        </label>
        <label>id:
            <input type="text" name="id"><br>
        </label>
        <input type="submit">
    </form>
</body>
</html>
