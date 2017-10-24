<!doctype html>
<%@ page language="java" contentType="text/html;
charset=UTF-8" pageEncoding="UTF-8"
		 import="java.util.List"%>
<%@ page import="java.util.HashMap" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>我的购物车</title>
  <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
	 <script type="text/javascript" src="js/jquery-3.0.0.min.js"></script>
	 <link rel="stylesheet" type="text/css" href="css/car.css">
	 <link rel="stylesheet" type="text/css" href="css/default.css">
 </head>
 <body>
	<div id="wrapper">
		<div class="page-title">
			<span class="modular fr"><a href="itemlist" class="pt-link-btn">产品列表</a></span>
		</div>
		<div id="content">
			<%--<c:forEach items="${carDet}" var="c"  varStatus="status"> 导致li里只有一个checkbox而不是一组--%>
			<div class="goods_lists">
				<ul id="listbox" class="list">
					<c:forEach items="${carDet}" var="c"  varStatus="status">

					<li>
						<div class='checkbox'>
							<div class='c_xz'><img src='images/checkbox.png' width='12' height='12'></div>
						</div>
						<a class='door' href='javascript:void(0);'><img src='images/list2.jpg' width='74' height='74' alt='iphone6s plus' /></a>
						<div class='l_right'>
							<p class='l_r_desc'>${c.title}</p>
							<p class='price'>价格：<span>￥<span class='money'  data-money='3'>${c.price}</span></span></p>
							<p class='old_price'>8888.88</p>
							<div class='l_bot'>
								<p>数量 :</p>
								<a class='remove' href='javascript:void(0);'><img src='images/remove.png' width='15' height='15'></a>
								<input type='text' data-max='10' class='num' value=${c.sortOrder} />
								<%--<input type='text' data-max='10' class='num' value=1 />--%>
								<a class='add' href='javascript:void(0);'><img src='images/add.png' width='15' height='15'></a>
								<a class='rubbish' href='javascript:void(0);'><img src='images/rubbish.png' width='14' height='16'></a>
							</div>
						</div>
					</li>
					</c:forEach>
				</ul>
			</div>

			<div class="checkout">
				<div class="c_left">
					合计(不含运费): <span>￥<span id="sum">0.00</span></span>	
				</div>
				<a href="javascript:">
					<div class="c_right">
					下订单（<span id="count">0</span>）
					</div>
				</a>
			</div>
		</div>
	</div>
	<script type="text/javascript">

            //删除商品
          $('.rubbish').on('click', function () {
           $(this).parents("li").remove();
           tm_total();
              var dtitle=$(this).parents('.l_right').find('.l_r_desc').text();
              alert(dtitle+"将被移出我的购物车");
              $.ajax(
                  {
                      url: "delcar",
                      type: "post",
                      data: {"dtitle": dtitle},
                      dataType: "text",
                  });
	      });

            //商品复选框的选中和不选中
           $('.checkbox').on('click', function () {
           $(this).find(".c_xz").toggle();
           tm_total();
           });

            //商品数量的添加和减少
           $('.add').on('click', function () {
             var $input = $(this).prev();
             var value = $input.val();
             var max = $input.data("max");
             value++;
             if(value > max)value = max;
             $input.val(value);
             tm_total();
            });

          $('.remove').on('click', function () {
            var $input = $(this).next();
            var value = $input.val();
            value--;
            if(value<=0)value=1;
            $input.val(value);
              tm_total();
            });

        //求总和 ,编译时绑定V运行时绑定
        function tm_total(){
            var total = 0;
            $("#listbox").find("li").each(function(){
                var flag = $(this).find(".c_xz").is(":visible");
                if(flag){

                   // var money = $(this).find(".money").data("money"); eq(0).text()
                    var money = $(this).find(".money").eq(0).text();
                    var number = $(this).find(".num").val();
                    total += money * number;

                }
            });
            //求用户购买了多少个商品
            var length =$("#listbox").find(".c_xz:visible").length;
            $("#count").text(length);
            $("#sum").text(total);
		};

           //下单
          $(".c_right").click(function(){
              var length =$("#listbox").find(".c_xz:visible").length;
              if(length>0){
                  var array=new Array();
                  $("#listbox").find("li").each(function(){
                      var flag = $(this).find(".c_xz").is(":visible");
                      if(flag) {
                          var title = $(this).find(".l_r_desc").eq(0).text();
                          var price = $(this).find(".money").eq(0).text();
                          var number = $(this).find(".num").val();
						  /*  $.ajax(
						   {
						   url: "orderlist",
						   type: "post",
						   data: {"title": title, "number": number},
						   dataType: "text",   //返回的数据类型

						   });*/
                          //組裝json
                          var json=new Object();
                          json.title =title;
                          json.price=price;
                          json.number =number;
                          array.push(json);
                          //組裝json結束
                          //轉化json為str
                      }
                  });
                  var jsonStr=JSON.stringify(array);
                  console.log(jsonStr);
                  $.ajax({
                      url: "orderlist",
                      type: "post",
                      data: {jsonStr:jsonStr},
                      dataType: "json",
                      cache: false,
                      success: function (data) {
                         /* window.location.href="ordercheck.jsp" rececheck*/
                          window.location.href="rececheck"
                      }
                  });
              } else {alert("未选择商品！！")}

           });

	</script>
 </body>
</html>