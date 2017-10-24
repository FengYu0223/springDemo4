<!doctype html>
<%@ page language="java" contentType="text/html;
          charset=UTF-8" pageEncoding="UTF-8"
		 import="java.util.List"%>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Document</title>
  <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
	 <link rel="stylesheet" type="text/css" href="css/car.css">
 </head>
 <body>
	<div id="wrapper">
		<div id="content">
			<div class="goods_lists">
				<ul id="listbox" class="list">

					<li>
						<div class='checkbox'>
							<div class='c_xz'><img src='images/checkbox.png' width='12' height='12'></div>
						</div>
						<a class='door' href='javascript:void(0);'><img src='images/list2.jpg' width='74' height='74' alt='iphone6s plus' /></a>
						<div class='l_right'>
							<p class='l_r_desc'>Apple/苹果 iPhone 6s Plus Android6.0操作系统</p>
							<p class='price'>价格：<span>￥<span class='money'  data-money='3999.99'>3999.99</span></span></p>
							<p class='old_price'>5768.00</p>
							<div class='l_bot'>
								<p>数量 :</p>
								<a class='remove' href='javascript:void(0);'><img src='images/remove.png' width='15' height='15'></a>
								<input type='text' data-max='10' class='num' value='1' />
								<a class='add' href='javascript:void(0);'><img src='images/add.png' width='15' height='15'></a>
								<a class='rubbish' href='javascript:void(0);'><img src='images/rubbish.png' width='14' height='16'></a>
							</div>
						</div>
					</li>
				</ul>
			</div>
			<div class="checkout">
				<div class="c_left">
					合计(不含运费): <span>￥<span id="sum">0.00</span></span>	
				</div>
				<a href="javascript:">
					<div class="c_right">
						单子（<span id="count">0</span>）
					</div>
				</a>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		$(function(){
			//删除商品
			$("#listbox").on("click",".rubbish",function(){
				$(this).parents("li").remove();
				tm_total();
			});

			//商品复选框的选中和不选中
			$("#listbox").on("click",".checkbox",function(){
				$(this).find(".c_xz").toggle();
				tm_total();
			});

			//商品数量的添加和减少
			$("#listbox").on("click",".add",function(){
				var $input = $(this).prev();
				var value = $input.val();
				var max = $input.data("max");
				value++;
				if(value > max)value = max;
				$input.val(value);	
				tm_total();
			}).on("click",".remove",function(){
				var $input = $(this).next();
				var value = $input.val();
				value--;
				if(value<=0)value=1;
				$input.val(value);	
				tm_total();
			});
		});

		//求总和
		function tm_total(){
			var total = 0;
			$("#listbox").find("li").each(function(){
				var flag = $(this).find(".c_xz").is(":visible");
				if(flag){
					var money = $(this).find(".money").data("money");
					var number = $(this).find(".num").val();
					total += money * number;
				}
			});
			//求用户购买了多少个商品
			var length =$("#listbox").find(".c_xz:visible").length;
			$("#count").text(length);
			$("#sum").text(total);
		};
	</script>
 </body>
</html>