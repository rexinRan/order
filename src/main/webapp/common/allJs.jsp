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

<!--[if IE 9]>

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

<script type="text/javascript" src="<%=basePath%>/media/js/form-wizard.js"></script>
<script type="text/javascript" src="<%=basePath%>/media/js/jquery.bootstrap.wizard.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/media/js/chosen.jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/media/js/select2.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/media/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/media/js/additional-methods.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/media/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="<%=basePath%>/media/js/DT_bootstrap.js"></script>
<%--<script type="text/javascript" src="<%=basePath%>/media/js/table-advanced.js"></script>--%>
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="<%=basePath%>/media/js/jquery.fancybox.pack.js"></script>
<!-- BEGIN:File Upload Plugin JS files-->
<script src="<%=basePath%>/media/js/jquery.ui.widget.js"></script>
<!-- The Templates plugin is included to render the upload/download listings -->
<script src="<%=basePath%>/media/js/tmpl.min.js"></script>
<!-- The Load Image plugin is included for the preview images and image resizing functionality -->
<script src="<%=basePath%>/media/js/load-image.min.js"></script>
<!-- The Canvas to Blob plugin is included for image resizing functionality -->
<script src="<%=basePath%>/media/js/canvas-to-blob.min.js"></script>
<!-- The Iframe Transport is required for browsers without support for XHR file uploads -->
<script src="<%=basePath%>/media/js/jquery.iframe-transport.js"></script>
<!-- The basic File Upload plugin -->
<script src="<%=basePath%>/media/js/jquery.fileupload.js"></script>
<!-- The File Upload file processing plugin -->
<script src="<%=basePath%>/media/js/jquery.fileupload-fp.js"></script>
<!-- The File Upload user interface plugin -->
<script src="<%=basePath%>/media/js/jquery.fileupload-ui.js"></script>
<!-- The XDomainRequest Transport is included for cross-domain file deletion for IE8+ -->
<!--[if gte IE 8]><script src="../media/js/jquery.xdr-transport.js"></script><![endif]-->
<!-- END:File Upload Plugin JS files-->
<!-- END PAGE LEVEL PLUGINS -->
<%--<script src="<%=basePath%>/media/js/form-fileupload.js">--%>
<script src="<%=basePath%>/media/js/jquery-form.js"></script>

<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>

<!-- END PAGE LEVEL SCRIPTS -->