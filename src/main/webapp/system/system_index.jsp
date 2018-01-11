<!DOCTYPE html><%@ page contentType="text/html;charset=UTF-8" language="java" %><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><%-- <% String path = request.getContextPath(); String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()         + path + "/";%><base href="<%=basePath%>">--%><jsp:include page="../common/allJs.jsp"/><jsp:include page="../common/allCss.jsp"/><!--[if IE 8]><html lang="en" class="ie8 no-js"> <![endif]--><!--[if IE 9]><html lang="en" class="ie9 no-js"> <![endif]--><!--[if !IE]><!--><html lang="en" class="no-js"> <!--<![endif]--><!-- BEGIN HEAD --><head>    <meta charset="utf-8"/>    <title>合同管理系统</title>    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    <meta content="width=device-width, initial-scale=1.0" name="viewport"/>    <meta content="" name="description"/>    <meta content="" name="author"/>    <link rel="shortcut icon" href="/media/image/favicon.ico"/></head><!-- END HEAD --><!-- BEGIN BODY --><body class="page-header-fixed"><jsp:include page="../common/index_top.jsp"/><!-- BEGIN CONTAINER --><div class="page-container">    <jsp:include page="../common/index_left_menu.jsp"/>    <!-- BEGIN PAGE -->    <div class="page-content">        <!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->        <div id="portlet-config" class="modal hide">            <div class="modal-header">                <button data-dismiss="modal" class="close" type="button"></button>                <h3>Widget Settings</h3>            </div>            <div class="modal-body">                Widget settings form goes here            </div>        </div>        <!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->        <!-- BEGIN PAGE CONTAINER-->        <div class="container-fluid">            <!-- BEGIN PAGE HEADER-->            <div class="row-fluid">                <div class="span12">                    <!-- BEGIN STYLE CUSTOMIZER -->                    <div class="color-panel hidden-phone">                        <div class="color-mode-icons icon-color"></div>                        <div class="color-mode-icons icon-color-close"></div>                        <div class="color-mode">                            <p>THEME COLOR</p>                            <ul class="inline">                                <li class="color-black current color-default" data-style="default"></li>                                <li class="color-blue" data-style="blue"></li>                                <li class="color-brown" data-style="brown"></li>                                <li class="color-purple" data-style="purple"></li>                                <li class="color-grey" data-style="grey"></li>                                <li class="color-white color-light" data-style="light"></li>                            </ul>                            <label>                                <span>Layout</span>                                <select class="layout-option m-wrap small">                                    <option value="fluid" selected>Fluid</option>                                    <option value="boxed">Boxed</option>                                </select>                            </label>                            <label>                                <span>Header</span>                                <select class="header-option m-wrap small">                                    <option value="fixed" selected>Fixed</option>                                    <option value="default">Default</option>                                </select>                            </label>                            <label>                                <span>Sidebar</span>                                <select class="sidebar-option m-wrap small">                                    <option value="fixed">Fixed</option>                                    <option value="default" selected>Default</option>                                </select>                            </label>                            <label>                                <span>Footer</span>                                <select class="footer-option m-wrap small">                                    <option value="fixed">Fixed</option>                                    <option value="default" selected>Default</option>                                </select>                            </label>                        </div>                    </div>                    <!-- END BEGIN STYLE CUSTOMIZER -->                    <!-- BEGIN PAGE TITLE & BREADCRUMB-->                    <h3 class="page-title">                        厚力德                        <small>厚德予人</small>                        <small>忠利己身</small>                    </h3>                    <ul class="breadcrumb">                        <li>                            <i class="icon-home"></i>                            <a href="javascript:;">首页</a>                            <i class="icon-angle-right"></i>                        </li>                        <%-- <li><a href="#">Dashboard</a></li>--%>                        <li class="pull-right no-text-shadow">                            <div id="dashboard-report-range"                                 class="dashboard-date-range tooltips no-tooltip-on-touch-device responsive"                                 data-tablet="" data-desktop="tooltips" data-placement="top"                                 data-original-title="更改日期范围">                                <i class="icon-calendar"></i>                                <span></span>                                <i class="icon-angle-down"></i>                            </div>                        </li>                    </ul>                    <!-- END PAGE TITLE & BREADCRUMB-->                </div>            </div>            <!-- END PAGE HEADER-->            <div id="dashboard">                <%--插入引用页面--%>                <jsp:include page="../common/index_middle.jsp"/>                <div class="clearfix"></div>                <div class="row-fluid">                    <div class="span6">                        <!-- BEGIN PORTLET-->                        <div class="portlet solid bordered light-grey">                            <div class="portlet-title">                                <div class="caption"><i class="icon-bar-chart"></i>公司简介</div>                                <div class="tools">                                    <div class="btn-group pull-right" data-toggle="buttons-radio">                                        <a href="" class="btn mini">用户</a>                                        <a href="" class="btn mini active">反馈</a>                                    </div>                                </div>                            </div>                            <div class="portlet-body">                                <div id="site_statistics_loading">                                    <img src="../media/image/loading.gif" alt="loading"/>                                </div>                                <div id="site_statistics_content" class="hide">                                    <div id="site_statistics" class="chart"></div>                                </div>                            </div>                        </div>                        <!-- END PORTLET-->                    </div>                    <div class="span6">                        <!-- BEGIN PORTLET-->                        <div class="portlet solid light-grey bordered">                            <div class="portlet-title">                                <div class="caption"><i class="icon-bullhorn"></i>活动</div>                                <div class="tools">                                    <div class="btn-group pull-right" data-toggle="buttons-radio">                                        <a href="" class="btn blue mini active">用户</a>                                        <a href="" class="btn blue mini">订单</a>                                    </div>                                </div>                            </div>                            <div class="portlet-body">                                <div id="site_activities_loading">                                    <img src="../media/image/loading.gif" alt="loading"/>                                </div>                                <div id="site_activities_content" class="hide">                                    <div id="site_activities" style="height:100px;"></div>                                </div>                            </div>                        </div>                        <!-- END PORTLET-->                        <!-- BEGIN PORTLET-->                        <div class="portlet solid bordered light-grey">                            <div class="portlet-title">                                <div class="caption"><i class="icon-signal"></i>服务器负载</div>                                <div class="tools">                                    <div class="btn-group pull-right" data-toggle="buttons-radio">                                        <a href="" class="btn red mini active">                                            <span class="hidden-phone">数据库</span>                                            <span class="visible-phone">DB</span></a>                                        <a href="" class="btn red mini">Web</a>                                    </div>                                </div>                            </div>                            <div class="portlet-body">                                <div id="load_statistics_loading">                                    <img src="../media/image/loading.gif" alt="loading"/>                                </div>                                <div id="load_statistics_content" class="hide">                                    <div id="load_statistics" style="height:108px;"></div>                                </div>                            </div>                        </div>                        <%-- <jsp:include page="../common/totalyiban.jsp"/>--%>                        <!-- END PORTLET-->                    </div>                </div>                <%--<jsp:include page="../common/net.jsp"/>--%>            </div>            <%--<jsp:include page="../common/regison.jsp"/>--%>            <%--<jsp:include page="../common/feeds.jsp"/>--%>        </div>    </div>    <!-- END PORTLET--></div></div><%--&lt;%&ndash;插入日历和聊天&ndash;%&gt;<jsp:include page="../common/canlandaAndChats.jsp"/>--%></div></div></div></div><!-- END PAGE CONTAINER--></div><!-- END PAGE --></div><!-- END CONTAINER --><%@include file="../common/footer.jsp" %><!-- BEGIN FOOTER --></div><!-- END FOOTER --><script>    jQuery(document).ready(function () {        App.init(); // initlayout and core plugins        Index.init();        Index.initJQVMAP(); // init index page's custom scripts        Index.initCalendar(); // init index page's custom scripts        Index.initCharts(); // init index page's custom scripts        Index.initChat();        Index.initMiniCharts();        Index.initDashboardDaterange();        Index.initIntro();    });</script><!-- END JAVASCRIPTS --><script type="text/javascript">  var _gaq = _gaq || [];_gaq.push(['_setAccount', 'UA-37564768-1']);_gaq.push(['_setDomainName', 'keenthemes.com']);_gaq.push(['_setAllowLinker', true]);_gaq.push(['_trackPageview']);(function () {    var ga = document.createElement('script');    ga.type = 'text/javascript';    ga.async = true;    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';    var s = document.getElementsByTagName('script')[0];    s.parentNode.insertBefore(ga, s);})();</script></body><!-- END BODY --></html>