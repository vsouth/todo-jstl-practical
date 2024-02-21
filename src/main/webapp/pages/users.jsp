<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Пользователи</title>
    <style>
        <%@include file="../css/style.css"%>
        <%@include file="../css/users.css"%>
    </style>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
</head>
<body>
<%@include file="navbar.jsp" %>

<div>
    <div class="container">
        <h1>Список пользователей</h1>
        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>login</th>
                    <th>birthday</th>
                    <th>role</th>
                    <c:if test="${current_user.role == 'ADMIN'}">
                        <th></th>
                    </c:if>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.login}</td>
                        <td>${user.birthday}</td>
                        <td>${user.role}</td>

                        <c:if test="${current_user.role == 'ADMIN'}">
                            <td>
                                <a href="profile?id=${user.id}">
                                    <div>
                                        <span class="material-symbols-outlined">
                                            account_circle
                                        </span>
                                    </div>
                                </a>
                            </td>
                        </c:if>

                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
