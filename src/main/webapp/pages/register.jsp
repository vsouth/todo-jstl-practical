<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Пользователи</title>
    <style>
        <%@include file="../css/style.css"%>
        <%@include file="../css/profile.css"%>
        <%@include file="../css/register.css"%>
    </style>
</head>
<body>
<%@include file="navbar.jsp" %>

<div>
    <div class="container">
        <h1>Добавить пользователя</h1>
        <form action="register" method="post">
            <div class="register_wrapper">
                <label>
                    Логин:
                    <input required type="text" name="login">
                </label>
                <label>
                    Пароль:
                    <input required type="password" name="password">
                </label>
                <label>
                    Дата рождения:
                    <input required type="date" name="birthday">
                </label>
                <label>
                    Роль:
                    <select required name="role">
                      <option selected value="USER">USER</option>
                      <option value="ADMIN">ADMIN</option>
                    </select>
                </label>
                <button type="submit">OK!</button>
                </div>
        </form>
    </div>
</div>
</body>
</html>
