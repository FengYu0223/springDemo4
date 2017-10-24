<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>产品列表</title>

    <script src="js/jquery-3.1.1.min.js"></script>

</head>
<body>

<table id="tb1" align='center' border='1' cellspacing='0'>
    <tr align="center">
        <th>id</th>
        <th>itemId</th>
        <th>orderId</th>
        <th>title</th>
        <th>price</th>
        <th> receiverAddress</th>
        <th> receiverPhone</th>

    </tr>

    <c:set var="sum" value="0"></c:set>
    <c:forEach items="${setlis}" var="c"  varStatus="status"   >
    <tr align="center">
        <td> ${c.id}</td>
        <td> ${c.itemId} </td>
        <td> ${c.orderId}</td>
        <td> ${c.title}</td>
        <td > ${c.price}</td>
        <td> ${c.receiverAddress}</td>
        <td> ${c.receiverPhone}</td>
            <c:set var="sum" value="${sum+c.price}"></c:set>

    </tr>
    </c:forEach>
    <%--colspan合并单元格--%>
    <tr><th colspan="7">total :${sum }</th></tr>
</table>

</body>
</html>