<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>HIS - 东软云医院</title>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <link rel="stylesheet" href="../css/index.css">
</head>
<body class="layui-layout-body">
    <div class="layui-layout layui-layout-admin">
        <div class="layui-header">
            <div class="layui-logo">HIS - 东软云医院</div>
            <!-- 头部区域（可配合layui已有的水平导航） -->
            <ul class="layui-nav layui-layout-left">

            </ul>
            <ul class="layui-nav layui-layout-right">
                <li class="layui-nav-item">
                    <a href="javascript:;">
                        控制台
                    </a>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">
                        <img src="http://t.cn/RCzsdCq" class="layui-nav-img" >
                        Admin
                    </a>
                </li>
                <li class="layui-nav-item"><a href="">退出</a></li>
            </ul>
        </div>

        <div class="layui-side layui-bg-black">
          <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
              <li class="layui-nav-item layui-nav-itemed">
                <a class="" href="javascript:;">医院基本信息</a>
                <dl class="layui-nav-child">
                  <dd class="layui-this"><a href="/control/toDept">科室信息</a></dd>
                  <dd><a href="javascript:;">疾病信息</a></dd>
                  <dd><a href="javascript:;">药品信息</a></dd>
                </dl>
              </li>
            </ul>
          </div>
        </div>

        <div class="layui-body">
            <!-- 内容主体区域 -->
            <div style="padding: 15px;">内容主体区域</div>
        </div>

        <div class="layui-footer">
            <!-- 底部固定区域 -->
            © 东软云医院 - 20175233周升
        </div>
    </div>
<script src="../layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;
    });
</script>
</body>
</html>

