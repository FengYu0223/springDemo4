<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>产品管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i class="add"></i><em>编辑/添加产品</em></span>
    <span class="modular fr"><a href="itemlist" class="pt-link-btn">产品列表</a></span>
  </div>
  <form action="additemed">
  <table class="list-style">
   <tr>
    <td style="text-align:right;width:15%;">产品名称：</td>
    <td><input type="text" name="title"/></td>
   </tr>
   <tr>
    <td style="text-align:right;">市场价：</td>
    <td>
     <input type="text" name="price"/>
     <span>元</span>
    </td>
   </tr>
   <tr>
    <td style="text-align:right;">会员价：</td>
    <td>
     <input type="text" class="textBox length-short"/>
     <span>元</span>
    </td>
   </tr>
   <tr>
    <td style="text-align:right;">库存：</td>
    <td>
     <input type="text" name="num"/>
     <span>台</span>
    </td>
   </tr>
   <tr>
    <td style="text-align:right;">产品关键词：</td>
    <td><input type="text" class="textBox length-long"/></td>
   </tr>
    <td style="text-align:right;"></td>
    <td><input type="submit" value="发布新商品" class="tdBtn"/></td>
   </tr>
  </table>
  </form>
 </div>
</body>
</html>