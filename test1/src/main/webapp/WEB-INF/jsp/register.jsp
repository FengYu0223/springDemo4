<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>用户注册</title>
    <meta name="robots" content="nofollow"/>
    <link href="css/adminStyle.css" rel="stylesheet" type="text/css" />
</head>
<body>
<section class="loginform">
    <h1>用户注册</h1>
    <form action="register2.do" method="post">
        <label>账号：</label><input type="text" required="required"  name="username"/><br/><br/><br/>
        <label>密码：</label><input type="password" required="required"  name="password"/><br/>
        <input type="submit" value="提交"/>
    </form>
</section>
    <a href="index.jsp">index</a>
    <font color="green">${success}</font>
    <font color="red">${error}</font>
</body>
</html>
