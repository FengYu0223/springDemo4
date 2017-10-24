<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>添加、删除一行</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript">
        $(function() {
            $("#addOneRow").click(function() {
                var tempTr = $("tr:first").clone(true);
                $("tr:last").after(tempTr);
                $("tr:last > td > #name").val("");//新添加行name为空
                $("tr:last > td > #address").val("");//新添加行address为空
            });
            $(".delOneRow").click(function() {
                if ($("tr").length < 2) {
                    alert("至少保留一行!");
                } else {
                    if (confirm("确认删除?")) {
                        $(this).parent().parent().remove();
                    }
                }
            });
        });
    </script>
</head>

<body>
<table border="1">
    <tr>
        <td>姓名:</td>
        <td><input type="text" id="name" name="name" />
        </td>
        <td>地址:</td>
        <td><input type="text" id="address" name="address" /></td>
        <td><input type="button" class="delOneRow" value="删除" /></td>
    </tr>
</table>
<input type="button" id="addOneRow" value="添加一行" />
</body>

</html>