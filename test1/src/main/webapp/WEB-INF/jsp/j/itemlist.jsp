<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html;
          charset=UTF-8" pageEncoding="UTF-8"
         import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>产品列表</title>

   <%-- <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>--%>
    <script src="js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript">
        function btnDel(node) {
            /*   按钮的父节点的父节点是tr。*/
            var tr1 = node.parentNode.parentNode;
            // alert(tr1.rowIndex); 获取每一行
            var itemId = tr1.cells[0].innerText;
            alert(itemId);
            if (confirm("确认删除?")) {
                $.ajax(
                    {
                        url: "deleteitem",
                        type: "post",
                        data: {"itemId": itemId},
                        dataType: "text",  //返回的数据类型
                        //ajax在调用controller之后会根据
                        // XMLHttpRequest对象发送请求，该对象有四个状态（readyState）执行success或error
                        success: function (data) {  //返回的数据变量data
                            alert(data+":商品删除！");
                            tr1.remove();
                        },
                        error: function (data) {
                            alert("error"+data);
                        }
                    });
            }
        }

        function btnOrd(node) {
            var tr1 = node.parentNode.parentNode;
            // alert(tr1.rowIndex); 获取每一行
            var itemId = tr1.cells[0].innerText;
            var title = tr1.cells[1].innerText;
            var price=tr1.cells[2].innerText;
         //优化......
            $("ol").append("<li></li>");
            $("ol").append("商品：");
            $("ol").append(title);
            $("ol").append(",  价格：");
            $("ol").append(price);

            $.ajax(
                {
                    url: "orderitem",
                    type: "post",
                    data: {"itemId": itemId},
                    dataType: "text",  //返回的数据类型
                    //ajax在调用controller之后会根据
                    // XMLHttpRequest对象发送请求，该对象有四个状态（readyState）执行success或error
                    success: function (data) {  //返回的数据变量data
                        alert(data+":加入！");
                    },
                    error: function (data) {
                        alert("error"+data);
                    }
                });
        }
    </script>

</head>
<body>

<table id="tb1" align='center' border='1' cellspacing='0'>
    <tr align="center">
        <td>id</td>
        <td>title</td>
        <td>price</td>
        <td>num</td>
        <td>cid</td>
        <td>操作</td>
        <td>订单</td>
    </tr>
    <c:forEach items="${cs}" var="c"  varStatus="status"  >
       <%-- <tr onclick="checktr(this)">--%>
        <tr align="center">
           <%-- <td ><input id="allCkb" type="checkbox"/></td>--%>
            <td>${c.id}</td>
            <td >${c.title}</td>
            <td>${c.price}</td>
            <td>${c.num}</td>
            <td>${c.cid}</td>
           <td><a href="#" onclick="btnDel(this)">删除</a></td>
              <%-- <td><a href="#" onclick="btnCat(this)">加入</a></td>--%>
               <td><a href="#" onclick="btnOrd(this)">加入</a></td>
        </tr>
    </c:forEach>
</table>
<a href="usermanage">usermanage</a><br/>
<h2>加入订单</h2>
<ol>

</ol>
<a href="settlement" >结算</a>
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

</body>
</html>