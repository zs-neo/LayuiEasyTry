<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>
</head>
<body>
    <div id="login">
        <h1>Login</h1>
        <form method="post" action="/control/login">
            <input type="text" required="required" placeholder="用户名" name="u"></input>
            <input type="password" required="required" placeholder="密码" name="p"></input>
            <button class="but" type="submit" >登录</button>
            <!--<a href="WEB-INF/JSP/index.jsp">进入页面</a>-->
        </form>
    </div>
</body>
</html>
