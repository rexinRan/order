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

        <title>我的日历</title>

        <meta content="width=device-width, initial-scale=1.0" name="viewport"/>

        <meta content="" name="description"/>

        <meta content="" name="author"/>
        <link rel="shortcut icon" href="/media/image/favicon.ico"/>
    </head>
    <!-- BEGIN BODY -->


    <!-- BEGIN BODY -->
<body class="page-header-fixed">
<jsp:include page="../common/index_top.jsp"/>
<jsp:include page="../common/index_left_menu.jsp"/>
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">

    <!-- BEGIN PAGE HEADER-->
    <div class="row-fluid">

        <div class="span12">
            <!-- BEGIN PAGE TITLE & BREADCRUMB-->
            <h3 class="page-title">
                Calendar
                <small>calendar page</small>
            </h3>
            <ul class="breadcrumb">
                <li>
                    <i class="icon-home"></i>
                    <a href="index.html">Home</a>
                    <i class="icon-angle-right"></i>
                </li>
                <li>
                    <a href="#">Pages</a>
                    <i class="icon-angle-right"></i>
                </li>
                <li><a href="#">Calendar</a></li>
            </ul>
            <!-- END PAGE TITLE & BREADCRUMB-->
        </div>
    </div>
    <!-- END PAGE HEADER-->
    <!-- BEGIN PAGE CONTENT-->

    <div class="row-fluid">

        <div class="portlet box blue calendar">

            <div class="portlet-title">

                <div class="caption"><i class="icon-reorder"></i>Calendar</div>

            </div>

            <div class="portlet-body light-grey">

                <div class="row-fluid">

                    <div class="span3 responsive" data-tablet="span12 fix-margin" data-desktop="span8">

                        <!-- BEGIN DRAGGABLE EVENTS PORTLET-->

                        <h3 class="event-form-title">Draggable Events</h3>

                        <div id="external-events">

                            <form class="inline-form">

                                <input type="text" value="" class="m-wrap span12" placeholder="Event Title..."
                                       id="event_title"/><br/>

                                <a href="javascript:;" id="event_add" class="btn green">Add Event</a>

                            </form>

                            <hr/>

                            <div id="event_box">

                            </div>

                            <label for="drop-remove">

                                <input type="checkbox" id="drop-remove"/>remove after drop

                            </label>

                            <hr class="visible-phone"/>

                        </div>

                        <!-- END DRAGGABLE EVENTS PORTLET-->

                    </div>

                    <div class="span9">

                        <div id="calendar" class="has-toolbar"></div>

                    </div>

                </div>

                <!-- END CALENDAR PORTLET-->
            </div>


            <!-- END PAGE CONTENT-->

        </div>

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

    <jsp:include page="../common/footerIndex.jsp"/>

    <div class="footer-tools">

			<span class="go-top">

			<i class="icon-angle-up"></i>

			</span>

    </div>

</div>

<!-- END FOOTER -->


</body>
<!-- END FOOTER -->
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
<
</div>

