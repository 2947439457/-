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
	<style type="text/css">
	input.enter { 
		-moz-box-shadow: none;
		-webkit-box-shadow: none;
		box-shadow: none;
		-moz-border-radius: 0px;
		-webkit-border-radius: 0px;
		border-radius: 0px;
		border:1px solid #000; margin:0px; padding:0px; background:none;
		width:98%;
		height:100%;
		text-align:right;
	 }
	 table.data tbody td.enter {
	 	padding:0px;
		margin:0px;
		width:100px; vertical-align:middle;
	 }
	 .right a{color:#000;}
	 .state0 {color:#999;}     /*待抄*/
	 .state1 {color:#000;}     /*已抄未复核*/
	 .state2 {color:#0000FF;}  /*已复核*/
	</style>
	<script type="text/javascript">
	function setNotEnter(id){
		showDialog('确认将此条['+id+']更改为待抄状态吗？',function(){
			alert('对话框回调函数演示');
		});
	}
	
	//修改最大表码值
	function setMaxValue(id){
		showWindow({url:'../page/rd_enter_setMaxValue.html',width:560,height:340});
	}
	
	//修改上月底码 
	function setPreValue(id){
		showWindow({url:'../page/rd_enter_setPreValue.html',width:560,height:540});
	}
	</script>
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
							<li><a href="user_sendMsg.ftl">短信群发</a></li>
						</ul>
						
					</div>
				</li>

				<li class="nav_dropdown nav_icon">
					<a href="javascript:;"><span class="ui-icon ui-icon-pencil"></span>抄表管理</a>
					
					<div class="nav_menu">			
						<ul>
							<li><a href="rd_volume.ftl">表册管理</a></li>
							<li><a href="rd_init.ftl">抄表初始化</a></li>
							<li><a href="rd_task.ftl">任务分配</a></li>
							<li><a href="../page/rd_enter.ftl">抄表录入</a></li>
							<li><a href="rd_audit.ftl">抄表审核</a></li>
							<li><a href="rd_reportReading.ftl">抄表情况查询</a></li>
							<li><a href="rd_reportVolumeReading.ftl">抄表统计报表</a></li>
							<li><a href="rd_reportZero.ftl">零吨位用户查询</a></li>
							<li><a href="rd_reportMaxValue.ftl">最大码值修正记录</a></li>
							<li><a href="rd_reportCPreAmount.ftl">底码修正记录</a></li>
							<li><a href="rd_reportMeterCheck.ftl">水表周检报表</a></li>
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
			<span id="pagetitle"><a href="javascript:;">抄表录入</a></span>
			<span id="welcome_span">欢迎回来，马云</span>
		</div>
	</div> <!-- #masthead -->	
	
	<div id="content" class="xgrid">

		<div class="x12">
			
			<h2>
				抄表录入 - 2013年12月 - 城东#1（共406户）
				<div style="float:right;">
					选择表册 
					<select class="medium" >
						<optgroup label="城东区">
							<option>城东#1</option>
							<option>城东#2</option>
						</optgroup>
						<optgroup label="城南区">
							<option>城南#1</option>
							<option>城南#2</option>
						</optgroup>
						<optgroup label="城西区">
							<option>城西#1</option>
							<option>城西#2</option>
						</optgroup>
						<optgroup label="城北区">
							<option>城北#1</option>
							<option>城北#2</option>
						</optgroup>
						<optgroup label="新开发区">
							<option>新区#1</option>
							<option>新区#2</option>
						</optgroup>
						<optgroup label="旧城区">
							<option>旧城#1</option>
							<option>旧城#2</option>
						</optgroup>
						<optgroup label="特别商户">
							<option>特别商户#1</option>
						</optgroup>
						
					</select>
				</div>
			</h2>
				
			<table class="data display">
					<thead>
						<tr>
							<th>用户编码</th>
							<th>表身码</th>
							<th>最大表码值</th>
							<th width="100">用户姓名</th>
							<th>上月表码数</th>
							<th>本月表码数</th>
							<th>实际用水量</th>
							<th width="200">状态</th>
						</tr>
					</thead>
					<tbody>
						<tr class="odd gradeX">
							<td>0100000987</td>
							<td>12030621</td>
							<td class="right"><a href="javascript:setMaxValue('0100000987');">9999</a></td>
							<td>张三</td>
							<td class="right"><a href="javascript:setPreValue('0100000987');">1453</a></td>
							<td class="enter"><input class="enter" value="1480"></td>
							<td class="right">27</td>
							<td><a href="javascript:setNotEnter('0100000987');" class="state1">已抄，未复核</a></td>
						</tr>
						<tr class="even gradeC">
							<td>0100000988</td>
							<td>02000031</td>
							<td class="right"><a href="javascript:setMaxValue('0100000987');">9999</a></td>
							<td>李四</td>
							<td class="right"><a href="javascript:setPreValue('0100000987');">9301</a></td>
							<td class="enter"><input class="enter" value="9311"></td>
							<td class="right">10</td>
							<td><a href="javascript:setNotEnter('0100000987');" class="state1">已抄，未复核</a></td>
						</tr>
						<tr class="odd gradeA">
							<td>0100002387</td>
							<td>02013211</td>
							<td class="right"><a href="javascript:setMaxValue('0100000987');">9999</a></td>
							<td>王五</td>
							<td class="right"><a href="javascript:setPreValue('0100000987');">3245</a></td>
							<td class="enter"><input class="enter" value="3245"></td>
							<td class="right">0</td>
							<td><span class="state0">待抄</span></td>
						</tr>
						<tr class="even gradeA">
							<td>0100003912</td>
							<td>02029531</td>
							<td class="right"><a href="javascript:setMaxValue('0100000987');">99999</a></td>
							<td>赵六</td>
							<td class="right"><a href="javascript:setPreValue('0100000987');">6923</a></td>
							<td class="enter"><input class="enter" value="6923"></td>
							<td class="right">0</td>
							<td><span class="state0">待抄</span></td>
						</tr>
						<tr class="odd gradeA">
							<td>0100000436</td>
							<td>02263631</td>
							<td class="right"><a href="javascript:setMaxValue('0100000987');">9999</a></td>
							<td>钱七</td>
							<td class="right"><a href="javascript:setPreValue('0100000987');">5866</a></td>
							<td class="enter"><input class="enter" value="22"></td>
							<td class="right">4155</td>
							<td><a href="javascript:setNotEnter('0100000987');" class="state1">已抄，未复核</a>
								<span style="color:red;">(不合理的水表转盘)</span></td>
						</tr>
						<tr class="even gradeA">
							<td>0100009301</td>
							<td>02317631</td>
							<td class="right"><a href="javascript:setMaxValue('0100000987');">9999</a></td>
							<td>孙八</td>
							<td class="right"><a href="javascript:setPreValue('0100000987');">9991</a></td>
							<td class="enter"><input class="enter" value="12"></td>
							<td class="right">20</td>
							<td><span class="state2">已复核</span></td>
						</tr>
						<tr class="odd gradeA">
							<td>0100001028</td>
							<td>06810631</td>
							<td class="right"><a href="javascript:setMaxValue('0100000987');">9999</a></td>
							<td>何九</td>
							<td class="right"><a href="javascript:setPreValue('0100000987');">3182</a></td>
							<td class="enter"><input class="enter" value="3282"></td>
							<td class="right">100</td>
							<td><span class="state2">已复核</span></td>
						</tr>
						<tr class="even gradeA">
							<td>0100094820</td>
							<td>02040631</td>
							<td class="right"><a href="javascript:setMaxValue('0100000987');">9999</a></td>
							<td>布十</td>
							<td class="right"><a href="javascript:setPreValue('0100000987');">1923</a></td>
							<td class="enter"><input class="enter" value="1934"></td>
							<td class="right">11</td>
							<td><span class="state2">已复核</span></td>
						</tr>
						<tr class="odd gradeA">
							<td>0100000002</td>
							<td>02010331</td>
							<td class="right"><a href="javascript:setMaxValue('0100000987');">9999</a></td>
							<td>陈三</td>
							<td class="right"><a href="javascript:setPreValue('0100000987');">7424</a></td>
							<td class="enter"><input class="enter" value="7424"></td>
							<td class="right">0</td>
							<td><span class="state0">待抄</span></td>
						</tr>
						<tr class="even gradeA">
							<td>0100000504</td>
							<td>02010611</td>
							<td class="right"><a href="javascript:setMaxValue('0100000987');">9999</a></td>
							<td>许四</td>
							<td class="right"><a href="javascript:setPreValue('0100000987');">3473</a></td>
							<td class="enter"><input class="enter" value="3473"></td>
							<td class="right">0</td>
							<td><span class="state0">待抄</span></td>
						</tr>
						<tr class="odd gradeA">
							<td>0100001274</td>
							<td>02010632</td>
							<td class="right"><a href="javascript:setMaxValue('0100000987');">9999</a></td>
							<td>彭五</td>
							<td class="right"><a href="javascript:setPreValue('0100000987');">9742</a></td>
							<td class="enter"><input class="enter" value="9742"></td>
							<td class="right">0</td>
							<td><span class="state0">待抄</span></td>
						</tr>
						</tbody>
					</table>
			
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
	
	
	//抄表处理
	$('.enter').keyup(function(e){
		e=e?e:event;
		var key = e.keyCode;
		if(key==13||key==40){
			var input = $(this).parent().parent().next().find('input.enter');
			if(input.length) input.get(0).select();
		}else if(key==38){
			var input = $(this).parent().parent().prev().find('input.enter');
			if(input.length) input.get(0).select();
		}
	});
	
});

</script>

</body> 
 
</html>