<%--
  Created by IntelliJ IDEA.
  User: wskublewski
  Date: 27.01.19
  Time: 09:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>airport</title>
</head>
<body>
    <form action="/Airport_1" method="post">
        <label>Wybierz lotnisko odlotu:
        <select name="nameDep"><br>
        <c:forEach items="${airportList}" var="airportList">
            <option value="${airportList.name}">${airportList.name}</option>
        </c:forEach>
        </select>
        </label>
        <br><label>Wybierz lotnisko odlotu:
            <select name="nameArr"><br>
                <c:forEach items="${airportList}" var="airportList">
                    <option value="${airportList.name}">${airportList.name}</option>
                </c:forEach>
            </select>
        </label>
        <br><label>Czas startu:
            <input type="datetime-local" name="timeDep"><br>
        </label>
        <label>Dlugosc lotu:
            <input type="number" name="hours" min="0" step="1"><br>
        </label>
        <label>Cena:
            <input type="number" name="price" min="0" step="0.01"><br>
        </label>
        <br><input type="submit">
    </form>
</body>
</html>
