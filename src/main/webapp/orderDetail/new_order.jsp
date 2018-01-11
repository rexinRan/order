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
                    <div class="portlet box blue" id="form_wizard_1">
                        <div class="portlet-title">
                            <div class="caption">
                                <i class="icon-reorder"></i> Form Wizard - <span class="step-title">Step 1 of 4</span>
                            </div>
                            <div class="tools hidden-phone">
                                <a href="javascript:;" class="collapse"></a>
                                <a href="#portlet-config" data-toggle="modal" class="config"></a>
                                <a href="javascript:;" class="reload"></a>
                                <a href="javascript:;" class="remove"></a>
                            </div>
                        </div>
                        <div class="portlet-body form">
                            <form action="#" class="form-horizontal" id="submit_form">
                                <div class="form-wizard">
                                    <div class="navbar steps">
                                        <div class="navbar-inner">
                                            <ul class="row-fluid">
                                                <li class="span3">
                                                    <a href="#tab1" data-toggle="tab" class="step active">
                                                        <span class="number">1</span>
                                                        <span class="desc"><i class="icon-ok"></i> Account Setup</span>
                                                    </a>
                                                </li>
                                                <li class="span3">
                                                    <a href="#tab2" data-toggle="tab" class="step">
                                                        <span class="number">2</span>
                                                        <span class="desc"><i class="icon-ok"></i> Profile Setup</span>
                                                    </a>
                                                </li>
                                                <li class="span3">
                                                    <a href="#tab3" data-toggle="tab" class="step">
                                                        <span class="number">3</span>
                                                        <span class="desc"><i class="icon-ok"></i> Billing Setup</span>
                                                    </a>
                                                </li>
                                                <li class="span3">
                                                    <a href="#tab4" data-toggle="tab" class="step">
                                                        <span class="number">4</span>
                                                        <span class="desc"><i class="icon-ok"></i> Confirm</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div id="bar" class="progress progress-success progress-striped">
                                        <div class="bar"></div>
                                    </div>
                                    <div class="tab-content">
                                        <div class="alert alert-error hide">
                                            <button class="close" data-dismiss="alert"></button>
                                            You have some form errors. Please check below.
                                        </div>
                                        <div class="alert alert-success hide">
                                            <button class="close" data-dismiss="alert"></button>
                                            Your form validation is successful!
                                        </div>
                                        <div class="tab-pane active" id="tab1">
                                            <h3 class="block">Provide your account details</h3>
                                            <div class="control-group">
                                                <label class="control-label">Username<span
                                                        class="required">*</span></label>
                                                <div class="controls">
                                                    <input type="text" class="span6 m-wrap" name="username"/>
                                                    <span class="help-inline">Provide your username</span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Password<span
                                                        class="required">*</span></label>
                                                <div class="controls">
                                                    <input type="password" class="span6 m-wrap" name="password"
                                                           id="submit_form_password"/>
                                                    <span class="help-inline">Provide your username</span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Confirm Password<span
                                                        class="required">*</span></label>
                                                <div class="controls">
                                                    <input type="password" class="span6 m-wrap" name="rpassword"/>
                                                    <span class="help-inline">Confirm your password</span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Email<span
                                                        class="required">*</span></label>
                                                <div class="controls">
                                                    <input type="text" class="span6 m-wrap" name="email"/>
                                                    <span class="help-inline">Provide your email address</span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="tab-pane" id="tab2">
                                            <h3 class="block">Provide your profile details</h3>
                                            <div class="control-group">
                                                <label class="control-label">Fullname<span
                                                        class="required">*</span></label>
                                                <div class="controls">
                                                    <input type="text" class="span6 m-wrap" name="fullname"/>
                                                    <span class="help-inline">Provide your fullname</span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Phone Number<span class="required">*</span></label>
                                                <div class="controls">
                                                    <input type="text" class="span6 m-wrap" name="phone"/>
                                                    <span class="help-inline">Provide your phone number</span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Gender<span
                                                        class="required">*</span></label>
                                                <div class="controls">
                                                    <label class="radio">
                                                        <input type="radio" name="gender" value="M" data-title="Male"/>
                                                        Male
                                                    </label>
                                                    <div class="clearfix"></div>
                                                    <label class="radio">
                                                        <input type="radio" name="gender" value="F"
                                                               data-title="Female"/>
                                                        Female
                                                    </label>
                                                    <div id="form_gender_error"></div>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Address<span
                                                        class="required">*</span></label>
                                                <div class="controls">
                                                    <input type="text" class="span6 m-wrap" name="address"/>
                                                    <span class="help-inline">Provide your street address</span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">City/Town<span
                                                        class="required">*</span></label>
                                                <div class="controls">
                                                    <input type="text" class="span6 m-wrap" name="city"/>
                                                    <span class="help-inline">Provide your city or town</span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Country</label>
                                                <div class="controls">
                                                    <select name="country" id="country_list" class="span6">
                                                        <option value="">Select</option>
                                                        <option value="AF">Afghanistan</option>
                                                        <option value="AL">Albania</option>
                                                        <option value="DZ">Algeria</option>
                                                        <option value="BZ">Belize</option>

                                                    </select>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Remarks</label>
                                                <div class="controls">
                                                    <textarea class="span6 m-wrap" rows="3" name="remarks"></textarea>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="tab-pane" id="tab3">
                                            <h3 class="block">Provide your billing and credit card details</h3>
                                            <div class="control-group">
                                                <label class="control-label">Card Holder Name<span
                                                        class="required">*</span></label>
                                                <div class="controls">
                                                    <input type="text" class="span6 m-wrap" name="card_name"/>
                                                    <span class="help-inline"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Card Number<span class="required">*</span></label>
                                                <div class="controls">
                                                    <input type="text" class="span6 m-wrap" name="card_number"/>
                                                    <span class="help-inline"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">CVC<span class="required">*</span></label>
                                                <div class="controls">
                                                    <input type="text" placeholder="" class="m-wrap" name="card_cvc"/>
                                                    <span class="help-inline"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Expiration(MM/YYYY)<span
                                                        class="required">*</span></label>
                                                <div class="controls">
                                                    <input type="text" placeholder="MM" maxlength="2"
                                                           class="m-wrap small" name="card_expiry_mm"/>
                                                    <input type="text" placeholder="YYYY" maxlength="4"
                                                           class="m-wrap small" name="card_expiry_yyyy"/>
                                                    <span class="help-inline"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Payment Options<span
                                                        class="required">*</span></label>
                                                <div class="controls">
                                                    <label class="checkbox line">
                                                        <input type="checkbox" name="payment[]" value="1"
                                                               data-title="Auto-Pay with this Credit Card."/> Auto-Pay
                                                        with this Credit Card
                                                    </label>
                                                    <label class="checkbox line">
                                                        <input type="checkbox" name="payment[]" value="2"
                                                               data-title="Email me monthly billing."/> Email me monthly
                                                        billing
                                                    </label>
                                                    <div id="form_payment_error"></div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="tab-pane" id="tab4">
                                            <h3 class="block">Confirm your account</h3>
                                            <h4 class="form-section">Account</h4>
                                            <div class="control-group">
                                                <label class="control-label">Username:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="username"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Email:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="email"></span>
                                                </div>
                                            </div>
                                            <h4 class="form-section">Profile</h4>
                                            <div class="control-group">
                                                <label class="control-label">Fullname:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="fullname"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Gender:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="gender"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Phone:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="phone"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Address:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="address"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">City/Town:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="city"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Country:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="country"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Remarks:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="remarks"></span>
                                                </div>
                                            </div>
                                            <h4 class="form-section">Billing</h4>
                                            <div class="control-group">
                                                <label class="control-label">Card Holder Name:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="card_name"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Card Number:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="card_number"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">CVC:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="card_cvc"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Expiration:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="card_expiry"></span>
                                                </div>
                                            </div>
                                            <div class="control-group">
                                                <label class="control-label">Payment Options:</label>
                                                <div class="controls">
                                                    <span class="text display-value" data-display="payment"></span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-actions clearfix">
                                        <a href="javascript:;" class="btn button-previous">
                                            <i class="m-icon-swapleft"></i> Back
                                        </a>
                                        <a href="javascript:;" class="btn blue button-next">
                                            Continue <i class="m-icon-swapright m-icon-white"></i>
                                        </a>
                                        <a href="javascript:;" class="btn green button-submit">
                                            Submit <i class="m-icon-swapright m-icon-white"></i>
                                        </a>
                                    </div>
                                </div>
                            </form>
                        </div>

                    </div>
                    <!-- BEGIN EXAMPLE TABLE PORTLET 页面显示栏-->
                </div>
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

<!-- END PAGE LEVEL SCRIPTS -->
<script>
    jQuery(document).ready(function () {
        // initiate layout and plugins
        App.init();
        FormWizard.init();
    });
</script>
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
</body>

</html>

