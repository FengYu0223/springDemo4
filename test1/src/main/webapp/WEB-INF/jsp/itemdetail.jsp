﻿<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商品展示下单选购</title>

<link rel="stylesheet" href="css/shouye.css">

<script src="js/jquery-1.8.3.min.js"></script>
<script   src="js/modernizr-custom-v2.7.1.min.js"></script>
<script>
	$(document).ready(function(){
var $miaobian=$('.Xcontent08>div');
var $huantu=$('.Xcontent06>img');
var $miaobian1=$('.Xcontent26>div');
$miaobian.mousemove(function(){miaobian(this);});
$miaobian1.click(function(){miaobian1(this);});
function miaobian(thisMb){
	for(var i=0; i<$miaobian.length; i++){
		$miaobian[i].style.borderColor = '#dedede';
	}
	thisMb.style.borderColor = '#cd2426';

	$huantu[0].src = thisMb.children[0].src;
}
function miaobian1(thisMb1){
	for(var i=0; i<$miaobian1.length; i++){
		$miaobian1[i].style.borderColor = '#dedede';
	}
//		thisMb.style.borderColor = '#cd2426';
	$miaobian.css('border-color','#dedede');
	thisMb1.style.borderColor = '#cd2426';
	$huantu[0].src = thisMb1.children[0].src;
}
		$(".Xcontent33").click(function(){
		var value=parseInt($('.input').val())+1;
		$('.input').val(value);
	})

	$(".Xcontent32").click(function(){	
		var num = $(".input").val()
		if(num>0){
			$(".input").val(num-1);
		}
	})
	})
</script>

</head>
<body>

<div class="Xcontent">
	<ul class="Xcontent01">
		<div class="Xcontent06"><img src="images/shangpinxiangqing/X1.png"></div>
		<ol class="Xcontent08">
			<div class="Xcontent07"><img src="images/shangpinxiangqing/X1.png"></div>
			<div class="Xcontent09"><img src="images/shangpinxiangqing/X7.png"></div>
			<div class="Xcontent10"><img src="images/shangpinxiangqing/X8.png"></div>
			<div class="Xcontent11"><img src="images/shangpinxiangqing/X9.png"></div>
			<div class="Xcontent12"><img src="images/shangpinxiangqing/X10.png"></div>
		</ol>
		<ol class="Xcontent13">
			<div class="Xcontent14"><a href="#"><p>${cs.title}</p></a></div>
			<div class="Xcontent15"><img src="images/shangpinxiangqing/X11.png"></div>
			<div class="Xcontent16"><p>充电5分钟，温暖2小时</p></div>

			<div class="Xcontent17">
				<p class="Xcontent18">售价</p>
				<p class="Xcontent19">￥<span>${cs.price}</span></p>
				<div class="Xcontent20">
					<p class="Xcontent21">促销</p>
					<img src="images/shangpinxiangqing/X12.png">
					<p class="Xcontent22">领610元新年礼券，满再赠好礼</p>
				</div>
				<div class="Xcontent23">
					<p class="Xcontent24">服务</p>
					<p class="Xcontent25">30天无忧退货&nbsp;&nbsp;&nbsp;&nbsp;       48小时快速退款 &nbsp;&nbsp;&nbsp;&nbsp;        满88元免邮</p>
				</div>
				
			</div>
			<div class="Xcontent26">
				<p class="Xcontent27">颜色</p>
				<div class="Xcontent28"><img  src="images/shangpinxiangqing/X14.png"></div>
					<div class="Xcontent29"><img  src="images/shangpinxiangqing/X1.png"></div>
			</div>
			<div class="Xcontent30">
				<p class="Xcontent31">数量</p>
				<div class="Xcontent32"><img src="images/shangpinxiangqing/X15.png"></div>
				<form><input class="input" value="1"></form>
				<div class="Xcontent33"><img src="images/shangpinxiangqing/16.png"></div>
			</div>
			<div class="Xcontent34"><a href="#"><img src="images/shangpinxiangqing/X17.png"></a></div>
			<div class="Xcontent35"><a href="#"><img src="images/shangpinxiangqing/X18.png"></a></div>
		</ol>
	</ul>
</div>
</body>
</html>

