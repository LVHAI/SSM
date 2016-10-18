<%--
  Created by IntelliJ IDEA.
  User: Josh_Lv
  Date: 16/10/18
  Time: 下午9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Regiest</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-3.1.0.min.js"></script>
    <script type="text/javascript">
        alert("${pageContext.request.contextPath}");
        alert("123456");
        function toSubmit(){
            alert("456");
        };
    </script>
</head>
<body>
    <form action="regiest" method="post">
        手机号:<input type="text" name="userName" class="userName" onblur="getNeme(this.value)"/><br/><br/>
        密  码:<input type="password" name="password"/><br/><br/>
        <input type="submit" value="登录">&nbsp;
    </form>
</body>
</html>
