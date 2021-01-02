<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml"> 
 
<head> 
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" /> 
	<title>湖南省自来水公司营销管理信息系统</title> 
	
	<link rel="stylesheet" href="../css/reset.css" type="text/css" media="screen" title="no title" />
	<link rel="stylesheet" href="../css/text.css" type="text/css" media="screen" title="no title" />
	<link rel="stylesheet" href="../css/form.css" type="text/css" media="screen" title="no title" />
	<link rel="stylesheet" href="../css/buttons.css" type="text/css" media="screen" title="no title" />
	<link rel="stylesheet" href="../css/grid.css" type="text/css" media="screen" title="no title" />	
	<link rel="stylesheet" href="../css/layout.css" type="text/css" media="screen" title="no title" />	
	
	<link rel="stylesheet" href="../css/ui-darkness/jquery-ui-1.8.12.custom.css" type="text/css" media="screen" title="no title" />
	<link rel="stylesheet" href="../css/plugin/jquery.visualize.css" type="text/css" media="screen" title="no title" />
	<link rel="stylesheet" href="../css/plugin/facebox.css" type="text/css" media="screen" title="no title" />
	<link rel="stylesheet" href="../css/plugin/uniform.default.css" type="text/css" media="screen" title="no title" />
	<link rel="stylesheet" href="../css/plugin/dataTables.css" type="text/css" media="screen" title="no title" />
	
	<link rel="stylesheet" href="../css/custom.css" type="text/css" media="screen" title="no title">
	
</head> 
 
<body> 

<div id="wrapper">	
	
	<div id="header">
		
		<div class="content_pad">
			<h1><a href="../workspace.ftl">湖南省自来水公司营销管理信息系统</a></h1>
			
			<ul id="nav">
				
				<li class="nav_dropdown nav_icon">
					<a href="javascript:;"><span class="ui-icon ui-icon-wrench"></span>业扩工程</a>
					
					<div class="nav_menu">			
						<ul>
                            <li><a href="/be/request">01 用户申请</a></li>
                            <li><a href="/be/audit">02 初步审核</a></li>
                            <li><a href="/be/pay">03 交施工费</a></li>
                            <li><a href="/be/billclear">04 水费清算</a></li>
                            <li><a href="/be/contarct">05 供水协议</a></li>
                            <li><a href="/be/working">06 施工竣工</a></li>
                            <li><a href="/be/open">07 通水停水</a></li>
                            <li><a href="/be/save">08 档案存档</a></li>
                            <li><a href="/be/order">工单管理</a></li>
                            <li><a href="/be/abort">终止工单</a></li>
                            <li><a href="/be/reportProgress">业扩工程进度</a></li>
                            <li><a href="/be/reportMoney">业扩收费报表</a></li>
						</ul>
						
					</div>
				</li>

				<li class="nav_dropdown nav_icon">
					<a href="javascript:;"><span class="ui-icon ui-icon-person"></span>用户管理</a>
					
					<div class="nav_menu">			
						<ul>
							<li><a href="user_search.ftl">用户查询</a></li>
							<li><a href="user_add.ftl">快捷新户</a></li>
							<li><a href="user_changeName.ftl">快捷过户</a></li>
							<li><a href="user_changeBank.ftl">快捷代扣</a></li>
							<li><a href="user_changeMeter.ftl">快捷换表</a></li>
							<li><a href="user_changeFormula.ftl">快捷重签</a></li>
							<li><a href="user_delete.ftl">快捷销户</a></li>
							<li><a href="user_reportShortcut.ftl">快捷操作记录</a></li>
							<li><a href="user_docNum.ftl">档案号管理</a></li>
							<li><a href="user_sendMsg.ftl">短信群发</a></li>
						</ul>
						
					</div>
				</li>

				<li class="nav_dropdown nav_icon">
					<a href="javascript:;"><span class="ui-icon ui-icon-pencil"></span>抄表管理</a>
					
					<div class="nav_menu">			
						<ul>
                            <li><a href="/rd/volume_default">表册管理</a></li>
							<li><a href="rd_init.ftl">抄表初始化</a></li>
							<li><a href="rd_task.ftl">任务分配</a></li>
							<li><a href="rd_enter.ftl">抄表录入</a></li>
							<li><a href="rd_audit.ftl">抄表审核</a></li>
							<li><a href="rd_reportReading.ftl">抄表情况查询</a></li>
							<li><a href="rd_reportVolumeReading.ftl">抄表统计报表</a></li>
                            <li><a href="/rd/zeroUser">零吨位用户查询</a></li>
                            <li><a href="/rd/changeMaxValue">最大码值修正记录</a></li>
                            <li><a href="/rd/changeValue">底码修正记录</a></li>
                            <li><a href="/rd/meteUser">水表周检报表</a></li>
						</ul>
						
					</div>
				</li>
				
				<li class="nav_dropdown nav_icon">
					<a href="javascript:;"><span class="ui-icon ui-icon-star"></span>收费管理</a>
					
					<div class="nav_menu">			
						<ul>
							<li><a href="pay_window.ftl">窗口收费</a></li>
							<li><a href="pay_batch.ftl">批量收费</a></li>
							<li><a href="pay_invoiceReprint.ftl">发票补开/作废</a></li>
							<li><a href="pay_reportDebts.ftl">欠费报表</a></li>
							<li><a href="pay_reportPay.ftl">收费情况报表</a></li>
							<li><a href="pay_reportMonthRecycle.ftl">月资金回收情况报表</a></li>
							<li><a href="pay_reportBalance.ftl">用户预收情况报表</a></li>
							<li><a href="pay_reportWaterType.ftl">各类用水统计总表</a></li>
						</ul>
						
					</div>
				</li>
				
				<li class="nav_dropdown nav_icon">
					<a href="javascript:;"><span class="ui-icon ui-icon-script"></span>发票管理</a>
					
					<div class="nav_menu">			
						<ul>
							<li><a href="inv_invoiceManage.ftl">发票总表</a></li>
							<li><a href="inv_invoiceIn.ftl">发票入库</a></li>
							<li><a href="inv_invoiceOut.ftl">发票出库</a></li>
							<li><a href="inv_invoiceArchive.ftl">发票交票</a></li>
							<li><a href="inv_invoiceReportOut.ftl">发票出库情况查询</a></li>
							<li><a href="inv_invoiceReportEmp.ftl">收费人员发票查询</a></li>
							<li><a href="inv_invoiceReportArchive.ftl">发票交票情况查询</a></li>
							<li><a href="inv_invoiceReportUse.ftl">发票使用情况查询</a></li>
							<li><a href="inv_invoiceReportMoneySum.ftl">销账汇总报表</a></li>
							<li><a href="inv_invoiceReportMoneyDetail.ftl">销账明细报表</a></li>
						</ul>
					</div>
				</li>

				<li class="nav_dropdown nav_icon">
					<a href="javascript:;"><span class="ui-icon ui-icon-gear"></span>系统设置</a>
					
					<div class="nav_menu">			
						<ul>
							<li><a href="sys_area">抄表辖区</a></li>
							<li><a href="sys_meterType">水表型号</a></li>
							<li><a href="sys_dept">部门管理</a></li>
							<li><a href="sys_emp">员工管理</a></li>
							<li><a href="sys_menupower">菜单权限设置</a></li>
							<li><a href="sys_areapower">辖区权限设置</a></li>
							<li><a href="sys_waterType">用水类型设定</a></li>
							<li><a href="sys_surcharge">附加费设定</a></li>
							<li><a href="sys_flow">流程配置</a></li>
						</ul>
						
					</div>
				</li>
				
				<li class="nav_current nav_dropdown nav_icon_only">
					<a href="javascript:;">&nbsp;</a>
					
					<div class="nav_menu">
						<ul>
							<li><a href="../workspace">我的工作台</a></li>
							<li><a href="sys_pwd">修改密码</a></li>
							<li><a href="../login">退出系统</a></li>
						</ul>
					</div> <!-- .menu -->
				</li>
			</ul>
		</div> <!-- .content_pad -->
		
	</div> <!-- #header -->	
	
	<div id="masthead">
		<div>
			<span id="pagetitle"><a href="javascript:;">施工竣工</a></span>
			<span id="welcome_span">欢迎回来，${s.empName}</span>
		</div>
	</div> <!-- #masthead -->	
	
	<div id="content" class="xgrid">
		
 		
		<div class="x12">
			
			<h2>
				施工竣工 - <a href="/be/orderInfo?orderNo=${beOrder.orderNo}" id="orderNo" target="orderInfo">${beOrder.orderNo}</a>
				<a style="float:right" href="javascript:history.back(-1);">返回</a>
			</h2>
            <input type="hidden" id="userNo" value="${beOrder.userNo.userNo}">
            <input type="hidden" id="orderType" value="${beOrder.orderType}">
			<div class="buttonrow">
                <button id="recall" class="btn-icon btn-arrow-left btn-red"><span></span>撤回</button>
                <button id="send" class="btn-icon btn-arrow-right btn-blue"><span></span>发送</button>
			</div>
			
<table width="100%">
<thead>
	<tr>
		<th width="60"></th>
		<th width="220"></th>
		<th width="60"></th>
		<th width="220"></th>
		<th width="60"></th>
		<th></th>
	</tr>
</thead>
<tbody>
	<tr>
		<td>用户名称</td>
		<td><input readonly="readonly" value="${beOrder.userNo.userName}" /></td>
		<td>所属辖区</td>
		<td><select id="areaId" style="width:156px;">
			<#list syAreas as sa>
				<#if beOrder.areaId ?? >
					<#if beOrder.areaId.id == sa.id>
						<option value="${sa.id}" selected>${sa.areaName}</option>
					<#else >
						<option value="${sa.id}">${sa.areaName}</option>
					</#if>
				<#else >
					<option value="${sa.id}">${sa.areaName}</option>
				</#if>
			</#list>
		</select></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td>开工日期</td>
		<td>
			<#if beOrder.projectDate1 ??>
                <input type="date" id="projectDate1" value="${beOrder.projectDate1}" />
			<#else >
				<input type="date" id="projectDate1" value=""  />
			</#if>
		</td>
		<td>竣工日期</td>
		<td>
			<#if beOrder.projectDate2 ??>
                <input type="date" id="projectDate2" value="${beOrder.projectDate2}"  />
			<#else >
				<input type="date" id="projectDate2" value=""  />
			</#if>
		</td>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
</tbody>
</table>

<table class="data display">
<thead>
	<tr>
		<th width="30">序号</th>
		<th width="80">姓名</th>
		<th>表径</th>
		<th>表身码</th>
		<th>最大表码值</th>
		<th>起始码</th>
		<th>水表厂家</th>
		<th></th>
	</tr>
</thead>
<tbody>
<#list beOrderusers as bou>
	<tr class="odd">
		<td>${bou_index+1}</td>
		<td>${bou.userName}</td>
		<td><select class="meterTypeid" style="width:100px;">
			<#list syMetertypes as sm>
				<option value="${sm.id}">${sm.meterTypeName}</option>
			</#list>
			</select></td>
		<td>
			<#if bou.meterName ??>
                <input size="15" class="meterName" value="${bou.meterName}" />
			<#else >
				<input size="15" class="meterName" value="" />
			</#if>
		</td>
		<td>
			<#if bou.maxValue ??>
                <input size="15" class="maxValue" value="${bou.maxValue}" />
			<#else >
				<input size="15" class="maxValue" value="" />
			</#if>
		</td>
		<td>
			<#if bou.startValue ??>
                <input size="15" class="startValue" value="${bou.startValue}" />
			<#else >
				<input size="15" class="startValue" value="" />
			</#if>
		</td>
		<td>
			<#if bou.meterFactory ??>
                <input size="15" class="meterFactory" value="${bou.meterFactory}" />
			<#else >
				<input size="15" class="meterFactory" value="" />
			</#if>
		</td>
		<td></td>
	</tr>
</#list>
</tbody>
</table>

<div class="centerButtons">
	<button class="btn baoCun">保存不发送</button>
</div>
			
		</div> <!-- .x12 -->
		
	</div> <!-- #content -->
	
	<div id="footer">		
		<div class="content_pad">			
			<p>&copy; 2013-11 版权所有 <a href="#">湖南省自来水公司</a>.   技术支持 <a href="#">华瑞教育</a>.</p>
		</div> <!-- .content_pad -->
	</div> <!-- #footer -->
	
</div> <!-- #wrapper -->

<script src="../js/jquery/jquery-1.5.2.min.js"></script>
<script src="../js/jquery/jquery-ui-1.8.12.custom.min.js"></script>
<script src="../js/misc/excanvas.min.js"></script>
<script src="../js/jquery/facebox.js"></script>
<script src="../js/jquery/jquery.visualize.js"></script>
<script src="../js/jquery/jquery.dataTables.min.js"></script>
<script src="../js/jquery/jquery.tablesorter.min.js"></script>
<script src="../js/jquery/jquery.uniform.min.js"></script>
<script src="../js/jquery/jquery.placeholder.min.js"></script>

<script src="../js/widgets.js"></script>
<script src="../js/dashboard.js"></script>

<script type="text/javascript">
	
$(document).ready ( function () 
{
	Dashboard.init ();		
});

$(function () {

    $(".baoCun").click(function () {
        aa("baoCun");
    })

    $("#send").click(function () {
        if (!confirm("你确定要发送吗？")) {
            return false;
        }
        aa("send");
    })

    $("#recall").click(function () {
        if (!confirm("你确定要撤回吗？")) {
            return false;
        }
        aa("recall");
    })

    var aa = function(stmt) {
        var orderNo = $("#orderNo").text(); //工单号
        var orderType = $("#orderType").val();
        var userNo = $("#userNo").val();
        var areaId = $("#areaId").val();
        var projectDate1 = $("#projectDate1").val();
        var projectDate2 = $("#projectDate2").val();
        var orderUser = new Array();
        $('.odd').each(function (i, n) {
            var userName = $(".odd:eq(" + i + ") td:eq(" + 1 + ")").text();
            var meterTypeId = $(".odd:eq(" + i + ") td:eq(" + 2 + ") .meterTypeid").val();
            var meterName = $(".odd:eq(" + i + ") td:eq(" + 3 + ") .meterName").val();
            var maxValue = $(".odd:eq(" + i + ") td:eq(" + 4 + ") .maxValue").val();
            var startValue = $(".odd:eq(" + i + ") td:eq(" + 5 + ") .startValue").val();
            var meterFactory = $(".odd:eq(" + i + ") td:eq(" + 6 + ") .meterFactory").val();
            orderUser.push({
                "userName": userName,
                "meterTypeId": meterTypeId,
                "meterName": meterName,
                "maxValue": maxValue,
                "startValue": startValue,
                "meterFactory": meterFactory
            });
        })
		console.log(stmt);
        console.log(orderNo);
        console.log(orderType);
        console.log(userNo);
        console.log(areaId);
        console.log(projectDate1);
        console.log(projectDate2);
        console.log(orderUser);
        $.ajax({
            url:"/be/disposeWorking",
            type:"post",
            data:{
                "stmt":stmt
                ,"orderNo":orderNo
                ,"orderType":orderType
                ,"userNo":userNo
                ,"areaId":areaId
                ,"projectDate1":projectDate1
                ,"projectDate2":projectDate2
                ,"orderUser":JSON.stringify(orderUser)
            },
            success:function (integer) {
                if (integer == 0){
                    alert("保存失败：请检查数据的准确性！")
                }
                if (integer==1){
                    alert("保存成功！");
                }
                if (integer==2){
                    window.location.href="/success/be/working";
                }
                if (integer==3){
                    window.location.href="/error/be/working";
                }
            }
        });
    }
})

</script>

</body> 
 
</html>