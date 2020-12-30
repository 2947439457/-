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
	table.report th,table.report td { padding:10px; font-size:14px; }
	</style>
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
							<li><a href="be__request.ftl">01 用户申请</a></li>
							<li><a href="be__audit.ftl">02 初步审核</a></li>
							<li><a href="be__pay.ftl">03 交施工费</a></li>
							<li><a href="be__billclear.ftl">04 水费清算</a></li>
							<li><a href="be__contract.ftl">05 供水协议</a></li>
							<li><a href="be__working.ftl">06 施工竣工</a></li>
							<li><a href="be__open.ftl">07 通水停水</a></li>
							<li><a href="be__save.ftl">08 档案存档</a></li>
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
                            <li><a href="/rd/volume_default">表册管理</a></li>
							<li><a href="rd_init.ftl">抄表初始化</a></li>
							<li><a href="rd_task.ftl">任务分配</a></li>
							<li><a href="rd_enter.ftl">抄表录入</a></li>
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
			<span id="pagetitle"><a href="javascript:;">各类用水统计总表</a></span>
			<span id="welcome_span">欢迎回来，马云</span>
		</div>
	</div> <!-- #masthead -->	
	
	<div id="content" class="xgrid" >

		<div class="x12">
			
			<h2>
				各类用水统计总表
				<div style="float:right;">
					<a href="pay_reportWaterType.ftl">按月份统计</a>
					<span style="color:#0000FF;">按年份统计</span>
					
				</div>
			</h2>
			
			<div class="searchDiv">
				<div style="float:left;">
					统计年份 <select>
						<option>2014年</option>
						<option>2013年</option>
						<option>2012年</option>
						<option>2011年</option>
						<option>2010年</option>
					</select>
				</div>
				
				<button class="btn btn-small btn-icon btn-find"><span></span>查询</button>
				<button class="btn btn-small btn-icon btn-star btn-blue"><span></span>计算</button>
			</div>
			
			<div>
				<div class="reportTitle">
					2014年各类用水统计总表
				</div>	
				<table class="report">
					<thead>
						<tr>
							<th width="60">序号</th>
							<th width="300">用水类型</th>
							<th width="140">水量</th>
							<th width="140">水价</th>
							<th width="180">水费</th>
							<th width="140">占比</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="center">1</td>
							<td class="left">居民用水</td>
							<td class="right">106913 吨</td>
							<td class="right">1.34 元/吨</td>
							<td class="right">143263.42 元</td>
							<td class="right">56.76%</td>
						</tr>
						<tr>
							<td class="center">2</td>
							<td class="left">行政用水</td>
							<td class="right">33418 吨</td>
							<td class="right">1.34 元/吨</td>
							<td class="right">44780.32 元</td>
							<td class="right">17.74%</td>
						</tr>
						<tr>
							<td class="center">3</td>
							<td class="left">工业用水</td>
							<td class="right">14310 吨</td>
							<td class="right">1.34 元/吨</td>
							<td class="right">21036.88 元</td>
							<td class="right">7.60%</td>
						</tr>
						<tr>
							<td class="center">4</td>
							<td class="left">经营用水</td>
							<td class="right">32452 吨</td>
							<td class="right">1.47 元/吨</td>
							<td class="right">78209.32 元</td>
							<td class="right">17.23%</td>
						</tr>
						<tr>
							<td class="center">5</td>
							<td class="left">特种用水</td>
							<td class="right">1251 吨</td>
							<td class="right">2.41 元/吨</td>
							<td class="right">6706.16 元</td>
							<td class="right">0.66%</td>
						</tr>
						<tr>
							<td class="center">6</td>
							<td class="left">混合用水</td>
							<td class="right">0 吨</td>
							<td class="right">5.36 元/吨</td>
							<td class="right">0.00 元</td>
							<td class="right">0.00%</td>
						</tr>
						<tr>
							<td class="center">7</td>
							<td class="left">合计水量</td>
							<td class="right">188344 吨</td>
							<td class="right">合计水费</td>
							<td class="right">293996.10 元</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">8</td>
							<td class="left">本月综合水价</td>
							<td class="right">1.56 元/吨</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">9</td>
							<td class="left">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">10</td>
							<td class="left">居民生活垃圾处理费</td>
							<td class="right">21382.60 元</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">11</td>
							<td class="left">水资源费</td>
							<td class="right">3766.9 元</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">12</td>
							<td class="left">污水处理费</td>
							<td class="right">75334.62 元</td>
							<td class="right">总应收</td>
							<td class="right">100484.12 元</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">13</td>
							<td class="left">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">14</td>
							<td class="left">本月应抄户数</td>
							<td class="right">4729 户</td>
							<td class="right">本月实抄户数</td>
							<td class="right">4729 户</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">15</td>
							<td class="left">抄表率</td>
							<td class="right">100%</td>
							<td class="right">报停用户总数</td>
							<td class="right">81 户</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">16</td>
							<td class="left">本月水厂出水量</td>
							<td class="right">&nbsp;</td>
							<td class="right">本月抄回水量</td>
							<td class="right">188345 吨</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">17</td>
							<td class="left">抄回率</td>
							<td class="right">%</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
						</tr>
					</tbody>
				</table>
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