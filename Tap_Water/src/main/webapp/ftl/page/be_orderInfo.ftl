<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8"/>
    <title>湖南省自来水公司营销管理信息系统</title>

    <link rel="stylesheet" href="../css/reset.css" type="text/css" media="screen" title="no title"/>
    <link rel="stylesheet" href="../css/text.css" type="text/css" media="screen" title="no title"/>
    <link rel="stylesheet" href="../css/form.css" type="text/css" media="screen" title="no title"/>
    <link rel="stylesheet" href="../css/buttons.css" type="text/css" media="screen" title="no title"/>
    <link rel="stylesheet" href="../css/grid.css" type="text/css" media="screen" title="no title"/>
    <link rel="stylesheet" href="../css/layout.css" type="text/css" media="screen" title="no title"/>

    <link rel="stylesheet" href="../css/ui-darkness/jquery-ui-1.8.12.custom.css" type="text/css" media="screen"
          title="no title"/>
    <link rel="stylesheet" href="../css/plugin/jquery.visualize.css" type="text/css" media="screen" title="no title"/>
    <link rel="stylesheet" href="../css/plugin/facebox.css" type="text/css" media="screen" title="no title"/>
    <link rel="stylesheet" href="../css/plugin/uniform.default.css" type="text/css" media="screen" title="no title"/>
    <link rel="stylesheet" href="../css/plugin/dataTables.css" type="text/css" media="screen" title="no title"/>

    <link rel="stylesheet" href="../css/custom.css" type="text/css" media="screen" title="no title">
    <style type="text/css">
        table.data th {
            text-align: center !important;
        }

        table.data tbody tr td {
            vertical-align: middle;
            text-align: center;
        }

        td.content {
            text-align: left !important;
            vertical-align: top !important;
        }

        table.forminfo {
            width: 100%;
        }

        table.forminfo td {
            text-align: left;
            vertical-align: top !important;
            margin: 0px !important;
            padding: 0px !important;
        }

        table.forminfo textarea {
            width: 100%;
            height: 80px;
        }

        table.forminfo button {
            margin: 0px !important;
        }
    </style>
    <script type="text/javascript">
        //进入修改附加信息界面
        function editTag(tagID) {
            $('#btnAddTag').hide();
            $('#btnEditTag').show();
            $('#btnCancelTag').show();
            if (tagID == 34)
                $('#txtTag').val('此户以前新开发区明景楼盘二期工程的遗留户，各部门请注意勘察现场');
            else if (tagID == 93)
                $('#txtTag').val('请稽查部门密切跟进此用户');

            $('#txtTag').focus();
        }

        //保存修改附加信息
        function saveEditTag() {
            newTag();
        }

        //放弃修改附加信息
        function cancelEditTag() {
            newTag();
        }

        //回到新增附加信息界面
        function newTag() {
            $('#btnEditTag').hide();
            $('#btnCancelTag').hide();
            $('#btnAddTag').show();
            $('#txtTag').val('');
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
                            <li><a href="rd_volume.ftl">表册管理</a></li>
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
            <span id="pagetitle"><a href="javascript:;">工单信息</a></span>
            <span id="welcome_span">欢迎回来，马云</span>
        </div>
    </div> <!-- #masthead -->

    <div id="content" class="xgrid">


        <div class="x12">

            <h2>工单信息 B1-20140105-0001 新户 张三 </h2>

            <div class="tab_container">
                <ul class="tabs">
                    <li><a href="#tab1">流程记录</a></li>
                    <li><a href="#tab2">基本信息</a></li>
                    <li><a href="#tab3">用户详细表</a></li>
                    <li><a href="#tab4">表计详细表</a></li>
                    <li><a href="#tab5">其它信息</a></li>
                    <li><a href="#tab6">交费信息</a></li>
                </ul>
                <div class="tab_content_container">
                    <div id="tab1" class="tab_content">
                        <!-- 流程记录 -->
                        <table width="100%">
                            <tbody>
                            <tr>
                                <td width="48%">
                                    <!-- 历史记录 -->
                                    流程历史记录
                                    <table class="data display">
                                        <thead>
                                        <tr>
                                            <th width="20"></th>
                                            <th width="100">处理时间</th>
                                            <th>内容</th>
                                            <th width="100">操作人</th>
                                        </tr>
                                        </thead>
                                        <tbody>
		<#list beHistories as bh>
            <#if bh.back>
				<tr class="odd">
                    <td>${bh_index+1}</td>
                    <td>${bh.datee}</td>
                    <td>[完成] ${bh.stepId.stepName}</td>
                    <td>${bh.empId.empName}</td>
                </tr>
            <#else >
				<tr class="odd">
                    <td>${bh_index+1}</td>
                    <td>${bh.datee}</td>
                    <td>[撤回] ${bh.stepId.stepName}</td>
                    <td>${bh.empId.empName}</td>
                </tr>
            </#if>
        </#list>
                                        <tr class="odd">
                                            <td></td>
                                            <td></td>
                                            <td>[当前] ${beOrder.stepId.stepName}</td>
                                            <td></td>
                                        </tr>
                                        </tbody>
                                    </table>
                                    <!-- 历史记录结束 -->
                                </td>
                                <td width="2%"></td>
                                <td width="50%">
                                    <!-- 附加信息 -->
                                    附加信息记录
                                    <table class="data display">
                                        <thead>
                                        <tr>
                                            <th width="100"></th>
                                            <th>内容</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <#list beComments as bc>
                                            <tr class="odd">
                                                <td>
                                                    <b>
                                                    ${bc.empId.empName}
                                                </b><br/>${bc.datee}<br/>
                                                    <a href="javascript:;" onClick="editTag(34);">改</a>
                                                    <a href="javascript:;" onClick="showDialog('确认删除吗？');">删</a>
                                                    <br/></td>
                                                <td class="content">${bc.comment}</td>
                                            </tr>
                                        </#list>
                                        </tbody>
                                    </table>
                                    <div style="float:left;"><textarea id="txtTag"
                                                                       style="width:330px;height:80px;"></textarea>
                                    </div>
                                    <div>
                                        <button
                                                id="btnAddTag" style="height:94px;width:100px;">添加附加信息
                                        </button>
                                        <button
                                                id="btnEditTag" style="height:47px;width:100px;display:none;"
                                                onClick="saveEditTag();">保存修改
                                        </button>
                                        <button
                                                id="btnCancelTag" style="height:47px;width:100px;display:none;"
                                                onClick="cancelEditTag();">放弃修改
                                        </button>
                                    </div>

                                    <!-- 附加信息结束 -->
                                </td>
                            </tr>
                            </tbody>
                        </table>
                        <!-- 流程记录结束 -->
                    </div>
                    <div id="tab2" class="tab_content">

                        <!-- 基本信息 -->
                        <table width="100%">
                            <thead>
                            <tr>
                                <th width="60"></th>
                                <th width="220"></th>
                                <th width="60"></th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>用户名称</td>
                                <td><input readonly="readonly" value="${beOrder.userNo.userName}"/></td>
                                <td>用户类型</td>
                                <td><input readonly="readonly" value="${beOrder.userNo.userType}"/></td>
                            </tr>
                            <tr>
                                <td>联系人</td>
                                <td><input readonly="readonly" value="${beOrder.userNo.userName}"/></td>
                                <td>联系电话</td>
                                <td><input readonly="readonly" value="${beOrder.userNo.phone}"/></td>
                            </tr>
                            <tr>
                                <td>用户地址</td>
                                <td colspan="3"><input size="68" readonly="readonly" value="${beOrder.userNo.address}"/>
                                </td>
                            </tr>
                            <tr>
                                <td>用水量</td>
                                <td><input readonly="readonly" value="${beOrder.maxAmount}吨"/></td>
                                <td>申请表径</td>
                                <td><input readonly="readonly" value="${beOrder.meterTypeId.meterTypeName}"/></td>
                            </tr>
                            <tr>
                                <td>房屋层次</td>
                                <td><input readonly="readonly" value="${beOrder.houseHeight}层"/></td>
                                <td>接水用途</td>
                                <td><input readonly="readonly" value="${beOrder.useTarget}"/></td>
                            </tr>
                            <tr>
                                <td>备注说明</td>
                                <td colspan="3"><input size="68" readonly="readonly" value="${beOrder.userRemark}"/>
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>收费方式</td>
                                <td>
			<#if beOrder.userNo.payType ??>
                <input readonly="readonly" value="${beOrder.userNo.payType}"/>
            <#else >
				<input readonly="readonly" value=""/>
            </#if>
                                </td>
                                <td></td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>开户银行</td>
                                <td>
			<#if beOrder.userNo.bankName ??>
                <input readonly="readonly" value="${beOrder.userNo.bankName}"/>
            <#else >
				<input readonly="readonly" value=""/>
            </#if>
                                </td>
                                <td>银行账号</td>
                                <td>
			<#if beOrder.userNo.bankNum ??>
                <input readonly="readonly" value="${beOrder.userNo.bankNum}"/>
            <#else >
				<input readonly="readonly" value=""/>
            </#if>
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>原户编码</td>
                                <td>
			<#if beOrder.oldUserNo ??>
                <input readonly="readonly" value="${beOrder.oldUserNo}"/>
            <#else >
					<input readonly="readonly" value=""/>
            </#if>
                                </td>
                                <td>原户姓名</td>
                                <td>
			<#if beOrder.oldUserName ??>
                <input readonly="readonly" value="${beOrder.oldUserName}"/>

            <#else >
				                <input readonly="readonly" value=""/>

            </#if>
                                </td>
                            </tr>
                            <tr>
                                <td>原户电话</td>
                                <td>
			<#if beOrder.oldUserPhone ??>
                <input readonly="readonly" value="${beOrder.oldUserPhone}"/>

            <#else >
			                <input readonly="readonly" value=""/>

            </#if>
                                </td>
                                <td>原户表径</td>
                                <td>
			<#if beOrder.oldMeter ??>
                <input readonly="readonly" value="${beOrder.oldMeter}"/>

            <#else >
				                <input readonly="readonly" value=""/>

            </#if>
                                </td>
                            </tr>
                            <tr>
                                <td>原户地址</td>
                                <td colspan="3">
			<#if beOrder.oldUserAddr ??>
                <input readonly="readonly" value="${beOrder.oldUserAddr}"/>

            <#else >
				                <input readonly="readonly" value=""/>

            </#if>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                        <!-- 基本信息 -->

                    </div>
                    <div id="tab3" class="tab_content">
                        <!-- 用户详细表 -->
                        <table class="data display">
                            <thead>
                            <tr>
                                <th width="30">序号</th>
                                <th width="80">姓名</th>
                                <th width="80">电话</th>
                                <th>地址</th>
                                <th width="80">合同编号</th>
                                <th width="80">档案号</th>
                            </tr>
                            </thead>
                            <tbody>
	<#list beOrderusers as bou>
    <tr class="odd">
        <td>${bou_index+1}</td>
        <td>${bou.userName}</td>
        <td>${bou.phone}</td>
        <td>${bou.address}</td>
        <td>
				<#if bou.contractNum ??>
                    ${bou.contractNum}
                <#else >
                </#if>
        </td>
        <td>
				<#if bou.docNum ??>
                    ${bou.docNum}
                <#else >
                </#if>
        </td>
        <td></td>
    </tr>
    </#list>
                            </tbody>
                        </table>
                        <!-- 用户详细表 -->
                    </div>
                    <div id="tab4" class="tab_content">
                        <!-- 表计详细表 -->
                        <table class="data display">
                            <thead>
                            <tr>
                                <th width="30">序号</th>
                                <th width="80">姓名</th>
                                <th width="80">表径</th>
                                <th width="80">身表码</th>
                                <th width="80">最大表码值</th>
                                <th width="80">起始码</th>
                                <th width="100">水表厂家</th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>
	<#list beOrderusers as bou>
    <tr class="odd">
        <td>${bou_index}</td>
        <td>${bou.userName}</td>
        <td>${bou.meterName}</td>
        <td></td>
        <td>${bou.maxValue}</td>
        <td>${bou.startValue}</td>
        <td>
				<#if bou.meterFactory ??>
                    ${bou.meterFactory}

                <#else >

                </#if>
        </td>
        <td></td>
    </tr>
    </#list>
                            </tbody>
                        </table>
                        <!-- 表计详细表 -->
                    </div>
                    <div id="tab5" class="tab_content">
                        <!-- 其它信息 -->
                        <table width="100%">
                            <thead>
                            <tr>
                                <th width="60"></th>
                                <th width="220"></th>
                                <th width="60"></th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>建单日期</td>
                                <td>
                                    <input readonly="readonly" value="${beOrder.createDate}"/>
                                </td>
                                <td>关单日期</td>
                                <td>
			<#if beOrder.completeDate ??>
                <input readonly="readonly" value="${beOrder.completeDate}"/>

            <#else >
				                <input readonly="readonly" value=""/>

            </#if>
                                </td>
                            </tr>
                            <tr>
                                <td>开工日期</td>
                                <td>
			<#if beOrder.projectDate1 ??>
                <input readonly="readonly" value="${beOrder.projectDate1}"/>

            <#else >
				                <input readonly="readonly" value=""/>

            </#if>
                                </td>
                                <td>竣工日期</td>
                                <td>
			<#if beOrder.projectDate2 ??>
                <input readonly="readonly" value="${beOrder.projectDate2}"/>

            <#else >
			                <input readonly="readonly" value=""/>
            </#if>
                                </td>
                            </tr>
                            <tr>
                                <td>审核人</td>
                                <td>
			<#list syEmps as sy>
				<#if beOrder.auditEmpId.id == sy.id>
					<input readonly="readonly" value="${sy.empName}"/>
                </#if>
            </#list>
                                </td>
                            </tr>
                            <tr>
                                <td style="vertical-align:top;">审核意见</td>
                                <td colspan="3">
                                    <textarea readonly="readonly"
                                              style="width:426px;height:150px;">${beOrder.auditMessage}</textarea>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                        <!-- 其它信息 -->
                    </div>
                    <div id="tab6" class="tab_content">
                        <!-- 交费信息 -->
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
                                <td>总应收</td>
                                <td><input readonly="readonly" class="right" value="${beOrder.projectMoney}"/> 元</td>
                                <td>总实收</td>
                                <td><input readonly="readonly" class="right" value="${beOrder.realMoney}"/> 元</td>
                                <td>总欠缴</td>
                                <td><input readonly="readonly" class="right" value="${beOrder.userNo.userMoney}"/> 元
                                </td>
                            </tr>
                            </tbody>
                        </table>
                        <table class="data display">
                            <thead>
                            <tr>
                                <th width="30">序号</th>
                                <th width="80">姓名</th>
                                <th width="80">应交金额</th>
                                <th width="80">实收金额</th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>
	<#list beOrderusers as bou>
    <tr class="odd">
        <td>${bou_index}</td>
        <td>${bou.userName}</td>
        <td>${bou.projectMoney}</td>
        <td>${bou.realMoney}</td>
        <td></td>
    </tr>
    </#list>
                            </tbody>
                        </table>
                        <!-- 交费信息 -->
                    </div>
                </div>
            </div>

        </div> <!-- .x12 -->

    </div> <!-- #content -->

    <div id="footer">
        <div class="content_pad">
            <p>&copy; 2013-11 版权所有 <a href="#">湖南省自来水公司</a>. 技术支持 <a href="#">华瑞教育</a>.</p>
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

    $(document).ready(function () {
        Dashboard.init();

        //选项卡初始化
        $('.tab_container').tabs();
    });

</script>

</body>

</html>