<!doctype html>
<%@ page language="java" contentType="text/html;
charset=UTF-8" pageEncoding="UTF-8"
		 import="java.util.List"%>
<%@ page import="java.util.HashMap" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>手机商城</title>
<link rel="stylesheet" type="text/css" href="css/reset.css" />
<link rel="stylesheet" type="text/css" href="css/default.css">

<!--主要样式-->
<link rel="stylesheet" type="text/css" href="css/styles.css">

<!--[if IE]>
	<script src="http://libs.useso.com/js/html5shiv/3.7/html5shiv.min.js"></script>
<![endif]-->

</head>
<body>

<div class="wrapper">
	<h1 class="title">Phone Stock</h1>
	<span class="car" ><i class="shopping-cart"><a href="car">...</a></i></span>

	<div class="page-title" align="center">
		<span class="modular fr"><a href="additem" class="pt-link-btn">编辑商品</a></span>
	</div>
	<div class="page-title" align="center">
		<span class="modular fr"><a href="eduser" class="pt-link-btn">管理用户</a></span>
	</div>

	<div class="clear"></div>
	<!-- items -->
		<c:forEach items="${cs}" var="c"  varStatus="status">

			<div class="items">
		 <div class="item">
			<img src="img/droid-x.jpg" alt="item" />
			 <h2>${c.title}</h2>
			<p>Price:￥ <em>${c.price}</em></p>
			<button class="add-to-cart" type="button">加入购物车</button>
		</div>
	</div>
		</c:forEach>

	<a href="car.jsp">car</a>
	<font color="red">${message}</font>
</div>

<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src='js/jquery-ui.min.js'></script>
<script type="text/javascript">
$('.add-to-cart').on('click', function () {
	var cart = $('.shopping-cart');
	var imgtodrag = $(this).parent('.item').find('img').eq(0);
	if (imgtodrag) {

		var imgclone = imgtodrag.clone().offset({
			top: imgtodrag.offset().top,
			left: imgtodrag.offset().left
		}).css({
			'opacity': '0.5',
			'position': 'absolute',
			'height': '150px',
			'width': '150px',
			'z-index': '100'
		}).appendTo($('body')).animate({

			'top': cart.offset().top + 10,
			'left': cart.offset().left + 10,
			'width': 75,
			'height': 75
		}, 1000, 'easeInOutExpo');
		setTimeout(function () {
			cart.effect('shake', { times: 2 }, 200);
		}, 1500);
		imgclone.animate({
			'width': 0,
			'height': 0
		}, function () {
			$(this).detach();
		});
	}
   /* alert( $(this).parent('.item').find('h2').eq(0).text());*/
   var title=$(this).parent('.item').find('h2').eq(0).text();
   var price=$(this).parent('.item').find('em').eq(0).text();
    $.ajax(
        {
            url: "addcar",
            type: "post",
            data: {"title": title,"price":price},
            dataType: "text",  //返回的数据类型
            //ajax在调用controller之后会根据
            // XMLHttpRequest对象发送请求，该对象有四个状态（readyState）执行success或error
            /*success: function (data) {  //返回的数据变量data
                alert(data+":加入！");
            },*/
            error: function (data) {
                alert("加入失败："+data);
            }
        });
});
</script>
</body>
</html>