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
            <div class="navbar_title">
                <c:choose>
                    <c:when test="${user != null}">
                        ${user.login}, хэллоу!
                    </c:when>
                    <c:otherwise>
                        Добро пожаловать!
                    </c:otherwise>
                </c:choose>
<%--                <c:if test="${user != null}">--%>
<%--                    Ты вошел!--%>
<%--                </c:if>--%>
            </div>
        </nav>
    </div>
</div>
</body>
</html>
