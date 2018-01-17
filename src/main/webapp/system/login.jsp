<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

%>

<base href="<%=basePath%>">

<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->

<!--[if !IE]><!-->
<html lang="en"> <!--<![endif]-->

<!-- BEGIN HEAD -->

<head>

    <meta charset="utf-8"/>

    <title>登录页面</title>

    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>

    <meta content="" name="description"/>

    <meta content="" name="author"/>
    <jsp:include page="../common/allJs.jsp"/>
    <jsp:include page="../common/allCss.jsp"/>

    <link rel="shortcut icon" href="../media/image/favicon.ico"/>

</head>

<!-- END HEAD -->

<!-- BEGIN BODY -->

<body class="login">

<!-- BEGIN LOGO -->

<div class="logo">

    <img src="../media/image/logo-big.png" alt="合同管理系统"/>

</div>

<!-- END LOGO -->

<!-- BEGIN LOGIN -->

<div class="content">

    <!-- BEGIN LOGIN FORM -->

    <form class="form-vertical login-form" action="/login_index.do" method="post">

        <h3 class="form-title" align="center">登 录 账 号</h3>

        <div class="alert alert-error hide">

            <button class="close" data-dismiss="alert"></button>

            <span>输入你的用户名和密码</span>

        </div>

        <div class="control-group">

            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->

            <label class="control-label visible-ie8 visible-ie9">用户名</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-user"></i>

                    <input class="m-wrap placeholder-no-fix" type="text" placeholder="用户名" name="userName"/>

                </div>

            </div>

        </div>

        <div class="control-group">

            <label class="control-label visible-ie8 visible-ie9">密码</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-lock"></i>

                    <input class="m-wrap placeholder-no-fix" type="password" placeholder="密码" name="userPwd"/>

                </div>

            </div>

        </div>

        <div class="form-actions">

            <label class="checkbox">

                <input type="checkbox" name="remember" value="1"/> 记住我

            </label>

            <button type="submit" class="btn green pull-right">

                登陆 <i class="m-icon-swapright m-icon-white"></i>

            </button>

        </div>

        <div class="forget-password">

            <h4>忘记密码 ?</h4>

            <p>

                不要担心,点击 <a href="/to_forget_password.do" class=""
                           id="forget-password">这里</a>

                重置密码.

            </p>

        </div>
        <%--  location.href='filename.html'--%>
        <div class="create-account">

            <p>

                没有账号 ?&nbsp;

                <a href="/to_regist.do" id="register-btn"
                   class="">创建一个</a>

            </p>

        </div>

    </form>

    <!-- END LOGIN FORM -->

</div>

<!-- END LOGIN -->

<jsp:include page="../common/footerIndex.jsp"/>
</body>
</html>