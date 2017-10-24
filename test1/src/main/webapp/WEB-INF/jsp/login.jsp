
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>用户登录</title>
    <script>
        function validateForm() {
            var x = document.forms["loginform"]["username"].value;
            var y = document.forms["loginform"]["password"].value;
            if (x == null || x == ""||y== null ) {
                alert("错误：输入的姓名或密码为空！");
                return false;
            }
        }
    </script>
    <meta name="robots" content="nofollow"/>
    <link href="css/adminStyle.css" rel="stylesheet" type="text/css" />
</head>
<body>
<section class="loginform">
    <h1>用户登录</h1>
    <form name="loginform" action="login3" method="post" onsubmit="return validateForm()" >
        <label>账号：</label><input type="text" required="required"  name="username"/><br/><br/><br/>
        <label>密码：</label><input type="password" required="required" name="password"/><br/>
        <input type="submit" value="提交"/>
    </form>
</section>
    <a href="index.jsp">index</a>
    <font color="red">${error}</font>

</body>
</html>