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

                    <!-- BEGIN EXAMPLE TABLE PORTLET-->
                    <div class="portlet box green">
                        <div class="portlet-title">
                            <div class="caption"><i class="icon-globe"></i>采购列表
                            </div>
                            <div class="tools">
                                <a href="javascript:;" class="reload"></a>
                                <a href="javascript:;" class="remove"></a>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <table class="table table-striped table-bordered table-hover table-full-width"
                                   id="sample_1">
                                <thead>
                                <tr>
                                    <th>Rendering engine</th>
                                    <th>Browser</th>
                                    <th class="hidden-480">Platform(s)</th>
                                    <th class="hidden-480">Engine version</th>
                                    <th class="hidden-480">CSS grade</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>Trident</td>
                                    <td>Internet
                                        Explorer 4.0
                                    </td>
                                    <td class="hidden-480">Win 95+</td>
                                    <td class="hidden-480">4</td>
                                    <td class="hidden-480">X</td>
                                </tr>
                                <tr>
                                    <td>Trident</td>
                                    <td>Internet
                                        Explorer 5.0
                                    </td>
                                    <td class="hidden-480">Win 95+</td>
                                    <td class="hidden-480">5</td>
                                    <td class="hidden-480">C</td>
                                </tr>
                                <tr>
                                    <td>Trident</td>
                                    <td>Internet
                                        Explorer 5.5
                                    </td>
                                    <td class="hidden-480">Win 95+</td>
                                    <td class="hidden-480">5.5</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Trident</td>
                                    <td>Internet
                                        Explorer 6
                                    </td>
                                    <td class="hidden-480">Win 98+</td>
                                    <td class="hidden-480">6</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Trident</td>
                                    <td>Internet Explorer 7</td>
                                    <td class="hidden-480">Win XP SP2+</td>
                                    <td class="hidden-480">7</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Trident</td>
                                    <td>AOL browser (AOL desktop)</td>
                                    <td class="hidden-480">Win XP</td>
                                    <td class="hidden-480">6</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Firefox 1.0</td>
                                    <td class="hidden-480">Win 98+ / OSX.2+</td>
                                    <td class="hidden-480">1.7</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Firefox 1.5</td>
                                    <td class="hidden-480">Win 98+ / OSX.2+</td>
                                    <td class="hidden-480">1.8</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Firefox 2.0</td>
                                    <td class="hidden-480">Win 98+ / OSX.2+</td>
                                    <td class="hidden-480">1.8</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Firefox 3.0</td>
                                    <td class="hidden-480">Win 2k+ / OSX.3+</td>
                                    <td class="hidden-480">1.9</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Camino 1.0</td>
                                    <td class="hidden-480">OSX.2+</td>
                                    <td class="hidden-480">1.8</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Camino 1.5</td>
                                    <td class="hidden-480">OSX.3+</td>
                                    <td class="hidden-480">1.8</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Netscape 7.2</td>
                                    <td class="hidden-480">Win 95+ / Mac OS 8.6-9.2</td>
                                    <td class="hidden-480">1.7</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Netscape Browser 8</td>
                                    <td class="hidden-480">Win 98SE+</td>
                                    <td class="hidden-480">1.7</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Netscape Navigator 9</td>
                                    <td class="hidden-480">Win 98+ / OSX.2+</td>
                                    <td class="hidden-480">1.8</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Mozilla 1.0</td>
                                    <td class="hidden-480">Win 95+ / OSX.1+</td>
                                    <td class="hidden-480">1</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Mozilla 1.1</td>
                                    <td class="hidden-480">Win 95+ / OSX.1+</td>
                                    <td class="hidden-480">1.1</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Mozilla 1.2</td>
                                    <td class="hidden-480">Win 95+ / OSX.1+</td>
                                    <td class="hidden-480">1.2</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Mozilla 1.3</td>
                                    <td class="hidden-480">Win 95+ / OSX.1+</td>
                                    <td class="hidden-480">1.3</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Mozilla 1.4</td>
                                    <td class="hidden-480">Win 95+ / OSX.1+</td>
                                    <td class="hidden-480">1.4</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Mozilla 1.5</td>
                                    <td class="hidden-480">Win 95+ / OSX.1+</td>
                                    <td class="hidden-480">1.5</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Mozilla 1.6</td>
                                    <td class="hidden-480">Win 95+ / OSX.1+</td>
                                    <td class="hidden-480">1.6</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Mozilla 1.7</td>
                                    <td class="hidden-480">Win 98+ / OSX.1+</td>
                                    <td class="hidden-480">1.7</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Mozilla 1.8</td>
                                    <td class="hidden-480">Win 98+ / OSX.1+</td>
                                    <td class="hidden-480">1.8</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Seamonkey 1.1</td>
                                    <td class="hidden-480">Win 98+ / OSX.2+</td>
                                    <td class="hidden-480">1.8</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Gecko</td>
                                    <td>Epiphany 2.20</td>
                                    <td class="hidden-480">Gnome</td>
                                    <td class="hidden-480">1.8</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Webkit</td>
                                    <td>Safari 1.2</td>
                                    <td class="hidden-480">OSX.3</td>
                                    <td class="hidden-480">125.5</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Webkit</td>
                                    <td>Safari 1.3</td>
                                    <td class="hidden-480">OSX.3</td>
                                    <td class="hidden-480">312.8</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Webkit</td>
                                    <td>Safari 2.0</td>
                                    <td class="hidden-480">OSX.4+</td>
                                    <td class="hidden-480">419.3</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Webkit</td>
                                    <td>Safari 3.0</td>
                                    <td class="hidden-480">OSX.4+</td>
                                    <td class="hidden-480">522.1</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Webkit</td>
                                    <td>OmniWeb 5.5</td>
                                    <td class="hidden-480">OSX.4+</td>
                                    <td class="hidden-480">420</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Webkit</td>
                                    <td>iPod Touch / iPhone</td>
                                    <td class="hidden-480">iPod</td>
                                    <td class="hidden-480">420.1</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Webkit</td>
                                    <td>S60</td>
                                    <td class="hidden-480">S60</td>
                                    <td class="hidden-480">413</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Presto</td>
                                    <td>Opera 7.0</td>
                                    <td class="hidden-480">Win 95+ / OSX.1+</td>
                                    <td class="hidden-480">-</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Presto</td>
                                    <td>Opera 7.5</td>
                                    <td class="hidden-480">Win 95+ / OSX.2+</td>
                                    <td class="hidden-480">-</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Presto</td>
                                    <td>Opera 8.0</td>
                                    <td class="hidden-480">Win 95+ / OSX.2+</td>
                                    <td class="hidden-480">-</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Presto</td>
                                    <td>Opera 8.5</td>
                                    <td class="hidden-480">Win 95+ / OSX.2+</td>
                                    <td class="hidden-480">-</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Presto</td>
                                    <td>Opera 9.0</td>
                                    <td class="hidden-480">Win 95+ / OSX.3+</td>
                                    <td class="hidden-480">-</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Presto</td>
                                    <td>Opera 9.2</td>
                                    <td class="hidden-480">Win 88+ / OSX.3+</td>
                                    <td class="hidden-480">-</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Presto</td>
                                    <td>Opera 9.5</td>
                                    <td class="hidden-480">Win 88+ / OSX.3+</td>
                                    <td class="hidden-480">-</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Presto</td>
                                    <td>Opera for Wii</td>
                                    <td class="hidden-480">Wii</td>
                                    <td class="hidden-480">-</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Presto</td>
                                    <td>Nokia N800</td>
                                    <td class="hidden-480">N800</td>
                                    <td class="hidden-480">-</td>
                                    <td class="hidden-480">A</td>
                                </tr>
                                <tr>
                                    <td>Presto</td>
                                    <td>Nintendo DS browser</td>
                                    <td class="hidden-480">Nintendo DS</td>
                                    <td class="hidden-480">8.5</td>
                                    <td class="hidden-480">C/A<sup>1</sup></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <!-- END EXAMPLE TABLE PORTLET-->
                </div>


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

