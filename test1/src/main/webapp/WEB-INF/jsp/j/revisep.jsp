<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>修改密码 web</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

</head>
<body>
<span class="modular fl"><i class="user"></i><em>修改密码jsp</em></span>
<form name="reform" action="/manage/revisep" method="post"  >
    账号：
    <input type="text" required="required" name="username"/> <br/>
    旧密码：
    <input type="password" required="required" name="password"/>  <br/>
    新密码：
    <input type="password" required="required" name="rpassword"/>  <br/>
    <input type="submit" class="tdBtn" value="保存"/>
</form>
</body>
</html>