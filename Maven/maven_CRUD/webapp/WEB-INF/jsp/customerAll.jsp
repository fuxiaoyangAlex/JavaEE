<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%--
  Created by IntelliJ IDEA.
  User: tree
  Date: 2019/5/24
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <h2>顾客数据表:</h2>
        <td>编号</td>
        <td>姓名</td>
        <td>工作</td>
        <td>联系方式</td>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td id="${customer.id }" style="width: 10px;">${customer.id }</td>
            <td id="${customer.username }" style="width: 30px;">${customer.username }</td>
            <td id="${customer.jobs }" style="width: 100px;">${customer.jobs }</td>
            <td id="${customer.phone }" style="width: 50px;">${customer.phone }</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
