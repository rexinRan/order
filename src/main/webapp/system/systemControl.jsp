<%--
  Created by IntelliJ IDEA.
  User: rexin
  Date: 2018/1/8
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

        <title>锁屏</title>

        <meta content="width=device-width, initial-scale=1.0" name="viewport"/>

        <meta content="" name="description"/>

        <meta content="" name="author"/>
        <link rel="shortcut icon" href="media/image/favicon.ico"/>
    </head>
    <!-- BEGIN BODY -->

<body>

<div class="page-lock">

    <div class="page-logo">

        <a class="brand" href="index.jsp">

            <img src="media/image/logo-big.png" alt="logo"/>

        </a>

    </div>

    <div class="page-body">

        <img class="page-lock-img" src="media/image/profile.jpg" alt="">

        <div class="page-lock-info">

            <h1>Bob Nilson</h1>

            <span>bob@keenthemes.com</span>

            <span><em>Locked</em></span>

            <form class="form-search" action="index.jsp">

                <div class="input-append">

                    <input type="text" class="m-wrap" placeholder="Password">

                    <button type="submit" class="btn blue icn-only"><i class="m-icon-swapright m-icon-white"></i>
                    </button>

                </div>

                <div class="relogin">

                    <a href="login.jsp">Not Bob Nilson ?</a>

                </div>

            </form>

        </div>

    </div>

    <jsp:include page="../common/footerIndex.jsp"/>
</div>
</body>

</div>

