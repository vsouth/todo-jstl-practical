<%--
  Created by IntelliJ IDEA.
  User: astop
  Date: 31.01.2024
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Авторизация</title>
    <style>
        <%@include file="../css/style.css"%>
        <%@include file="../css/login.css"%>
    </style>
</head>
<body>
<%@include file="navbar.jsp" %>
<div class="login">
    <div class="container">
        <form class="login_form" method="post" action="login">
            <div class="login_wrapper">
                <input type="text" placeholder="Press login..." name="login">
                <input type="password" placeholder="Press pass.." name="password">
                <button type="submit">Login</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
