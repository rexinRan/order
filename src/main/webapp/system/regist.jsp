<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->

<!--[if !IE]><!-->
<html lang="en"> <!--<![endif]-->

<!-- BEGIN HEAD -->

<head>

    <meta charset="utf-8"/>

    <title>注册页面</title>

    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>

    <meta content="" name="description"/>

    <meta content="" name="author"/>

    <jsp:include page="../common/allJs.jsp"/>
    <jsp:include page="../common/allCss.jsp"/>

    <link rel="shortcut icon" href="/../media/image/favicon.ico"/>

</head>

<!-- END HEAD -->

<!-- BEGIN BODY -->

<body class="login">

<!-- BEGIN LOGO -->

<div class="logo">

    <img src="/../media/image/logo-big.png" alt="合同管理系统"/>

</div>

<!-- END LOGO -->

<div class="content">

    <!-- BEGIN REGISTRATION FORM -->

    <form class="form-vertical register-form" action="/registUser.do" method="post">

        <h3 class="" align="center">注册</h3>
        <p>欢 迎 注 册</p>

        <div class="control-group">

            <label class="control-label visible-ie8 visible-ie9">用户名</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-user"></i>

                    <input class="m-wrap placeholder-no-fix" type="text" placeholder="用户名" name="username"/>

                </div>

            </div>

        </div>

        <div class="control-group">

            <label class="control-label visible-ie8 visible-ie9">密码</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-lock"></i>

                    <input class="m-wrap placeholder-no-fix" type="password" id="register_password" placeholder="密码"
                           name="password"/>

                </div>

            </div>

        </div>

        <div class="control-group">

            <label class="control-label visible-ie8 visible-ie9">确认密码</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-ok"></i>

                    <input class="m-wrap placeholder-no-fix" type="password" placeholder="确认密码" name="rpassword"/>

                </div>

            </div>

        </div>

        <div class="control-group">

            <!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->

            <label class="control-label visible-ie8 visible-ie9">邮箱</label>

            <div class="controls">

                <div class="input-icon left">

                    <i class="icon-envelope"></i>

                    <input class="m-wrap placeholder-no-fix" type="text" placeholder="邮箱" name="email"/>

                </div>

            </div>

        </div>

        <div class="control-group">

            <div class="controls">

                <label class="checkbox">

                    <%-- <a href="javascript:;" onclick="serviceTiao() 写成这个形式可以跳转页面 --%>
                    <input type="checkbox" name="tnc"/>我同意 <a href="javascript:;" onclick="serviceTiao()">服务条款</a> 和 <a
                        href="javascript:;" onclick="yinsi()">隐私政策</a>

                </label>

                <div id="register_tnc_error"></div>

            </div>

        </div>

        <div class="form-actions">

            <button id="register-back-btn" type="button" class="btn" onclick="window.history.go(-1)">

                <i class="m-icon-swapleft"></i> 返回

            </button>

            <button type="submit" id="register-submit-btn" class="btn green pull-right">

                注 册 <i class="m-icon-swapright m-icon-white"></i>

            </button>

        </div>

    </form>

    <!-- END REGISTRATION FORM -->

</div>

<!-- END LOGIN -->

<!-- BEGIN COPYRIGHT -->

<jsp:include page="../common/footerIndex.jsp"/>
<%--
<script>

    jQuery(document).ready(function () {

        App.init();

        Login.init();

    });

</script>
--%>
<!-- END JAVASCRIPTS -->


<script type="text/javascript">  var _gaq = _gaq || [];
_gaq.push(['_setAccount', 'UA-37564768-1']);
_gaq.push(['_setDomainName', 'keenthemes.com']);
_gaq.push(['_setAllowLinker', true]);
_gaq.push(['_trackPageview']);
(function () {
    var ga = document.createElement('script');
    ga.type = 'text/javascript';
    ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';
    var s = document.getElementsByTagName('script')[0];
    s.parentNode.insertBefore(ga, s);
})();</script>
</body>

<!-- END BODY -->

</html>