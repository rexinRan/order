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
    <head>
        <meta charset="utf-8"/>

        <title>销售合同</title>

        <meta content="width=device-width, initial-scale=1.0" name="viewport"/>

        <meta content="" name="description"/>

        <meta content="" name="author"/>
        <link rel="shortcut icon" href="/media/image/favicon.ico"/>
    </head>
    <!-- BEGIN BODY -->

<body class="page-header-fixed">
<!-- BEGIN HEADER 导航栏 -->
<jsp:include page="../common/index_top.jsp"/>
<!-- END HEADER -->


<!-- BEGIN CONTAINER 页面容器-->

<div class="page-container row-fluid">

    <!-- BEGIN SIDEBAR  左侧菜单栏-->
    <jsp:include page="../common/index_left_menu.jsp"/>
    <!-- END SIDEBAR -->

    <!-- BEGIN PAGE 正式的页面内容 -->
    <div class="page-content">

        <!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
        <jsp:include page="../common/portal_config.jsp"/>
        <!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->

        <!-- BEGIN PAGE CONTAINER -->
        <div class="container-fluid">

            <!-- BEGIN PAGE HEADER  身体的头部 配置主题颜色-->
            <jsp:include page="../common/theme_color.jsp"/>
            <!-- END PAGE HEADER-->

            <!-- BEGIN PAGE CONTENT-->
            <div class="row-fluid">
                <div class="span12">

                    <!-- BEGIN EXAMPLE TABLE PORTLET-->
                    <div class="portlet box blue">
                        <div class="portlet-title">
                            <div class="caption"><i class="icon-edit"></i>Editable Table</div>
                            <div class="tools">
                                <a href="javascript:;" class="collapse"></a>
                                <a href="#portlet-config" data-toggle="modal" class="config"></a>
                                <a href="javascript:;" class="reload"></a>
                                <a href="javascript:;" class="remove"></a>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="clearfix">
                                <div class="btn-group">
                                    <button id="sample_editable_1_new" class="btn green">
                                        Add New <i class="icon-plus"></i>
                                    </button>
                                </div>
                                <div class="btn-group pull-right">
                                    <button class="btn dropdown-toggle" data-toggle="dropdown">Tools <i
                                            class="icon-angle-down"></i>
                                    </button>
                                    <ul class="dropdown-menu pull-right">
                                        <li><a href="#">Print</a></li>
                                        <li><a href="#">Save as PDF</a></li>
                                        <li><a href="#">Export to Excel</a></li>
                                    </ul>
                                </div>
                            </div>
                            <table class="table table-striped table-hover table-bordered" id="sample_editable_1">
                                <thead>
                                <tr>
                                    <th>Username</th>
                                    <th>Full Name</th>
                                    <th>Points</th>
                                    <th>Notes</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr class="">
                                    <td>alex</td>
                                    <td>Alex Nilson</td>
                                    <td>1234</td>
                                    <td class="center">power user</td>
                                    <td><a class="edit" href="javascript:;">Edit</a></td>
                                    <td><a class="delete" href="javascript:;">Delete</a></td>
                                </tr>
                                <tr class="">
                                    <td>lisa</td>
                                    <td>Lisa Wong</td>
                                    <td>434</td>
                                    <td class="center">new user</td>
                                    <td><a class="edit" href="javascript:;">Edit</a></td>
                                    <td><a class="delete" href="javascript:;">Delete</a></td>
                                </tr>
                                <tr class="">
                                    <td>nick12</td>
                                    <td>Nick Roberts</td>
                                    <td>232</td>
                                    <td class="center">power user</td>
                                    <td><a class="edit" href="javascript:;">Edit</a></td>
                                    <td><a class="delete" href="javascript:;">Delete</a></td>
                                </tr>
                                <tr class="">
                                    <td>goldweb</td>
                                    <td>Sergio Jackson</td>
                                    <td>132</td>
                                    <td class="center">elite user</td>
                                    <td><a class="edit" href="javascript:;">Edit</a></td>
                                    <td><a class="delete" href="javascript:;">Delete</a></td>
                                </tr>
                                <tr class="">
                                    <td>webriver</td>
                                    <td>Antonio Sanches</td>
                                    <td>462</td>
                                    <td class="center">new user</td>
                                    <td><a class="edit" href="javascript:;">Edit</a></td>
                                    <td><a class="delete" href="javascript:;">Delete</a></td>
                                </tr>
                                <tr class="">
                                    <td>gist124</td>
                                    <td>Nick Roberts</td>
                                    <td>62</td>
                                    <td class="center">new user</td>
                                    <td><a class="edit" href="javascript:;">Edit</a></td>
                                    <td><a class="delete" href="javascript:;">Delete</a></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <!-- END EXAMPLE TABLE PORTLET-->

                </div>
                <!-- BEGIN EXAMPLE TABLE PORTLET 页面显示栏-->

                <!-- END EXAMPLE TABLE PORTLET-->
            </div>
            <!-- END PAGE CONTENT-->
        </div>
        <!-- END PAGE CONTAINER-->
    </div>
    <!-- END PAGE -->
</div>
<!-- END CONTAINER -->


<!-- BEGIN FOOTER -->
<div class="footer">
    <div class="footer-inner">
        2017 &copy; HouLiDe. Management system.
    </div>
    <div class="footer-tools">
			<span class="go-top">
			<i class="icon-angle-up"></i>
			</span>
    </div>
</div>
<!-- END FOOTER -->


<script>
    jQuery(document).ready(function () {
        App.init();
        TableEditable.init();
    });
</script>

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

</html>

