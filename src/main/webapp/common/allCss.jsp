<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<base href="<%=basePath%>">
<!-- BEGIN GLOBAL MANDATORY STYLES -->

<link href="<%=basePath%>/media/css/bootstrap.min.css" rel="stylesheet"
      type="text/css"/>

<link href="<%=basePath%>/media/css/login.css" rel="stylesheet"
      type="text/css"/>

<link href="<%=basePath%>/media/css/bootstrap-responsive.min.css"
      rel="stylesheet" type="text/css"/>

<link href="<%=basePath%>/media/css/font-awesome.min.css"
      rel="stylesheet" type="text/css"/>

<link href="<%=basePath%>media/css/style-metro.css" rel="stylesheet"
      type="text/css"/>

<link href="<%=basePath%>media/css/style.css" rel="stylesheet"
      type="text/css"/>

<link href="<%=basePath%>/media/css/style-responsive.css"
      rel="stylesheet" type="text/css"/>

<link href="<%=basePath%>/media/css/default.css" rel="stylesheet"
      type="text/css" id="style_color"/>

<link href="<%=basePath%>/media/css/uniform.default.css"
      rel="stylesheet" type="text/css"/>

<!-- END GLOBAL MANDATORY STYLES -->

<!-- BEGIN PAGE LEVEL STYLES -->

<link href="<%=basePath%>/media/css/jquery.gritter.css" rel="stylesheet"
      type="text/css"/>

<link href="<%=basePath%>/media/css/daterangepicker.css"
      rel="stylesheet" type="text/css"/>

<link href="<%=basePath%>/media/css/fullcalendar.css" rel="stylesheet"
      type="text/css"/>

<link href="<%=basePath%>/media/css/jqvmap.css" rel="stylesheet"
      type="text/css" media="screen"/>

<link href="<%=basePath%>/media/css/inbox.css" rel="stylesheet"
      type="text/css" media="screen"/>

<link href="<%=basePath%>/media/css/jquery.easy-pie-chart.css"
      rel="stylesheet" type="text/css" media="screen"/>

<link href="<%=basePath%>/media/css/lock.css"
      rel="stylesheet" type="text/css" media="screen"/>


<link rel="stylesheet" type="text/css" href="<%=basePath%>/media/css/select2_metro.css"/>
<link rel="stylesheet" type="text/css" href="<%=basePath%>/media/css/chosen.css"/>
<link rel="stylesheet" href="<%=basePath%>/media/css/DT_bootstrap.css"/>
<!-- BEGIN PAGE LEVEL STYLES -->
<link href="<%=basePath%>/media/css/jquery.fancybox.css" rel="stylesheet"/>
<link href="<%=basePath%>/media/css/jquery.fileupload-ui.css" rel="stylesheet"/>
<!-- END PAGE LEVEL STYLES -->








