<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<div class="span6">

    <div class="portlet box blue">

        <div class="portlet-title">

            <div class="caption"><i class="icon-calendar"></i>服务器状态</div>

            <div class="tools">

                <a href="" class="collapse"></a>

                <a href="#portlet-config" data-toggle="modal" class="config"></a>

                <a href="" class="reload"></a>

                <a href="" class="remove"></a>

            </div>

        </div>

        <div class="portlet-body">

            <div class="row-fluid">

                <div class="span4">

                    <div class="sparkline-chart">

                        <div class="number" id="sparkline_bar"></div>

                        <a class="title" href="#">网络 <i class="m-icon-swapright"></i></a>

                    </div>

                </div>

                <div class="margin-bottom-10 visible-phone"></div>

                <div class="span4">

                    <div class="sparkline-chart">

                        <div class="number" id="sparkline_bar2"></div>

                        <a class="title" href="#">CPU 负载 <i class="m-icon-swapright"></i></a>

                    </div>

                </div>

                <div class="margin-bottom-10 visible-phone"></div>

                <div class="span4">

                    <div class="sparkline-chart">

                        <div class="number" id="sparkline_line"></div>

                        <a class="title" href="#">负载率 <i class="m-icon-swapright"></i></a>

                    </div>

                </div>

            </div>

        </div>

    </div>

</div>
