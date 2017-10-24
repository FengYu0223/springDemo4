<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html;
          charset=UTF-8" pageEncoding="UTF-8"
		 import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>生成订单进度</title>
	<link rel="stylesheet" type="text/css" href="css/odercheck.css">
	<link  rel="stylesheet" type="text/css" href="css/adminStyle.css" />
	<script type="text/javascript" src='js/jquery-1.7.1.min.js'></script>
	<script type="text/javascript">
        $(function() {
            setTimeout("changeDivStyle();", 100); // 0.1秒后展示结果，因为HTML加载顺序，先加载脚本+样式，再加载body内容。所以加个延时
        });
        function changeDivStyle(){
//		var o_status = $("#o_status").val();	//获取隐藏框值
            var o_status = 2;
            if(o_status==0){
                $('#create').css('background', '#DD0000');
                $('#createText').css('color', '#DD0000');
            }else if(o_status==1||o_status==2){
                $('#check').css('background', '#DD0000');
                $('#checkText').css('color', '#DD0000');
            }else if(o_status==3){
                $('#produce').css('background', '#DD0000');
                $('#produceText').css('color', '#DD0000');
            }else if(o_status==4){
                $('#delivery').css('background', '#DD0000');
                $('#deliveryText').css('color', '#DD0000');
            }else if(o_status>=5){
                $('#received').css('background', '#DD0000');
                $('#receivedText').css('color', '#DD0000');
            }
        }
	</script>
	<link rel="stylesheet" type="text/css" href="css/odercheck.css">

</head>

<body>
<br/>
<br/>
<br/>
<input type="hidden" value=${detailorder.status } id="o_status" /><!--后台传到页面的数据-->
<div class="stepInfo">
	<ul>
		<li></li>
		<li></li>
	</ul>

	<div class="stepIco stepIco1" id="create">1
		<div class="stepText" id="createText">创建订单</div>
	</div>
	<div class="stepIco stepIco2" id="check">2
		<div class="stepText" id="checkText">审核订单</div>
	</div>
	<div class="stepIco stepIco3" id="produce">3
		<div class="stepText" id="produceText">支付</div>
	</div>
	<div class="stepIco stepIco4" id="delivery">4
		<div class="stepText" id="deliveryText">配送</div>
	</div>
	<div class="stepIco stepIco5" id="received">5
		<div class="stepText" id="receivedText">签收</div>
	</div>
</div>
<br/>
<br/>
<div class="wrap" align="center">
	<div class="page-title">
		<span class="modular fl"><i class="edit_user"></i><em>编辑订单人资料</em></span>
	</div>
	<form name="checkform" action="ordercheck" method="post" >
	<table class="list-style">
		<tr>
			<td style="width:15%;text-align:center;">收件人：</td>
			<td><input type="text" class="textBox length-middle" name="rname" required="required"/></td>
		</tr>
		<tr>
			<td style="text-align:center;">收货地址：</td>
			<td><input type="text" class="textBox length-middle" name="raddress" required="required"/></td>
		</tr>
		<tr>
			<td style="text-align:center;">手机号码：</td>
			<td><input type="text" class="textBox length-middle" name="rphone" required="required"/></td>
		</tr>
		<tr>
			<td style="text-align:center;"></td>
			<td><input type="submit" class="tdBtn" value="更新保存"/></td>
		</tr>
	</table>
	</form>
</div>

</body>
</html>
