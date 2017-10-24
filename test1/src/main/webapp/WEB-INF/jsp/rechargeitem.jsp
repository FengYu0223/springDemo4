<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>充值 jsp</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="css/odercheck.css">
    <link  rel="stylesheet" type="text/css" href="css/adminStyle.css"/>
    <script type="text/javascript" src='js/jquery-1.7.1.min.js'></script>

</head>
<body>

<br/>
<br/>
<div class="wrap" align="center">
    <div class="page-title">
        <span class="modular fl"><i class="edit_user"></i><em>账户充值</em></span>
        <span class="modular fr"><a href="itemlist" class="pt-link-btn">产品列表</a></span>
    </div>
    <form name="rechargeform" action="rechargeitemed" method="post" >
        <table class="list-style">
            <tr>
                <td style="width:15%;text-align:right;"> 账号：</td>
                <td><input type="text" required="required" name="username" /></td>
            </tr>
            <tr>
                <td style="text-align:right;">密码：</td>
                <td><input type="password" required="required" name="password"/></td>
            </tr>
            <tr>
                <td style="text-align:right;">充值金额：</td>
                <td><input type="text" required="required" name="recharge"/></td>
            </tr>
            <tr>
                <td style="text-align:right;"></td>
                <td><input type="submit" class="tdBtn" value="确认充值"/></td>
            </tr>
        </table>
    </form>
    <font color="red">${message}</font>

</div>
</body>
</html>