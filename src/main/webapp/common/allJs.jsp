<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<base href="<%=basePath%>">
<!-- BEGIN CORE PLUGINS -->

<script src="<%=basePath%>/media/js/jquery-1.10.1.min.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery-migrate-1.2.1.min.js"
        type="text/javascript"></script>

<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->

<script src="<%=basePath%>/media/js/jquery-ui-1.10.1.custom.min.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/bootstrap.min.js"
        type="text/javascript"></script>

<!--[if lt IE 9]>

<script src="<%=basePath%>/media/js/excanvas.min.js"></script>

<script src="<%=basePath%>/media/js/respond.min.js"></script>

<![endif]-->

<script src="<%=basePath%>/media/js/jquery.slimscroll.min.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.blockui.min.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.cookie.min.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.uniform.min.js"
        type="text/javascript"></script>

<!-- END CORE PLUGINS -->

<!-- BEGIN PAGE LEVEL PLUGINS -->

<script src="<%=basePath%>/media/js/jquery.vmap.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.vmap.russia.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.vmap.world.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.vmap.europe.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.vmap.germany.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.vmap.usa.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.vmap.sampledata.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.flot.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.flot.resize.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.pulsate.min.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/date.js" type="text/javascript"></script>

<script src="<%=basePath%>/media/js/daterangepicker.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.gritter.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/fullcalendar.min.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.easy-pie-chart.js"
        type="text/javascript"></script>

<script src="<%=basePath%>/media/js/jquery.sparkline.min.js"
        type="text/javascript"></script>

<!-- END PAGE LEVEL PLUGINS -->

<!-- BEGIN PAGE LEVEL SCRIPTS -->

<script src="<%=basePath%>/media/js/app.js" type="text/javascript"></script>

<script src="<%=basePath%>/media/js/index.js" type="text/javascript"></script>
<script src="<%=basePath%>/media/js/lock.js" type="text/javascript"></script>
<script src="<%=basePath%>/media/js/inbox.js" type="text/javascript"></script>
<script src="<%=basePath%>/media/js/calendar.js" type="text/javascript"></script>

<!-- END PAGE LEVEL SCRIPTS -->