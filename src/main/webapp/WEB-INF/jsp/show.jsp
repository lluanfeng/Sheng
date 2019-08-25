
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="../js/bootstrap.min.css" />
</head>
<h1 style="text-align: center">申报项目列表</h1>
<form action="/con1/show" method="post">
    申报状态：<select name="status1">
    <option value=""></option>
    <option value="0">已申报</option>
    <option value="1">审核中</option>
    <option value="2">已审核</option>
</select>
    <input type="submit" value="查询">
</form>
<body>
<table class="table table-striped table-hover table-bordered">
    <tr>
        <td>项目编号</td>
        <td>项目名称</td>
        <td>开始日期</td>
        <td>结束日期</td>
        <td>申报状态</td>
        <td>操作| <a href="/con1/add1">新增</a></td>
    </tr>
    <c:forEach var="Pro" items="${list}">
        <tr>
            <td>${Pro.id}</td>
            <td>${Pro.projectname}</td>
            <td><fmt:formatDate value="${Pro.startdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <td><fmt:formatDate value="${Pro.enddate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <td>${Pro.pro.name}</td>
            <td><c:if test="${Pro.status==0}"><a href="/con1/show1?id=${Pro.id}">审核</a></c:if>
                <c:if test="${Pro.status==1}"><a href="/con1/show1?id=${Pro.id}">审核</a></c:if></td>
        </tr>
    </c:forEach>
</table>
<div class="row">
    <div class="col-lg-5 col-md-offset-7">
        <ul class="pagination pagination-lg pager">
            <li class="previous"><a href="javascript:goPage(1)">首页</a></li>
            <li><a href="javascript:goPage(${page.currPage-1})">&laquo;</a></li>
            <c:forEach var="i" begin="1" end="${page.totalPage}" >
                <li><a href="javascript:goPage(${i})">${i}</a></li>
            </c:forEach>
            <li><a href="javascript:goPage(${page.currPage+1})">&raquo;</a></li>
            <li class="next"><a href="javascript:goPage(${page.totalPage})">尾页</a></li>
        </ul>
    </div>
</div>
</body>
<script>
    function goPage(p) {
        var totalP=${page.totalPage};
        if(p>totalP){
            p=totalP;
        }
        if(p<1){
            p=1;
        }
        location.href="/con1/show?currPage="+p;
    }
</script>
</html>

</body>
</html>
