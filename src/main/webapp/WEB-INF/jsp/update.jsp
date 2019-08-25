
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/con1/show2"  method="post">
    项目编号：<input type="text" name="id" value="${projectdb.id}">
    申报名称：<input type="text" name="projectname" value="${projectdb.projectname}">
    开始时间：<input type="date" name="startdate" value="${projectdb.startdate}">
    结束时间：<input type="date" name="enddate" value="${projectdb.enddate}">
    申报状态：<select name="status">

    <option value="0">已申报</option>
    <option value="1">审核中</option>
    <option value="2">已审核</option>
</select>
    <input type="submit" value="提交">
</form>
</body>
</html>
