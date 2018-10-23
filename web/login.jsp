<%--
  Created by IntelliJ IDEA.
  User: Iklasov Duman
  Date: 02.10.2018
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>

<h1>Please, login: </h1>

<form action="/login" method="post">
    login-name: <input type="text" name="loginname" width="30"/>
    password: <input type="password" name="password" width="10"/>
    <input type="submit" value="Login"/>
</form>
    <p style="color:red;">${errorMessage}</p>
</body>
</html>
