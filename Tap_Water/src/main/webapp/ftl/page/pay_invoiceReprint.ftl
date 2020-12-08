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
	tr.disabled td { color:#999999; }
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
							<li><a href="../page/pay_invoiceReprint.ftl">发票补开/作废</a></li>
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
			<span id="pagetitle"><a href="javascript:;">发票补开/作废</a></span>
			<span id="welcome_span">欢迎回来，马云</span>
		</div>
	</div> <!-- #masthead -->	
	
	<div id="content" class="xgrid">
		
 		
		<div class="x12">
			
			<h2>发票补开/作废</h2>
			
			<div class="height40">
				发票保管员 <select class="medium">
						<option>所有</option>
						<option selected="selected">马云</option>
						<option>马化腾</option>
						<option>李彦宏</option>
						<option>雷军</option>
						<option>周鸿祎</option>
						<option>李开复</option>
						<option>比尔盖茨</option>
						<option>乔布斯</option>
						<option>鲍尔默</option>
						<option>刘德华</option>
						<option>黎明</option>
						<option>郭富城</option>
						<option>张学友</option>
						<option>林志颖</option>
						<option>郭涛</option>
						<option>张亮</option>
						<option>田亮</option>
						<option>王岳伦</option>
						<option>张惠妹</option>
						<option>庾澄庆</option>
						<option>汪峰</option>
						<option>那英</option>
					</select>
				发票号码 <input value="" />
				使用日期 <input onClick="WdatePicker();" value="2014-02-14" />
				<button class="btn btn-small btn-icon btn-find"><span></span>查询</button>
			</div>
				
			<table class="data display">
					<thead>
						<tr>
							<th>发票类型</th>
							<th>状态</th>
							<th>发票号码</th>
							<th>交费单号</th>
							<th>交费用户</th>
							<th>收费员</th>
							<th>交费金额</th>
							<th>交费/作废日期</th>
							<th>是否交票</th>
							<th>&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<tr class="odd">
							<td>普通发票</td>
							<td>已使用</td>
							<td>07382991</td>
							<td>JF0100000987-201401-02</td>
							<td>张三</td>
							<td>雷军</td>
							<td class="right">100.00 元</td>
							<td>2014-01-25</td>
							<td>是</td>
							<td class="center">
								已交票不能操作
							</td>
						</tr>
						<tr class="odd">
							<td>普通发票</td>
							<td>已使用</td>
							<td>07382992</td>
							<td>JF0100003859-201401-01</td>
							<td>吴单</td>
							<td>雷军</td>
							<td class="right">400.00 元</td>
							<td>2014-01-30</td>
							<td>是</td>
							<td class="center">
								已交票不能操作
							</td>
						</tr>
						<tr class="odd">
							<td>增值税发票</td>
							<td>已使用</td>
							<td>43859032</td>
							<td>JF0100043900-201312-01</td>
							<td>司徒克琴</td>
							<td>雷军</td>
							<td class="right">400.00 元</td>
							<td>2014-01-30</td>
							<td></td>
							<td class="center">
								<button class="btn-icon btn-small btn-blue btn-star" onClick="location='pay_invoiceReprint_reprint.html';"><span></span>补开</button>  
							</td>
						</tr>
						<tr class="odd">
							<td>增值税发票</td>
							<td>已使用</td>
							<td>34899912</td>
							<td>JF0100008834-201311-01</td>
							<td>马三军</td>
							<td>雷军</td>
							<td class="right">1200.00 元</td>
							<td>2013-12-12</td>
							<td></td>
							<td class="center">
								<button class="btn-icon btn-small btn-blue btn-star" onClick="location='pay_invoiceReprint_reprint.html';"><span></span>补开</button>
							</td>
						</tr>
						<tr class="odd disabled">
							<td>增值税发票</td>
							<td>已作废</td>
							<td>43950949</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td>2013-11-04</td>
							<td></td>
							<td class="center">
								已作废不能操作  
							</td>
						</tr>
						<tr class="odd disabled">
							<td>增值税发票</td>
							<td>已作废</td>
							<td>44949209</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td>2013-11-04</td>
							<td>是</td>
							<td class="center">
								已作废不能操作  
							</td>
						</tr>
						<tr class="odd">
							<td>普通发票</td>
							<td>未使用</td>
							<td>48839490</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td class="center">
								<button class="btn-icon btn-small btn-blue btn-star" onClick="location='pay_invoiceReprint_disable.html';"><span></span>作废</button>  
							</td>
						</tr>
						<tr class="odd">
							<td>增值税发票</td>
							<td>未使用</td>
							<td>23448890</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td class="center">
								<button class="btn-icon btn-small btn-blue btn-star" onClick="location='pay_invoiceReprint_disable.html';"><span></span>作废</button>  
							</td>
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
<script src="../My97DatePicker/WdatePicker.js"></script>

<script type="text/javascript">
	
$(document).ready ( function () 
{
	Dashboard.init ();		
});

</script>

</body> 
 
</html>