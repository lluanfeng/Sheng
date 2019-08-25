<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/1
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/con1/add2"  method="post">
    申报名称：<input type="text" name="projectname">
    开始时间：<input type="date" name="startdate">
    结束时间：<input type="date" name="enddate">
    申报状态：<select name="status">
    <option value="0">已申报</option>
    <option value="1">审核中</option>
    <option value="2">已审核</option>
</select>
    <input type="submit" value="提交">
</form>
</body>
</html>
