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
        <script type="text/javascript">
            function fileUpload() {
                var options = {
                    url: "/fileUpload.do",
                    dataType: "json",
                    type: "post",

                    sucess: function (data) {
                        $("#allUrl").attr("src", data.url);
                        $("#fileUrl").val(data.url);
                    }
                }
                $("#fileupload").ajaxSubmit(options);

            }
        </script>
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
                    <blockquote>
                        <p style="font-size:16px">
                        </p>
                    </blockquote>
                    <br>
                    <!-- The file upload form used as target for the file upload widget -->
                    <%-- //jquery-file-upload.appspot.com/ action="" method="POST"--%>
                    <form id="fileupload"
                          enctype="multipart/form-data">
                        <!-- Redirect browsers with JavaScript disabled to the origin page -->
                        <noscript><input type="hidden" name="redirect"
                                         value="http://blueimp.github.com/jQuery-File-Upload/"></noscript>
                        <!-- The fileupload-buttonbar contains buttons to add/delete files and start/cancel the upload -->
                        <div class="row-fluid fileupload-buttonbar">

                            <div class="span7">
                                <div>
                                    <img width="120px" height="120px" style="float:left " id="allUrl"
                                         src="${file.fileUrl}">
                                </div>
                                <!-- The fileinput-button span is used to style the file input field as button -->
                                <span class="btn green fileinput-button">
									<i class="icon-plus icon-white"></i>
									<span>添加文件...</span>

                                    <input type="hidden" name="fileUrl" id="fileUrl" value="">
									<input type="file" name="files" multiple onchange="fileUpload()">
									</span>
                                <button type="submit" class="btn blue start">
                                    <i class="icon-upload icon-white"></i>
                                    <span>开始上传</span>
                                </button>
                                <button type="reset" class="btn yellow cancel">
                                    <i class="icon-ban-circle icon-white"></i>
                                    <span>取消上传</span>
                                </button>
                                <button type="button" class="btn red delete">
                                    <i class="icon-trash icon-white"></i>
                                    <span>删除文件</span>
                                </button>
                                <input type="checkbox" class="toggle fileupload-toggle-checkbox">
                            </div>
                            <!-- The global progress information -->
                            <div class="span5 fileupload-progress fade">
                                <!-- The global progress bar -->
                                <div class="progress progress-success progress-striped active" role="progressbar"
                                     aria-valuemin="0" aria-valuemax="100">
                                    <div class="bar" style="width:0%;"></div>
                                </div>
                                <!-- The extended global progress information -->
                                <div class="progress-extended">&nbsp;</div>
                            </div>
                        </div>
                        <!-- The loading indicator is shown during file processing -->
                        <div class="fileupload-loading"></div>
                        <br>
                        <!-- The table listing the files available for upload/download -->
                        <table role="presentation" class="table table-striped">
                            <tbody class="files" data-toggle="modal-gallery" data-target="#modal-gallery"></tbody>
                        </table>
                    </form>

                </div>
            </div>
            <!-- END PAGE CONTENT-->
        </div>
        <!-- END PAGE CONTAINER-->
    </div>
    <!-- BEGIN EXAMPLE TABLE PORTLET 页面显示栏-->

    <!-- END EXAMPLE TABLE PORTLET-->

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
<%--<script>
    jQuery(document).ready(function () {
        // initiate layout and plugins
        App.init();
        FormFileUpload.init();
    });
</script>--%>
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

