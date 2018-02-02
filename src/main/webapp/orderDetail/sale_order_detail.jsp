<%--
  Created by IntelliJ IDEA.
  User: rexin
  Date: 2018/1/8
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link rel="shortcut icon" href="../media/image/favicon.ico"/>
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


                    <!-- BEGIN EXAMPLE TABLE PORTLET 页面显示栏-->
                    <div class="portlet box blue">
                        <div class="portlet-title">
                            <div class="caption"><i class="icon-globe"></i>显示/隐藏列</div>
                            <div class="actions">
                                <div class="btn-group">
                                    <a class="btn" href="#" data-toggle="dropdown">
                                        列
                                        <i class="icon-angle-down"></i>
                                    </a>
                                    <div id="sample_2_column_toggler"
                                         class="dropdown-menu hold-on-click dropdown-checkboxes pull-right">
                                        <label><input type="checkbox" checked data-column="0">销售经理</label>
                                        <label><input type="checkbox" checked data-column="1">买家单位</label>
                                        <label><input type="checkbox" checked data-column="2">金额</label>
                                        <label><input type="checkbox" checked data-column="3">生效日期</label>
                                        <label><input type="checkbox" checked data-column="4">合同状态</label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <table class="table table-striped table-bordered table-hover table-full-width"
                                   id="sample_2">
                                <thead>
                                <tr>
                                    <th>销售经理</th>
                                    <th>买家单位</th>
                                    <th class="hidden-480">金额</th>
                                    <th class="hidden-480">生效日期</th>
                                    <th class="hidden-480">合同状态</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${pageInfo.list}" var="saleOrders">
                                    <tr>
                                        <td>${saleOrders.employee.empName}</td>
                                        <td>${saleOrders.customer.cusName}</td>
                                        <td class="hidden-480">${saleOrders.writedate}</td>
                                        <td class="hidden-480">${saleOrders.insuredate}</td>
                                        <td class="hidden-480">${saleOrders.saleOrderState}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <%--提示分页信息--%>
                    <div class="row">
                        <%--分页文字信息--%>
                        <div class="col-md-6">
                            当前记录数:XXXX
                        </div>
                        <%--分页条信息--%>
                        <div class="col-md-6">
                            <nav aria-label="Page navigation">
                                <ul class="pagination">
                                    <li><a href="#">首页</a></li>
                                    <li>
                                        <a href="#" aria-label="Previous">
                                            <span aria-hidden="true">   &laquo;</span>
                                        </a>
                                    </li>
                                    <li><a href="#">1</a></li>
                                    <li><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                    <li><a href="#">4</a></li>
                                    <li><a href="#">5</a></li>
                                    <li>
                                        <a href="#" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                        </a>
                                    </li>
                                    <li><a href="#">尾页</a></li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END EXAMPLE TABLE PORTLET-->
        </div>
    </div>
</div>
</div>

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
        TableAdvanced.init();
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

