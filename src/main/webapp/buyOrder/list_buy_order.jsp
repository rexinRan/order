<%--
  Created by IntelliJ IDEA.
  User: rexin
  Date: 2018/1/8
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                            <div class="caption"><i class="icon-edit"></i>采购合同详细</div>
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
                                        新增 <i class="icon-plus"></i>
                                    </button>
                                </div>
                                <div class="btn-group pull-right">
                                    <button class="btn dropdown-toggle" data-toggle="dropdown">Tools <i
                                            class="icon-angle-down"></i>
                                    </button>
                                    <ul class="dropdown-menu pull-right">
                                        <li><a href="#">打印</a></li>
                                        <li><a href="#">PDF保存</a></li>
                                        <li><a href="#">导出表格</a></li>
                                    </ul>
                                </div>
                            </div>

                            <table class="table table-striped table-hover table-bordered" id="sample_editable_1">
                                <thead>
                                <tr>
                                    <th>日期</th>
                                    <th>经理</th>
                                    <th>厂家</th>
                                    <th>联系人</th>
                                    <th>签收</th>
                                    <th>附件</th>
                                    <th>金额</th>
                                    <th>状态</th>
                                    <th>备注</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="buyOrderList" var="lists">
                                <tr class="">
                                    <td>${lists}</td>
                                    <td>${lists}</td>
                                    <td>${lists}</td>
                                    <td>${lists}</td>
                                    <td>${lists}</td>
                                    <td>${lists}</td>
                                    <td>${lists}</td>
                                    <td>${lists}</td>
                                    <td>${lists}</td>

                                    <td><a class="edit" href="javascript:;">编辑</a></td>
                                    <td><a class="delete" href="javascript:;">删除</a></td>
                                </tr>
                                </c:forEach>
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

