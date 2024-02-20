<%--
  Created by IntelliJ IDEA.
  User: astop
  Date: 31.01.2024
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Навигационная панель</title>
    <style>
        <%@include file="../css/style.css"%>
        <%@include file="../css/navbar.css"%>
    </style>
</head>
<body>
<div class="navbar">
    <div class="container">
        <nav>
            <c:choose>
                <c:when test="${user.role == 'ADMIN'}">
                    <div class="links_container">
                        <div class="left_links">
                            <a href="/users">Список пользователей</a>
                            <a href="/register">Создать пользователя</a>
                        </div>
                        <div class="right_links">
                            <a href="/logout">Выйти</a>
                        </div>
                    </div>
                </c:when>
                <c:when test="${user.role == 'USER'}">
                    <div class="links_container">
                        <div class="left_links">
                            <a href="profile?id=${user.id}">Профиль</a>
                            <a href="/tasks">Список дел</a>
                        </div>
                        <div class="right_links">
                            <a href="/logout">Выйти</a>
                        </div>
                    </div>
                </c:when>
                <c:otherwise>
                    <div class="navbar_title">
                        Добро пожаловать!
                    </div>
                </c:otherwise>
            </c:choose>
        </nav>
    </div>
</div>
</body>
</html>
