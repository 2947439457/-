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
		
	</div> 
	
	<!-- #header -->	
	
	<div id="masthead">
		<div>
			<span id="pagetitle"><a href="javascript:;">表册管理</a></span>
			<span id="welcome_span">欢迎回来，马云</span>
		</div>
	</div> <!-- #masthead -->	
	
	<div id="content" class="xgrid">
	 		
		<div class="x12">
		
			<div id="facebox_delete" style="display: none">
				<div style="height:80px;text-align:center;padding-top:50px;">
					确认删除吗？
				</div>
				
				<div class="dialogbutton center">
					<a class="btn" href="/rd/rd_volume_update_stat?id=" style="width:60px;">是</a>
					<a class="btn btn-grey" href="javascript:closeDialog();" style="width:60px;">否</a>
				</div>
			</div>
			
			<div id="facebox_setVolume" style="display: none">
				<div id="facebox_setVolume_message" style="height:80px;text-align:center;padding-top:50px;">
					确认移动到此表册吗？
				</div>
				
				<div class="dialogbutton center">
					<a class="btn" href="javascript:closeDialog();" style="width:60px;">是</a>  
					<a class="btn btn-grey" href="javascript:closeDialog();" style="width:60px;">否</a>
				</div>
			</div>
			
			<table id="parent_table">
				<tr>
					<td width="30%">
						<h2>表册管理</h2>
						
						<p>
							<br/>
							<div style="float:left;height:42px;">
								<button class="btn-icon btn-plus" onClick="location='/rd/volume_add';"><span></span>添加表册</button>
							</div>
						</p>
										
						<table class="data display">
							<thead>
								<tr>
									<th>未分配表册的用户</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<tr class="odd gradeX">
									<td><a href="/rd/volume_default">未分配表册的用户</a></td>
									<td class="right">&nbsp;</td>
								</tr>
							</tbody>
						</table>

					<#list rd_AreaName as an>
						<table class="data display">
							<thead>
								<tr>
									<#--辖区名-->
									<th>${an.areaName}</th>
									<#--空白不用填-->
									<th></th>
								</tr>
							</thead>
							<tbody>
								<#list rd_VolumeName as vname>
									<#if vname.areaId.areaName == an.areaName>
										<tr class="odd gradeX">
												<#--辖区中的表册名-->
											<td><a href="/rd/volume_parm?ID=${vname.id}&stat=${vname.volumeName}">${vname.volumeName}</a></td>
											<td class="right">
												<a href="/rd/rd_volume_query_Id?id=${vname.id}">[修改]</a>
                                                <a href="javascript:if(confirm('确实要删除吗?'))location='/rd/rd_volume_update_stat?id=${vname.id}'">[删除]</a>

											</td>
										</tr>
									</#if>
								</#list
								>
							</tbody>
						</table>
					</#list>

					</td>
					<td width="1%">&nbsp;</td>
					<td width="69%">
						<h2><#if Volume_stat??>${Volume_stat}<#else >未分配</#if>的表册用户</h2>
					
						<div style="float:right;">
							分配至 
							<select id="select_area" class="medium" onclick="openNewPage(this)" >
								<option selected="selected"> </option>
								<option>未分配</option>
								<#list rd_AreaName as an>
									<#--辖区名-->
									<optgroup label=${an.areaName}>
										<#list rd_VolumeName as vname>

											<#if an.areaName == vname.areaId.areaName>
												<#--表册名-->
												<option value="${vname.id}">${vname.volumeName}</option>
											</#if>
										</#list>
									</optgroup>
								</#list>
							</select>
						</div>
					
						<table class="data display datatableVolume">
							<thead>
								<tr>
									<th>&nbsp;</th>
									<th>排序号</th>
									<th>用户编码</th>
									<th>表身码</th>
									<th>用户姓名</th>
									<th>地址</th>
								</tr>
							</thead>
							<tbody>

                            <script type="text/javascript">
                                var isSelect=true;

                                function openNewPage(value){

                                    var optionSelect= value.options[value.selectedIndex];

                                    if(value.value == optionSelect.value){

                                        isSelect = !isSelect

                                    } else {

                                        isSelect = true;

                                    }

                                    if(isSelect == true){
                                       var ID=optionSelect.value;
                                       var stat=optionSelect.text;
                                        alert("11");
                                        var userids = []; //申明数组保存所有被选中checkbox背后的值
                                        var str="";
                                        var users = document.getElementsByName("username"); //得到所有的checkbox
                                        console.log(users);
                                        for(var i=0; i<users.length; i++){
                                            if(users[i].checked){ //如果checkbox被选中

                                                console.log(users[i].value);

                                                str=str+users[i].value.trim()+","; //将被选中checkbox背后的值添加到数组中

                                            }

                                        }
                                        str=str.substring(0,str.length-1);
                                        alert(str);
                                        console.log(str);

                                        window.location.href='/rd/volume_area?ID='+ID+'&str='+str+'&stat='+stat;

                                    }

                                }
                                function checkboxAll(){


                                }

                            </script>
							<#list rd_Volume_Default as v>
								<tr class="odd gradeX">
									<td><input type="checkbox" name="username"
									   value="
											<#if v.userNo??>
											${v.userNo}
                                            <#else >
                                               未分配
                                          	</#if>
                                          "/>
									</td>
									<#--排序号-->
									<td>
										<#--判断是否为非空-->
                                        <#if v.volumeOrderIndex??>
											${v.volumeOrderIndex}
                                            <#else >
                                               未分配
                                        </#if>
									</td>
									<#--用户编码-->
									<td>
                                        ${v.userNo}
                                    </td>
									<#--表身码-->
									<td>
                                        ${v.usMeter.meterName}
                                    </td>
									<#--用户姓名-->
									<td>
                                        ${v.userName}
                                    </td>
									<#--地址-->
									<td>
                                        ${v.address}
                                    </td>
								</tr>
							</#list>

								</tbody>
						</table>
					</td>
				</tr>
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
	
	
	$('.datatableVolume').dataTable({
		bSort : false,                //不允许排序
		aLengthMenu : [[20, 50, 100, -1], [20, 50, 100, '显示所有']],  //分页器可选值
		iDisplayLength : 20           //默认情况下，一页显示多少条
	});
	
});

//设置用户所属表册
function setVolume(){

	//
    var areaText = $('#select_area').val();
	if(areaText=='')return;
	if(areaText=='未分配'){
		$('#facebox_setVolume_message').text('确认将选择的用户变成未分配表册的用户吗？');
		$.facebox({div:'#facebox_setVolume'});
	}else{
		$('#facebox_setVolume_message').text('确认将选择的用户分配到表册【'+areaText+'】中吗？');
		$.facebox({div:'#facebox_setVolume'});
	}
}



</script>

</body> 
 
</html>