<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->

<!--[if !IE]><!-->
<html lang="en"> <!--<![endif]-->

<!-- BEGIN HEAD -->

<head>

    <meta charset="utf-8"/>

    <title>注册成功</title>

    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>

    <meta content="" name="description"/>

    <meta content="" name="author"/>

    <!-- BEGIN GLOBAL MANDATORY STYLES -->

    <link href="/media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

    <link href="/media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

    <link href="/media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

    <link href="/media/css/style-metro.css" rel="stylesheet" type="text/css"/>

    <link href="/media/css/style.css" rel="stylesheet" type="text/css"/>

    <link href="/media/css/style-responsive.css" rel="stylesheet" type="text/css"/>

    <link href="/media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

    <link href="/media/css/uniform.default.css" rel="stylesheet" type="text/css"/>

    <!-- END GLOBAL MANDATORY STYLES -->

    <!-- BEGIN PAGE LEVEL STYLES -->

    <link href="/media/css/login.css" rel="stylesheet" type="text/css"/>

    <!-- END PAGE LEVEL STYLES -->

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


    <!-- BEGIN FORGOT PASSWORD FORM -->

    <%--<form class="form-vertical forget-form" action="/forgetPassword.do">--%>

    <h3 class="">注册成功</h3>

    <p>请稍等，正在转回登录页面......</p>

    <%--<div class="control-group">

        <div class="controls">

            <div class="input-icon left">

                <i class="icon-envelope"></i>

                <input class="m-wrap placeholder-no-fix" type="text" placeholder="邮箱" name="email"/>

            </div>

        </div>

    </div>

    <div class="form-actions">

        <button type="button" id="back-btn" class="btn" onclick="window.history.go(-1)">

            <i class="m-icon-swapleft"></i> 返回

        </button>

        <button type="submit" class="btn green pull-right">

            提交 <i class="m-icon-swapright m-icon-white"></i>

        </button>

    </div>

</form>

<!-- END FORGOT PASSWORD FORM -->--%>

</div>

</div>

</form>

<!-- END REGISTRATION FORM -->

</div>

<!-- END LOGIN -->

<!-- BEGIN COPYRIGHT -->

<div class="copyright">

    2017 &copy; HouLiDe. Management system.

</div>

<!-- END COPYRIGHT -->

<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->

<!-- BEGIN CORE PLUGINS -->

<script src="/media/js/jquery-1.10.1.min.js" type="text/javascript"></script>

<script src="/media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>

<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->

<script src="/media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>

<script src="/media/js/bootstrap.min.js" type="text/javascript"></script>

<!--[if lt IE 9]>

<script src="media/js/excanvas.min.js"></script>

<script src="media/js/respond.min.js"></script>

<![endif]-->

<script src="/media/js/jquery.slimscroll.min.js" type="text/javascript"></script>

<script src="/media/js/jquery.blockui.min.js" type="text/javascript"></script>

<script src="/media/js/jquery.cookie.min.js" type="text/javascript"></script>

<script src="/media/js/jquery.uniform.min.js" type="text/javascript"></script>

<!-- END CORE PLUGINS -->

<!-- BEGIN PAGE LEVEL PLUGINS -->

<script src="/media/js/jquery.validate.min.js" type="text/javascript"></script>

<!-- END PAGE LEVEL PLUGINS -->

<!-- BEGIN PAGE LEVEL SCRIPTS -->
<%--
<script src="media/js/app.js" type="text/javascript"></script>

<script src="media/js/login.js" type="text/javascript"></script>--%>

<!-- END PAGE LEVEL SCRIPTS -->
<script type="text/javascript">


    window.setTimeout(function () {
        window.location.replace('registToLogin.do?');
    }, 500);

</script>
<%--<script>

    jQuery(document).ready(function () {

        App.init();

        Login.init();

    });

</script>--%>

<!-- END JAVASCRIPTS -->

<%--<script type="text/javascript">  var _gaq = _gaq || [];
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
})();</script>--%>
</body>

<!-- END BODY -->

</html>