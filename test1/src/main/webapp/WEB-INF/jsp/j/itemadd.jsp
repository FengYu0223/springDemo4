<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>产品列表</title>
</head>
<body>
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>title</td>
        <td>price</td>
        <td>num</td>
        <td>cid</td>
    </tr>
    <c:forEach items="${cs}" var="c"  varStatus="status"  >
        <tr>
            <td>${c.id}</td>
            <td>${c.title}</td>
            <td>${c.price}</td>
            <td>${c.num}</td>
            <td>${c.cid}</td>
        </tr>
    </c:forEach>

    <td>${c.id}</td>
    <td>${c.title}</td>
    <td>${c.price}</td>
    <td>${c.num}</td>
    <td>${c.cid}</td>
</table>
<%--<form>
    <select class="inline-select">
        <option>A店铺</option>
        <option>B店铺</option>
    </select>
    <input type="text" class="textBox length-long" placeholder="输入产品名称..."/>
    <input type="button" value="查询" class="tdBtn"/>
</form>--%>
<form  action="itemsearch" method="post" >
    输入产品名称:<input type="text" name="title"/><br/><br/><br/>
    <input type="submit" value="查询"/>
</form>
<font color="red">${error}</font>
<br/>

<h1>新增商品</h1>
<form action="additem" method="post">
    id:<input type="text" required="required" name="id"/><br/>
    title:<input type="text" required="required" name="title"/><br/>
    price:<input type="text" required="required" name="price"/><br/>
    num:<input type="text" required="required" name="num"/><br/>
    cid:<input type="text"required="required"  name="cid"/><br/>
    <input type="submit" value="提交"/>
</form>
<font color="red">${error}</font>
<font color="green">${success}</font>
<br/>

<h1>删除商品</h1>
<form  action="deleteitem" method="post" >
    输入产品名称:<input type="text" required="required" name="title"/><br/><br/><br/>
    <input type="submit" value="删除"/>
</form>
<font color="red">${error}</font>

</body>
</html>