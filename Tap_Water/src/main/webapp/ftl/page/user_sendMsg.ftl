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
							<li><a href="be_order.ftl">工单管理</a></li>
							<li><a href="be_abort.ftl">终止工单</a></li>
							<li><a href="be_reportProgress.ftl">业扩工程进度</a></li>
							<li><a href="be_reportMoney.ftl">业扩收费报表</a></li>
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
							<li><a href="../page/user_sendMsg.ftl">短信群发</a></li>
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
							<li><a href="sys_area.ftl">抄表辖区</a></li>
							<li><a href="sys_meterType.ftl">水表型号</a></li>
							<li><a href="sys_dept.ftl">部门管理</a></li>
							<li><a href="sys_emp.ftl">员工管理</a></li>
							<li><a href="sys_menupower.ftl">菜单权限设置</a></li>
							<li><a href="sys_areapower.ftl">辖区权限设置</a></li>
							<li><a href="sys_waterType.ftl">用水类型设定</a></li>
							<li><a href="sys_surcharge.ftl">附加费设定</a></li>
							<li><a href="sys_flow.ftl">流程配置</a></li>
						</ul>
						
					</div>
				</li>
				
				<li class="nav_current nav_dropdown nav_icon_only">
					<a href="javascript:;">&nbsp;</a>
					
					<div class="nav_menu">
						<ul>
							<li><a href="../workspace.ftl">我的工作台</a></li>
							<li><a href="sys_pwd.ftl">修改密码</a></li>
							<li><a href="../login.ftl">退出系统</a></li>
						</ul>
					</div> <!-- .menu -->
				</li>
			</ul>
		</div> <!-- .content_pad -->
		
	</div> <!-- #header -->	
	
	<div id="masthead">
		<div>
			<span id="pagetitle"><a href="javascript:;">短信群发</a></span>
			<span id="welcome_span">欢迎回来，马云</span>
		</div>
	</div> <!-- #masthead -->	
	
	<div id="content" class="xgrid" >

		<div class="x12">
			
			<h2>短信群发</h2>
			
			<div class="height40">
				<button class="btn btn-small btn-icon btn-arrow-right"><span></span>发送</button>
				<button class="btn btn-small btn-icon btn-print"><span></span>导出为Excel文件</button>
			</div>
			<div class="height40">
				群发内容 <input style="width:550px;" value="尊敬的用户{用户姓名}，您好。你户已欠缴水费 {欠费金额} 元，请在三天内至我公司收费大厅结清水费，否则将停止供水。" />
				<select style="width:140px;">
					<option>给所有用户发送</option>
					<option selected="selected">只给欠费用户发送</option>
				</select>
				<button class="btn btn-small btn-icon btn-refresh"><span></span>重新生成发送内容</button>
			</div>
			<div class="height40">
				注：使用 <span class="red">{用户姓名}</span> 代替用户的名字，
				使用 <span class="red">{欠费金额}</span> 代替用户的欠费金额。
			</div>
			
			
			<div class="reportTitle">
				短信群发
			</div>
			<table class="report">
			<thead>
				<tr>
					<th width="80">用户编码</th>
					<th width="80">用户姓名</th>
					<th width="80">短信号码</th>
					<th>发送内容</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td class="left">0100000987</td>
					<td class="left">张三</td>
					<td class="left">13873823741</td>
					<td class="left">尊敬的用户张三，您好。你户已欠缴水费 1377.16 元，请在三天内至我公司收费大厅结清水费，否则将停止供水。</td>
				</tr>
				<tr>
					<td class="left">0100000987</td>
					<td class="left">李四</td>
					<td class="left">1387434334</td>
					<td class="left">尊敬的用户李四，您好。你户已欠缴水费 3.16 元，请在三天内至我公司收费大厅结清水费，否则将停止供水。</td>
				</tr>
				<tr>
					<td class="left">0100000987</td>
					<td class="left">王五</td>
					<td class="left">1386565656</td>
					<td class="left">尊敬的用户王五，您好。你户已欠缴水费 33.45 元，请在三天内至我公司收费大厅结清水费，否则将停止供水。</td>
				</tr>
				<tr>
					<td class="left">0100000987</td>
					<td class="left">赵六</td>
					<td class="left">1387767567
					<td class="left">尊敬的用户赵六，您好。你户已欠缴水费 44.32 元，请在三天内至我公司收费大厅结清水费，否则将停止供水。</td>
				</tr>
				<tr>
					<td class="left">0100000987</td>
					<td class="left">钱七</td>
					<td class="left">1387376575
					<td class="left">尊敬的用户钱七，您好。你户已欠缴水费 1324.16 元，请在三天内至我公司收费大厅结清水费，否则将停止供水。</td>
				</tr>
				<tr>
					<td class="left">0100000987</td>
					<td class="left">唐八</td>
					<td class="left">1387387676</td>
					<td class="left">尊敬的用户唐八，您好。你户已欠缴水费 1377.16 元，请在三天内至我公司收费大厅结清水费，否则将停止供水。</td>
				</tr>
				<tr>
					<td class="left">0100000987</td>
					<td class="left">何九</td>
					<td class="left">13873823741</td>
					<td class="left">尊敬的用户何九，您好。你户已欠缴水费 1377.16 元，请在三天内至我公司收费大厅结清水费，否则将停止供水。</td>
				</tr>
				<tr>
					<td class="left">0100000987</td>
					<td class="left">布十</td>
					<td class="left">13873823741</td>
					<td class="left">尊敬的用户布十，您好。你户已欠缴水费 1371.16 元，请在三天内至我公司收费大厅结清水费，否则将停止供水。</td>
				</tr>
				<tr>
					<td class="left">0100000987</td>
					<td class="left">李世民</td>
					<td class="left">13873823741</td>
					<td class="left">尊敬的用户李世民，您好。你户已欠缴水费 1337.16 元，请在三天内至我公司收费大厅结清水费，否则将停止供水。</td>
				</tr>
				<tr>
					<td class="left">0100000987</td>
					<td class="left">李靖</td>
					<td class="left">13873823741</td>
					<td class="left">尊敬的用户李靖，您好。你户已欠缴水费 2377.16 元，请在三天内至我公司收费大厅结清水费，否则将停止供水。</td>
				</tr>
			</tbody>
			</table>
			<div class="page">
				<a href="#">第一页</a>
				<a href="#">上一页</a>
				<input class="pageIndex" value="1"/> / <input class="pageCount" readonly="readonly" value="98765" />
				<a href="#">下一页</a>
				<a href="#">第未页</a>
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
<script src="../My97DatePicker/WdatePicker.js"></script>

<script type="text/javascript">
	
$(document).ready ( function () 
{
	Dashboard.init ();
	
});


</script>

</body> 
 
</html>