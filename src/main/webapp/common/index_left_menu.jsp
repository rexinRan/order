<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- BEGIN SIDEBAR -->

<div class="page-sidebar nav-collapse collapse">

    <!-- BEGIN SIDEBAR MENU -->

    <ul class="page-sidebar-menu">

        <li>
            <!-- BEGIN SIDEBAR TOGGLER BUTTON -->

            <div class="sidebar-toggler hidden-phone"></div> <!-- BEGIN SIDEBAR TOGGLER BUTTON -->

        </li>

        <li>
            <!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->

            <form class="sidebar-search">

                <div class="input-box">

                    <a href="javascript:;" class="remove"></a> <input type="text"
                                                                      placeholder="搜索..."/> <input type="button"
                                                                                                   class="submit"
                                                                                                   value=" "/>

                </div>

            </form> <!-- END RESPONSIVE QUICK SEARCH FORM -->

        </li>

        <li class="start active "><a href="../system/system_index.jsp"> <i
                class="icon-home"></i> <span class="title">首页</span> <span
                class="selected"></span>

        </a></li>

        <li class=""><a href="javascript:;"> <i class="icon-cogs"></i>

            <span class="title">合同列表</span> <span class="arrow "></span>

        </a>

            <ul class="sub-menu">

                <li><a href="/to_new_order.do">

                    新建合同</a></li>

                <li><a href="/to_sale_order_detail.do">

                    销售合同</a></li>

                <li><a href="/to_buy_order_detail.do">
                    采购合同</a></li>

                <li><a href="/to_zhi_bao_jin.do">
                    质保金状态</a></li>

            </ul>
        </li>

        <li class=""><a href="javascript:;"> <i
                class="icon-bookmark-empty"></i> <span class="title">采购详细</span> <span class="arrow "></span>

        </a>

            <ul class="sub-menu">

                <li><a href="/to_buy_order.do"> 采购合同</a></li>

                <li><a href="ui_buttons.html"> 厂家</a></li>

                <li><a href="/to_file_upload.do"> 上传发票</a></li>
            </ul>
        </li>

        <li class=""><a href="javascript:;"> <i class="icon-table"></i>

            <span class="title">销售详细</span> <span class="arrow "></span>

        </a>

            <ul class="sub-menu">

                <li><a href="form_layout.html"> 销售合同</a></li>

                <li><a href="form_samples.html"> 买家</a></li>

            </ul>
        </li>

        <li class=""><a href="javascript:;"> <i
                class="icon-briefcase"></i> <span class="title">款项详细</span> <span
                class="arrow "></span>

        </a>

            <ul class="sub-menu">

                <li><a href="page_timeline.html"> <i class="icon-time"></i>

                    采购款
                </a></li>

                <li><a href="page_coming_soon.html"> <i
                        class="icon-cogs"></i> 销售款
                </a></li>

                <li><a href="page_blog.html"> <i class="icon-comments"></i>

                    质保金
                </a></li>

                <li><a href="page_blog_item.html"> <i class="icon-font"></i>

                    已收款
                </a></li>

                <li><a href="page_news.html"> <i class="icon-coffee"></i>

                    未收款
                </a></li>

                <li><a href="page_news_item.html"> <i class="icon-bell"></i>

                    总利润
                </a>

            </ul>
        </li>

        <li class=""><a href="/to_log_surveillance.do"> <i class="icon-gift"></i>

            <span class="title">监控日志</span> <span class="arrow "></span>

        </a>
        </li>
        </li>

    </ul>

    <!-- END SIDEBAR MENU -->

</div>


<!-- END SIDEBAR -->