<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<div class="header navbar navbar-inverse navbar-fixed-top">

    <!-- BEGIN TOP NAVIGATION BAR -->

    <div class="navbar-inner">

        <div class="container-fluid">

            <!-- BEGIN LOGO -->

            <a class="brand" href="javascript:;"> <img
                    src="/media/image/logo.png" alt="logo"/>

            </a>

            <!-- END LOGO -->

            <!-- BEGIN RESPONSIVE MENU TOGGLER -->

            <a href="javascript:;" class="btn-navbar collapsed"
               data-toggle="collapse" data-target=".nav-collapse"> <img
                    src="/media/image/menu-toggler.png" alt=""/>

            </a>

            <!-- END RESPONSIVE MENU TOGGLER -->

            <!-- BEGIN TOP NAVIGATION MENU -->

            <ul class="nav pull-right">

                <!-- BEGIN NOTIFICATION DROPDOWN -->

                <li class="dropdown" id="header_notification_bar"><a href="#"
                                                                     class="dropdown-toggle" data-toggle="dropdown"> <i
                        class="icon-warning-sign"></i> <span class="badge">这里提示显示多少条消息</span>

                </a>

                    <ul class="dropdown-menu extended notification">

                        <li>

                            <p>这里显示消息数量</p>

                        </li>

                        <li><a href="#"> <span class="label label-success"><i
                                class="icon-plus"></i></span> 消息内容. <span class="time">发生时间</span>

                        </a></li>

                        <li><a href="#"> <span class="label label-important"><i
                                class="icon-bolt"></i></span> 消息内容. <span class="time">发生时间15分钟前</span>

                        </a></li>

                        <a href="#"> <span class="label label-important"><i
                                class="icon-bolt"></i></span> 2 user IP blocked. <span class="time">5
									hrs</span>

                        </a></li>

                        <li class="external"><a href="#">查看所有提示 <i
                                class="m-icon-swapright"></i></a></li>

                    </ul>

                </li>

                <!-- END NOTIFICATION DROPDOWN -->

                <!-- BEGIN INBOX DROPDOWN -->

                <li class="dropdown" id="header_inbox_bar"><a href="#"
                                                              class="dropdown-toggle" data-toggle="dropdown"> <i
                        class="icon-envelope"></i> <span class="badge">这里显示多少条信息</span>

                </a>

                    <ul class="dropdown-menu extended inbox">

                        <li>

                            <p>提示数量</p>

                        </li>

                        <li><a href="inbox.html?a=view"> <span class="photo"><img
                                src="/media/image/avatar2.jpg" alt="图片显示用户头像"/></span> <span
                                class="subject"> <span class="from">名字</span> <span
                                class="time">时间</span>

							</span> <span class="message"> 内容 </span>

                        </a></li>

                        <li><a href="inbox.html?a=view"> <span class="photo"><img
                                src="/media/image/avatar3.jpg" alt="图片显示用户头像"/></span> <span
                                class="subject"> <span class="from">名字</span> <span
                                class="time">时间</span>

							</span> <span class="message"> 内容 </span>

                        </a></li>


                        <li class="external"><a href="inbox.html">查看所有提示 <i
                                class="m-icon-swapright"></i></a></li>

                    </ul>
                </li>

                <!-- END INBOX DROPDOWN -->

                <!-- BEGIN TODO DROPDOWN -->

                <li class="dropdown" id="header_task_bar"><a href="#"
                                                             class="dropdown-toggle" data-toggle="dropdown"> <i
                        class="icon-tasks"></i> <span class="badge">任务数量</span>

                </a>

                    <ul class="dropdown-menu extended tasks">

                        <li>

                            <p>多少任务</p>

                        </li>

                        <li><a href="#"> <span class="task"> <span
                                class="desc">任务名称</span> <span class="percent">进度</span>

							</span> <span class="progress progress-success "> <span
                                style="width: 30%;" class="bar"></span>

							</span>

                        </a></li>

                        <li><a href="#"> <span class="task"> <span
                                class="desc">Application deployment</span> <span
                                class="percent">65%</span>

							</span> <span class="progress progress-danger progress-striped active">

									<span style="width: 65%;" class="bar"></span>

							</span>

                        </a></li>


                        <li class="external"><a href="#">查看所有任务<i
                                class="m-icon-swapright"></i></a></li>

                    </ul>
                </li>

                <!-- END TODO DROPDOWN -->

                <!-- BEGIN USER LOGIN DROPDOWN -->

                <li class="dropdown user"><a href="#" class="dropdown-toggle"
                                             data-toggle="dropdown"> <img alt=""
                                                                          src="media/image/avatar1_small.jpg"/> <span
                        class="username">用户名字</span>

                    <i class="icon-angle-down"></i>

                </a>

                    <ul class="dropdown-menu">

                        <li><a href="/to_extra_profile.do"><i class="icon-user"></i>
                            我的资料</a></li>

                        <li><a href="/to_extra_calendar.do"><i class="icon-calendar"></i>我的日历</a></li>

                        <li><a href="/to_extra_inbox.do"><i class="icon-envelope"></i>
                            我的收件箱(数量)</a></li>

                        <%--<li><a href="#"><i class="icon-tasks"></i> 我的任务</a></li>--%>

                        <li class="divider"></li>

                        <li><a href="/to_extra_lock.do"><i class="icon-lock"></i>
                            锁屏</a></li>

                        <li><a href="loginOut.jsp"><i class="icon-key"></i> 退出</a></li>

                    </ul>
                </li>

                <!-- END USER LOGIN DROPDOWN -->

            </ul>

            <!-- END TOP NAVIGATION MENU -->

        </div>

    </div>

    <!-- END TOP NAVIGATION BAR -->

</div>

<!-- END HEADER -->