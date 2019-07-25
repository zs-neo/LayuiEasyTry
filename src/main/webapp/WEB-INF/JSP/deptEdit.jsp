<%@ page import="java.net.URLDecoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>HIS - 东软云医院</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
</head>
<body>
<br><br>
<form class="layui-form" action="" method="">
    <%String oid =request.getParameter("id");%>
    <input type="hidden" name="oid" value="<%=oid%>" class="layui-input">

    <div class="layui-form-item">
        <label class="layui-form-label">科室ID</label>
        <div class="layui-input-block">
            <input type="text" name="id" style="width:200px;" autocomplete="off" value="<%=oid%>" class="layui-input">
        </div>
    </div>
    <%String dept_code =request.getParameter("dept_code");%>
    <div class="layui-form-item">
        <label class="layui-form-label">科室编码</label>
        <div class="layui-input-block">
            <input type="text" name="dept_code" style="width:200px;" autocomplete="off" value="<%=dept_code%>" class="layui-input">
        </div>
    </div>
    <%String dept_name =request.getParameter("dept_name");
        dept_name = URLDecoder.decode(dept_name,"UTF-8");%>
    <div class="layui-form-item">
        <label class="layui-form-label">科室名称</label>
        <div class="layui-input-block">
            <input type="text" name="dept_name" style="width:200px;" autocomplete="off" value="<%=dept_name%>" class="layui-input">
        </div>
    </div>
    <%String dept_catagory =request.getParameter("dept_catagory");%>
    <div class="layui-form-item">
        <label class="layui-form-label">科室类别</label>
        <div class="layui-input-block">
            <input type="text" name="dept_catagory" style="width:200px;" autocomplete="off" value="<%=dept_catagory%>" class="layui-input">
        </div>
    </div>
    <%String dept_type =request.getParameter("dept_type");%>
    <div class="layui-form-item">
        <label class="layui-form-label">科室类型</label>
        <div class="layui-input-block">
            <input type="text" name="dept_type" style="width:200px;" autocomplete="off" value="<%=dept_type%>" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="demo1" type="button">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script src="../layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;
    });
    layui.use(['form'], function () {
        var form = layui.form;
        form.on('submit(demo1)', function (data) {
            $.ajax({
                url: "/dept/updateDeptById",
                type: "post",
                dataType: "json",
                data:{'oid':data.field.oid,'id':data.field.id,'dept_code':data.field.dept_code,
                        'dept_type':data.field.dept_type,'dept_name':data.field.dept_name,'dept_catagory':data.field.dept_catagory},
                success: function (res) {
                    var json=JSON.parse(res);
                    if (json.result == "1") {
                        layer.msg("编辑成功！",{icon: 6});
                        parent.a();
                    } else {
                        layer.msg("编辑失败！",{icon: 5});//失败的表情
                    }
                }
            });
        });
        return false;
    });
</script>
</body>
</html>
