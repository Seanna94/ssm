<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Seanna
  Date: 2017/11/3
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/js/datatables/css/jquery.dataTables.css">
</head>
<body>
<table id="app" class="display">
    <thead>
    <tr>
        <th>名称</th>
        <th>作者</th>
        <th>价格</th>
        <th>数量</th>
        <th>出版社</th>
        <th>分类</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${bookList}" var="book">
            <tr>
                <td>${book.bookname}</td>
                <td>${book.bookauthor}</td>
                <td>${book.bookprice}</td>
                <td>${book.booknum}</td>
                <td>${book.publisher.pubname}</td>
                <td>${book.bookType.booktype}</td>
                <td>
                    <a href="/books/${book.id}">修改</a>
                    <a href="javascript:;" rel="${book.id}" class="delLink">删除</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<%--<script src="/static/js/jquery-1.11.3.min.js"></script>--%>
<script src="http://cdn.bootcss.com/jquery/2.2.2/jquery.min.js"></script>
<script src="/static/js/datatables/js/jquery.dataTables.js"></script>
<script>
    $(function () {
        //datatables配置文件
        var datatablesConfig = {}
        //调用datatables插件生成datatable表格
        $("#app").DataTable();
    })
</script>
</body>
</html>
