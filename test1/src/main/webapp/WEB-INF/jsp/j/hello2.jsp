<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>菜鸟教程(runoob.com)</title>
    <script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js">
    </script>
    <script>
        $(document).ready(function(){
            $("button").click(function(){
                $.ajax({url:"itemlist",success:function(result){
                    $("#div1").html(result);
                }});
            });
        });
    </script>
</head>
<body>

<div id="div1"><h2>使用 jQuery AJAX 修改文本内容</h2></div>
<button>获取其他内容</button>

</body>
</html>