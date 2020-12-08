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
							<li><a href="be__request.ftl">01 用户申请</a></li>
							<li><a href="be__audit.ftl">02 初步审核</a></li>
							<li><a href="be__pay.ftl">03 交施工费</a></li>
							<li><a href="be__billclear.ftl">04 水费清算</a></li>
							<li><a href="be__contract.ftl">05 供水协议</a></li>
							<li><a href="be__working.ftl">06 施工竣工</a></li>
							<li><a href="be__open.ftl">07 通水停水</a></li>
							<li><a href="be__save.ftl">08 档案存档</a></li>
							<li><a href="../page/be_order.ftl">工单管理</a></li>
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
			<span id="pagetitle"><a href="javascript:;">工单管理</a></span>
			<span id="welcome_span">欢迎回来，马云</span>
		</div>
	</div> <!-- #masthead -->	
	
	<div id="content" class="xgrid">
		
 		
		<div class="x12">
			
			<h2>工单管理</h2>
			
			<div class="height40">
				工单类型 <select>
					<option>所有</option>
					<option>新户</option>
					<option>分户</option>
					<option>过户</option>
					<option>代扣</option>
					<option>换表</option>
					<option>重签</option>
					<option>销户</option>
				</select>
				工程进度 <select>
					<option>所有</option>
					<option>用户申请</option>
					<option>初步审核</option>
					<option>交施工费</option>
					<option>水费清算</option>
					<option>供水合同</option>
					<option>施工竣工</option>
					<option>通水停水</option>
					<option>档案存档</option>
					<option>完成</option>
					<option>终止</option>
				</select>
				工单号 <input />
				用户姓名 <input />
				<label><input type="checkbox" style="vertical-align:middle;" />等待我处理</label>
				<button class="btn btn-small btn-icon btn-find"><span></span>查询工单</button>
			</div>
			
			<table class="data display">
					<thead>
						<tr>
							<th width="120">工单号</th>
							<th width="60">类型</th>
							<th width="80">进度</th>
							<th width="90">当前处理部门</th>
							<th width="100">最后操作日期</th>
							<th width="200">用户名称</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<tr class="odd">
							<td><a href="be_orderInfo.ftl?id=B1-20140105-0001" target="orderInfo">B1-20140105-0001</a></td>
							<td>新户</td>
							<td>交施工费</td>
							<td>财务部</td>
							<td>2014-02-18</td>
							<td>许三多</td>
							<td></td>
						</tr>
						<tr class="even">
							<td><a href="be_orderInfo.ftl?id=B1-20140105-0001" target="orderInfo">B1-20140117-0002</a></td>
							<td>分户</td>
							<td>水费清算</td>
							<td>收费室</td>
							<td>2014-02-18</td>
							<td>许四多</td>
							<td></td>
						</tr>
						<tr class="odd">
							<td><a href="be_orderInfo.ftl?id=B1-20140105-0001" target="orderInfo">B1-20140105-0003</a></td>
							<td>过户</td>
							<td>初步审核</td>
							<td>生技室</td>
							<td>2014-02-18</td>
							<td>许五多</td>
							<td><button class="btn-icon btn-small btn-blue btn-check" onClick="location.href = 'be__auditForm.ftl';"><span></span>处理</button></td>
						</tr>
						<tr class="even">
							<td><a href="be_orderInfo.ftl?id=B1-20140105-0001" target="orderInfo">B1-20140105-0004</a></td>
							<td>代扣</td>
							<td>档案存档</td>
							<td>生技室</td>
							<td>2014-02-18</td>
							<td>中国农业银行解放路支行</td>
							<td><button class="btn-icon btn-small btn-blue btn-check" onClick="location.href = 'be__saveForm.ftl';"><span></span>处理</button></td>
						</tr>
						<tr class="odd">
							<td><a href="be_orderInfo.ftl?id=B1-20140105-0001" target="orderInfo">B1-20140105-0005</a></td>
							<td>换表</td>
							<td>施工竣工</td>
							<td>安装队</td>
							<td>2014-02-18</td>
							<td>中国联通广东路营业厅</td>
							<td></td>
						</tr>
						<tr class="even">
							<td><a href="be_orderInfo.ftl?id=B1-20140105-0001" target="orderInfo">B1-20140105-0006</a></td>
							<td>重签</td>
							<td>供水合同</td>
							<td>生技室</td>
							<td>2014-02-18</td>
							<td>许八多</td>
							<td><button class="btn-icon btn-small btn-blue btn-check" onClick="location.href = 'be__contractForm.ftl';"><span></span>处理</button></td>
						</tr>
						<tr class="odd">
							<td><a href="be_orderInfo.ftl?id=B1-20140105-0001" target="orderInfo">B1-20140105-0007</a></td>
							<td>销户</td>
							<td>通水停水</td>
							<td>抄表班</td>
							<td>2014-02-18</td>
							<td>许蛮多</td>
							<td></td>
						</tr>
						<tr class="even">
							<td><a href="be_orderInfo.ftl?id=B1-20140105-0001" target="orderInfo">B1-20140105-0008</a></td>
							<td>分户</td>
							<td>完成</td>
							<td>&nbsp;</td>
							<td>2014-02-18</td>
							<td>新多国际商务大厦</td>
							<td></td>
						</tr>
						<tr class="odd">
							<td><a href="be_orderInfo.ftl?id=B1-20140105-0001" target="orderInfo">B1-20140105-0009</a></td>
							<td>新户</td>
							<td>终止</td>
							<td>&nbsp;</td>
							<td>2014-02-18</td>
							<td>许钱多</td>
							<td></td>
						</tr>
						<tr class="even">
							<td><a href="be_orderInfo.ftl?id=B1-20140105-0001" target="orderInfo">B1-20140105-0010</a></td>
							<td>重签</td>
							<td>初步审核</td>
							<td>生技室</td>
							<td>2014-02-18</td>
							<td>许翔多</td>
							<td><button class="btn-icon btn-small btn-blue btn-check" onClick="location.href = 'be__auditForm.ftl';"><span></span>处理</button></td>
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

<script type="text/javascript">
	
$(document).ready ( function () 
{
	Dashboard.init ();		
});

</script>

</body> 
 
</html>