<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>编辑会员资料</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link  rel="stylesheet" type="text/css" href="style/adminStyle.css"/>
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="edit_user"></i><em>编辑会员资料</em></span>

   <span class="modular fr"><a href="itemlist" class="pt-link-btn">产品列表</a></span>
   <span class="modular fr">---------</span>
   <span class="modular fr" ><a href="recharge.jsp" class="pt-link-btn">充值</a></span>
  </div>
  <form action="edusered" method="post">
  <table class="list-style">
   <tr>
    <td style="width:15%;text-align:right;">会员昵称：</td>
    <td><input type="text" required="required" name="username"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">旧密码：</td>
    <td><input type="password" required="required" name="password"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">更改密码：</td>
    <td><input type="password"  required="required" name="rpassword"/></td>
   </tr>
   <tr>
    <td style="text-align:right;"></td>
    <td><input type="submit" class="tdBtn" value="更新保存"/></td>
   </tr>
  </table>
  </form>
 </div>
  <font color="red">${message}</font>
</body>
</html>