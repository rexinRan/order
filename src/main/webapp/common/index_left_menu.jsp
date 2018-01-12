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
                <%--
                                <li><a href="layout_sidebar_closed.html"> Sidebar Closed
                                    Page</a></li>

                                <li><a href="layout_blank_page.html"> Blank Page</a></li>

                                <li><a href="layout_boxed_page.html"> Boxed Page</a></li>

                                <li><a href="layout_boxed_not_responsive.html">

                                    Non-Responsive Boxed Layout</a></li>--%>

            </ul>
        </li>

        <li class=""><a href="javascript:;"> <i
                class="icon-bookmark-empty"></i> <span class="title">采购详细</span> <span class="arrow "></span>

        </a>

            <ul class="sub-menu">

                <li><a href="ui_general.html"> 采购合同</a></li>

                <li><a href="ui_buttons.html"> 厂家</a></li>

                <li><a href=""> 上传发票</a></li>

                <%--<li><a href="ui_tabs_accordions.html"> Tabs & Accordions</a>

                </li>

                <li><a href="ui_jqueryui.html"> jQuery UI Components</a></li>

                <li><a href="ui_sliders.html"> Sliders</a></li>

                <li><a href="ui_tiles.html"> Tiles</a></li>

                <li><a href="ui_typography.html"> Typography</a></li>

                <li><a href="ui_tree.html"> Tree View</a></li>

                <li><a href="ui_nestable.html"> Nestable List</a></li>--%>

            </ul>
        </li>

        <li class=""><a href="javascript:;"> <i class="icon-table"></i>

            <span class="title">销售详细</span> <span class="arrow "></span>

        </a>

            <ul class="sub-menu">

                <li><a href="form_layout.html"> 销售合同</a></li>

                <li><a href="form_samples.html"> 买家</a></li>

                <%--<li><a href="form_component.html"> Form Components</a></li>

                <li><a href="form_wizard.html"> Form Wizard</a></li>

                <li><a href="form_validation.html"> Form Validation</a></li>

                <li><a href="form_fileupload.html"> Multiple File Upload</a>

                </li>

                <li><a href="form_dropzone.html"> Dropzone File Upload</a></li>--%>
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

                    <%--<li><a href="page_about.html"> <i class="icon-group"></i>

                        About Us
                    </a></li>

                    <li><a href="page_contact.html"> <i
                            class="icon-envelope-alt"></i> Contact Us
                    </a></li>

                    <li><a href="page_calendar.html"> <i
                            class="icon-calendar"></i> Calendar
                    </a></li>--%>

            </ul>
        </li>

        <li class=""><a href="/to_log_surveillance.do"> <i class="icon-gift"></i>

            <span class="title">监控日志</span> <span class="arrow "></span>

        </a>
        </li>
        </li>
        <%--
                            <ul class="sub-menu">

                                <li><a href="extra_profile.html"> User Profile</a></li>

                                <li><a href="extra_lock.html"> Lock Screen</a></li>

                                <li><a href="extra_faq.html"> FAQ</a></li>

                                <li><a href="inbox.html"> Inbox</a></li>

                                <li><a href="extra_search.html"> Search Results</a></li>

                                <li><a href="extra_invoice.html"> Invoice</a></li>

                                <li><a href="extra_pricing_table.html"> Pricing Tables</a></li>

                                <li><a href="extra_image_manager.html"> Image Manager</a></li>

                                <li><a href="extra_404_option1.html"> 404 Page Option 1</a>

                                </li>

                                <li><a href="extra_404_option2.html"> 404 Page Option 2</a>

                                </li>

                                <li><a href="extra_404_option3.html"> 404 Page Option 3</a>

                                </li>

                                <li><a href="extra_500_option1.html"> 500 Page Option 1</a>

                                </li>

                                <li><a href="extra_500_option2.html"> 500 Page Option 2</a>

                                </li>

                            </ul>--%>


        <%-- <li><a class="active" href="javascript:;"> <i
                 class="icon-sitemap"></i> <span class="title">3 Level Menu</span>

             <span class="arrow "></span>

         </a>

             <ul class="sub-menu">

                 <li><a href="javascript:;"> Item 1 <span class="arrow"></span>

                 </a>

                     <ul class="sub-menu">

                         <li><a href="#">Sample Link 1</a></li>

                         <li><a href="#">Sample Link 2</a></li>

                         <li><a href="#">Sample Link 3</a></li>

                     </ul>
                 </li>

                 <li><a href="javascript:;"> Item 1 <span class="arrow"></span>

                 </a>

                     <ul class="sub-menu">

                         <li><a href="#">Sample Link 1</a></li>

                         <li><a href="#">Sample Link 1</a></li>

                         <li><a href="#">Sample Link 1</a></li>

                     </ul>
                 </li>

                 <li><a href="#"> Item 3 </a></li>

             </ul>
         </li>

         <li><a href="javascript:;"> <i class="icon-folder-open"></i>

             <span class="title">4 Level Menu</span> <span class="arrow "></span>

         </a>

             <ul class="sub-menu">

                 <li><a href="javascript:;"> <i class="icon-cogs"></i>

                     Item 1 <span class="arrow"></span>

                 </a>

                     <ul class="sub-menu">

                         <li><a href="javascript:;"> <i class="icon-user"></i>

                             Sample Link 1 <span class="arrow"></span>

                         </a>

                             <ul class="sub-menu">

                                 <li><a href="#"><i class="icon-remove"></i> Sample
                                     Link 1</a></li>

                                 <li><a href="#"><i class="icon-pencil"></i> Sample
                                     Link 1</a></li>

                                 <li><a href="#"><i class="icon-edit"></i> Sample
                                     Link 1</a></li>

                             </ul>
                         </li>

                         <li><a href="#"><i class="icon-user"></i> Sample Link
                             1</a></li>

                         <li><a href="#"><i class="icon-external-link"></i>
                             Sample Link 2</a></li>

                         <li><a href="#"><i class="icon-bell"></i> Sample Link
                             3</a></li>

                     </ul>
                 </li>

                 <li><a href="javascript:;"> <i class="icon-globe"></i>

                     Item 2 <span class="arrow"></span>

                 </a>

                     <ul class="sub-menu">

                         <li><a href="#"><i class="icon-user"></i> Sample Link
                             1</a></li>

                         <li><a href="#"><i class="icon-external-link"></i>
                             Sample Link 1</a></li>

                         <li><a href="#"><i class="icon-bell"></i> Sample Link
                             1</a></li>

                     </ul>
                 </li>

                 <li><a href="#"> <i class="icon-folder-open"></i> Item 3

                 </a></li>

             </ul>
         </li>

         <li class=""><a href="javascript:;"> <i class="icon-user"></i>

             <span class="title">Login Options</span> <span class="arrow "></span>

         </a>

             <ul class="sub-menu">

                 <li><a href="login.jsp"> Login Form 1</a></li>

                 <li><a href="login_soft.html"> Login Form 2</a></li>

             </ul>
         </li>

         <li class=""><a href="javascript:;"> <i class="icon-th"></i>

             <span class="title">Data Tables</span> <span class="arrow "></span>

         </a>

             <ul class="sub-menu">

                 <li><a href="table_basic.html"> Basic Tables</a></li>

                 <li><a href="table_responsive.html"> Responsive Tables</a></li>

                 <li><a href="table_managed.html"> Managed Tables</a></li>

                 <li><a href="table_editable.html"> Editable Tables</a></li>

                 <li><a href="table_advanced.html"> Advanced Tables</a></li>

             </ul>
         </li>

         <li class=""><a href="javascript:;"> <i
                 class="icon-file-text"></i> <span class="title">Portlets</span> <span
                 class="arrow "></span>

         </a>

             <ul class="sub-menu">

                 <li><a href="portlet_general.html"> General Portlets</a></li>

                 <li><a href="portlet_draggable.html"> Draggable Portlets</a>

                 </li>

             </ul>
         </li>

         <li class=""><a href="javascript:;"> <i
                 class="icon-map-marker"></i> <span class="title">Maps</span> <span
                 class="arrow "></span>

         </a>

             <ul class="sub-menu">

                 <li><a href="maps_google.html"> Google Maps</a></li>

                 <li><a href="maps_vector.html"> Vector Maps</a></li>

             </ul>
         </li>

         <li class="last "><a href="charts.html"> <i
                 class="icon-bar-chart"></i> <span class="title">Visual
                         Charts</span>

         </a></li>--%>

    </ul>

    <!-- END SIDEBAR MENU -->

</div>


<!-- END SIDEBAR -->