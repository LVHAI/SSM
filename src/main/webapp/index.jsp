<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h2>Hello World!</h2>

<%--<a href="getAll">SHow ALL List</a>--%>

    <form action="login">
        用户名:<input type="text" name="userName"/><br/><br/>
        密  码:<input type="password" name="password"/><br/><br/>
        <input type="submit" value="登录">&nbsp;
    </form>
    <a href="register" methods="GET">立即注册</a>
</body>
</html>
