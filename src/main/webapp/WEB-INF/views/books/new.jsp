<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <title>Document</title>
</head>
<body>
    <div class="container">
        <div class="page-header">
            <h3>添加新书籍</h3>
        </div>
        <div class="row">
            <form action="" method="post">
                <div class="form-group">
                    <label>书籍作者</label>
                    <input type="text" name="booknum" class="form-control">
                </div>
            </form>
        </div>
        <div class="form-group">
            <label>书籍价格</label>
            <input type="text" name="bookprice" class="form-control">
        </div>
        <div class="form-group">
            <label>书籍数量</label>
            <input type="text" name="booknum" class="form-control">
        </div>
        <div class="form-group">
            <label>分类</label>
            <select class="form-control" name="typeid">
                <c:forEach items="${types}" var="type">
                    <option value="${type.id}">${type.booktype}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label>出版社</label>
            <select class="form-control" name="pubid">
                <c:forEach items="${pubs}" var="pub">
                    <option value="${pub.id}">${pub.pubname}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <button class="btn btn-primary">保存</button>
        </div>
        </form>
    </div>
</body>
</html>
