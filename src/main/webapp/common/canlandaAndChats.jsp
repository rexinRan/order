<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<div class="clearfix"></div>
<div class="row-fluid">

    <div class="span6">

        <!-- BEGIN PORTLET-->

        <div class="portlet box blue calendar">

            <div class="portlet-title">

                <div class="caption"><i class="icon-calendar"></i>日历</div>

            </div>

            <div class="portlet-body light-grey">

                <div id="calendar">

                </div>

            </div>

        </div>

        <!-- END PORTLET-->

    </div>

    <div class="span6">

        <!-- BEGIN PORTLET-->

        <div class="portlet">

            <div class="portlet-title line">

                <div class="caption"><i class="icon-comments"></i>聊天</div>

                <div class="tools">

                    <a href="" class="collapse"></a>

                    <a href="#portlet-config" data-toggle="modal" class="config"></a>

                    <a href="" class="reload"></a>

                    <a href="" class="remove"></a>

                </div>

            </div>

            <div class="portlet-body" id="chats">

                <div class="scroller" data-height="435px" data-always-visible="1"
                     data-rail-visible1="1">

                    <ul class="chats">

                        <li class="in">

                            <img class="avatar" alt="" src="../media/image/avatar1.jpg"/>

                            <div class="message">

                                <span class="arrow"></span>

                                <a href="#" class="name">人名</a>

                                <span class="datetime">时间 Jul 25, 2012 11:09</span>

                                <span class="body">

													内容

													</span>

                            </div>

                        </li>

                        <li class="out">

                            <img class="avatar" alt="" src="../media/image/avatar2.jpg"/>

                            <div class="message">

                                <span class="arrow"></span>

                                <a href="#" class="name">人名（回复人）</a>

                                <span class="datetime">时间at Jul 25, 2012 11:09</span>

                                <span class="body">

													内容
													</span>

                            </div>

                        </li>

                        <li class="in">

                            <img class="avatar" alt="Src指向人物头像" src="../media/image/avatar1.jpg"/>

                            <div class="message">

                                <span class="arrow"></span>

                                <a href="#" class="name">人名</a>

                                <span class="datetime">时间at Jul 25, 2012 11:09</span>

                                <span class="body">

													内容
													</span>

                            </div>

                        </li>

                    </ul>
                </div>

                <div class="chat-form">

                    <div class="input-cont">

                        <input class="m-wrap" type="text"
                               placeholder="Type a message here..."/>

                    </div>

                    <div class="btn-cont">

                        <span class="arrow"></span>

                        <a href="" class="btn blue icn-only"><i
                                class="icon-ok icon-white"></i></a>

                    </div>

                </div>

            </div>

        </div>

        <!-- END PORTLET-->