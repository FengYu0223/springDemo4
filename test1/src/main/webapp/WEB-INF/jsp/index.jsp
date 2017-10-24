
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="robots" content="nofollow"/>
    <link href="css/adminStyle.css" rel="stylesheet" type="text/css" />
    <style>
        body{width:100%;height:100%;overflow:hidden;background:url(img/pc_loginBg.jpg) no-repeat;background-size:cover;position:absolute;}
    </style>

    <script>
        $(document).ready(function() {
            $('body').particleground({
                dotColor:'green',
                lineColor:'#c9ec6e'
            });
            $('.intro').css({
                'margin-top': -($('.intro').height() /2)
            });
        });
    </script>
</head>
<body>
<section class="loginform">
<h2>Hello World! </h2>
<a href="login">登录</a>
<a href="register">注册</a>
</section>
</body>
</html>