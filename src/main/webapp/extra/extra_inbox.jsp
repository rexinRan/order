<%--
  Created by IntelliJ IDEA.
  User: rexin
  Date: 2018/1/8
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../common/allJs.jsp"/>
<jsp:include page="../common/allCss.jsp"/>
<head>
    <!--[if IE 8]>
    <html lang="en" class="ie8"> <![endif]-->

    <!--[if IE 9]>
    <html lang="en" class="ie9"> <![endif]-->

    <!--[if !IE]><!-->
    <html lang="en"> <!--<![endif]-->

    <html>
    <head>
        <meta charset="utf-8"/>

        <title>收件箱</title>

        <meta content="width=device-width, initial-scale=1.0" name="viewport"/>

        <meta content="" name="description"/>

        <meta content="" name="author"/>
        <link rel="shortcut icon" href="/media/image/favicon.ico"/>

    </head>
    <!-- BEGIN BODY -->

<body>
<jsp:include page="../common/index_top.jsp"/>
<jsp:include page="../common/index_left_menu.jsp"/>
<div class="page-lock">


    <div class="page-logo">

        <a class="brand" href="index.jsp">

            <img src="/media/image/logo-big.png" alt="logo"/>

        </a>

    </div>

    <!-- BEGIN PAGE TITLE & BREADCRUMB-->
    <h3 class="page-title">
        Inbox
        <small>user inbox</small>
    </h3>
    <ul class="breadcrumb">
        <li>
            <i class="icon-home"></i>
            <a href="index.html">Home</a>
            <i class="icon-angle-right"></i>
        </li>
        <li>
            <a href="#">Extra</a>
            <i class="icon-angle-right"></i>
        </li>
        <li><a href="#">Inbox</a></li>
    </ul>
    <!-- END PAGE TITLE & BREADCRUMB-->
</div>
</div>
<div class="row-fluid inbox">
    <div class="span2">
        <ul class="inbox-nav margin-bottom-10">
            <li class="compose-btn">
                <a href="javascript:;" data-title="Compose" class="btn green">
                    <i class="icon-edit"></i> Compose
                </a>
            </li>
            <li class="inbox active">
                <a href="javascript:;" class="btn" data-title="Inbox">Inbox(3)</a>
                <b></b>
            </li>
            <li class="sent"><a class="btn" href="javascript:;" data-title="Sent">Sent</a><b></b></li>
            <li class="draft"><a class="btn" href="javascript:;" data-title="Draft">Draft</a><b></b></li>
            <li class="trash"><a class="btn" href="javascript:;" data-title="Trash">Trash</a><b></b></li>
        </ul>
    </div>
    <div class="span10">
        <div class="inbox-header">
            <h1 class="pull-left">Inbox</h1>
            <form action="#" class="form-search pull-right">
                <div class="input-append">
                    <input class="m-wrap" type="text" placeholder="Search Mail">
                    <button class="btn green" type="button">Search</button>
                </div>
            </form>
        </div>
        <div class="inbox-loading">Loading...</div>
        <div class="inbox-content">
        </div>
    </div>
</div>

<!-- END PAGE CONTAINER-->

<!-- END PAGE -->

<jsp:include page="../common/footerIndex.jsp"/>
</div>
</body>
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
</div>

