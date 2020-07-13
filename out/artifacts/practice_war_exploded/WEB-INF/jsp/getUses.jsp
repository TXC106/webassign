<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>用AJAX以JSON方式提交数据</title>
</head>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<body>
<input type="button" class="btn btn-success" value="通过AJAX获取一个User对象---" id="sender">

<div id="messageDiv" class="alert alert-success" role="alert"></div>

<script>
    $('#sender').click(function(){
        var url="getOneUser";
        $.post(
            url,
            function(data) {
                var json=JSON.parse(data);
                var name =json.user.name;
                var id = json.user.id;
                $("#messageDiv").html("用户id："+ id + "<br>用户名称:" +name+"<br>用户年龄:"+age );

            });
    });
</script>
</body>
</html>