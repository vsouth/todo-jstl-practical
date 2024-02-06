<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Пользователи</title>
</head>
<body>
<%@include file="navbar.jsp" %>

<div>
    <div class="container">
        <h1>Список пользователей</h1>
        <table>
            <tr>
                <th>id</th>
                <th>login</th>
                <th>password</th>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.login}</td>
                    <td>${user.password}</td>
                </tr>
            </c:forEach>
        </table>
        <form action="users" method="post">
            <input type="text" name="login">
            <button type="submit">OK!</button>
        </form>
    </div>
</div>
</body>
</html>
