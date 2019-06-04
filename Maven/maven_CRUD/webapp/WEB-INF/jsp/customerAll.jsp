<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName()
            + ":" + request.getServerPort() + path + "/";
%>

<%--
  Created by IntelliJ IDEA.
  User: tree
  Date: 2019/5/24
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    h2{
        text-align: center;
    }
</style>
<body>

<font style="font-size:15px" face="宋体">
    欢迎使用客户管理系统
</font>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">客户管理</h1>
        </div>
    </div>
</div>
<button type="button" class="btn btn-primary btn-lg" style="color: rgb(212, 106, 64);">
    <span class="glyphicon glyphicon-user" href="#" class="btn btn-primary" data-toggle="modal"
          data-target="#newCustomerDialog" onclick="clearCustomer()">新建客户信息</span>
</button>

<table class="table table-striped">
    <thead>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>工作</th>
        <th>联系方式</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.username}</td>
            <td>${customer.jobs}</td>
            <td>${customer.phone}</td>
                <td>
                 <a href="#" class="btn btn-danger btn-xs"
                    onclick="deleteCustomer(${customer.id})">删除</a>

                    <a href="#" class="btn btn-primary btn-xs" data-toggle="modal"
                       data-target="#myModal"
                       onclick="editCustomer(${customer.id})">
                        修改</a>
                </td>

            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                &times;
                            </button>
                            <h4 class="modal-title" id="myModalLabel">顾客信息修改:</h4>
                        </div>

                        <div class="modal-body">
                            <form id="customer_form">
                                    <input type="hidden" id="id" name="id" />
                                <div class="form-group">
                                    <label for="username">用户名:</label>
                                    <input type="text" placeholder="用户名" id="username" name="username" class="form-control" />
                                </div>
                                <div class="form-group">
                                    <label for="jobs">工作:</label>
                                    <input type="text" placeholder="工作" id="jobs" name="jobs" class="form-control"/>
                                </div>
                                <div class="form-group">
                                    <label for="phone">联系方式:</label>
                                    <input type="text" placeholder="联系方式" id="phone" name="phone" class="form-control"/>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">
                                关闭
                            </button>
                            <button type="button" class="btn btn-primary" onclick="updateCustomer()">
                                提交更改
                            </button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div>
                <%--用于客户的增加的模态框--%>
            <div class="modal fade" id="newCustomerDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                &times;
                            </button>
                            <h4 class="modal-title" id="myModalLabel2">新建客户信息:</h4>
                        </div>

                        <div class="modal-body">
                            <form id="customer_form2">
                                <div class="form-group">
                                    <label for="new_username">用户名:</label>
                                    <input type="text" placeholder="用户名" id="new_username" name="username" class="form-control" />
                                </div>
                                <div class="form-group">
                                    <label for="new_jobs">工作:</label>
                                    <input type="text" placeholder="工作" id="new_jobs" name="jobs" class="form-control"/>
                                </div>
                                <div class="form-group">
                                    <label for="new_phone">联系方式:</label>
                                    <input type="text" placeholder="联系方式" id="new_phone" name="phone" class="form-control"/>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">
                                关闭
                            </button>
                            <button type="button" class="btn btn-primary" onclick="createCustomer()">
                                创建客户
                            </button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div>

        </tr>
    </c:forEach>
    </tbody>
</table>
<script>
function editCustomer(id) {
    $.ajax({
        type:"get",
        url:"${pageContext.request.contextPath}/findCustomerById",
        data:{"id":id},
        success:function (data) {
            $("#id").val(data.id);
            $("#username").val(data.username);
            $("#jobs").val(data.jobs);
            $("#phone").val(data.phone);
        }
    })
}

function updateCustomer() {
    //请求成功时，执行回调函数("#customer_form")
    $.post(
        "${pageContext.request.contextPath}/updateCustomer",$("#customer_form").serialize(),function (data) {
            if(data == "OK"){
                alert("修改成功!");
                window.location.reload();
            }else{
                alert("修改失败!");
                window.location.reload();
            }
        }
    )
}
function clearCustomer() {
    $("#new_username").val("");
    $("#new_jobs").val("");
    $("#new_phone").val("");
}
//创建客户
    function createCustomer() {
        $.post(
            "${pageContext.request.contextPath}/insertCustomer",$("#customer_form2").serialize(),function (data) {
                if(data=="OK"){
                    alert("客户创建成功！");
                    window.location.reload();
                }else{
                    alert("客户创建失败！");
                    window.location.reload();
                }
            }
        )
    }
    function deleteCustomer(id){
     if(confirm('确定要删除该用户吗？')){
             $.post("${pageContext.request.contextPath}/delete.action",{"id":id},function (data) {
                 if(data =="OK"){
                     alert("客户删除成功!");
                     window.location.reload();
                 }else {
                     alert("删除客户失败!");
                     window.location.reload();
                 //    重新提交post数据
                 }
             })
     }
    }
</script>
</body>
</html>
