<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>新增产品分类</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style/adminStyle.css" rel="stylesheet" type="text/css" />
</head>
<body>
 <div class="wrap">
  <div class="page-title">
    <span class="modular fl"><i></i><em>添加分类</em></span>
  </div>

  <form action="additem" method="post">
   id:<input type="text" name="id"/><br/>
   title:<input type="text" name="title"/><br/>
   sellPoint:<input type="text" name="sellPoint"/><br/>
   price:<input type="text" name="price"/><br/>
   num:<input type="text" name="num"/><br/>

   <input type="submit" value="提交"/>
  </form>
 </div>
</body>
</html>