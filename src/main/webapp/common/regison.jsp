<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<div class="clearfix"></div>

<div class="row-fluid">

    <div class="span6">
        <!-- BEGIN REGIONAL STATS PORTLET-->

        <div class="portlet">

            <div class="portlet-title">

                <div class="caption"><i class="icon-globe"></i>区域统计</div>

                <div class="tools">

                    <a href="" class="collapse"></a>

                    <a href="#portlet-config" data-toggle="modal" class="config"></a>

                    <a href="" class="reload"></a>

                    <a href="" class="remove"></a>

                </div>

            </div>

            <div class="portlet-body">

                <div id="region_statistics_loading">

                    <img src="../media/image/loading.gif" alt="loading"/>

                </div>

                <div id="region_statistics_content" class="hide">

                    <div class="btn-toolbar">

                        <div class="btn-group " data-toggle="buttons-radio">

                            <a href="" class="btn mini active">用户</a>

                            <a href="" class="btn mini">订单</a>

                        </div>

                        <div class="btn-group pull-right">

                            <a href="" class="btn mini dropdown-toggle" data-toggle="dropdown">

                                选择区域 <span class="icon-angle-down"></span>

                            </a>

                            <ul class="dropdown-menu pull-right">

                                <li><a href="javascript:;" id="regional_stat_world">世界</a></li>

                                <li><a href="javascript:;" id="regional_stat_usa">亚洲</a></li>

                                <li><a href="javascript:;" id="regional_stat_europe">美洲</a></li>

                                <li><a href="javascript:;" id="regional_stat_russia">俄罗斯</a></li>

                                <li><a href="javascript:;" id="regional_stat_germany">德国</a>
                                </li>

                            </ul>

                        </div>

                    </div>

                    <div id="vmap_world" class="vmaps chart hide"></div>

                    <div id="vmap_usa" class="vmaps chart hide"></div>

                    <div id="vmap_europe" class="vmaps chart hide"></div>

                    <div id="vmap_russia" class="vmaps chart hide"></div>

                    <div id="vmap_germany" class="vmaps chart hide"></div>

                </div>

            </div>

        </div>

        <!-- END REGIONAL STATS PORTLET-->
    </div>
