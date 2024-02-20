<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Пользователи</title>
    <style>
        <%@include file="../css/style.css"%>
        <%@include file="../css/profile.css"%>
    </style>
</head>
<body>
<%@include file="navbar.jsp" %>

<div>
    <div class="container">
        <h1>Профиль</h1>
        <div class="profile_container">
            <div class="image_container">
                <img src="../images/img.png" class="avatar"/>
            </div>
            <div class="info_container">
                <p>
                    <b>ID: </b>
                    <c:out value="${info.id}" />
                </p>
                <p>
                    <b>Логин: </b>
                    <c:out value="${info.login}" />
                </p>
                <p>
                    <b>Пароль: </b>
                    <c:out value="${info.password}" />
                </p>
                <p>
                    <b>Дата рождения: </b>
                    <c:out value="${info.birthday}" />
                </p>
                <p>
                    <b>Роль: </b>
                    <c:out value="${info.role}" />
                </p>
            </div>
        </div>
    </div>
</div>
</body>
</html>
