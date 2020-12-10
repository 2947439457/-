<!DOCTYPE html>
 
<html xmlns="http://www.w3.org/1999/xhtml"> 
 
<head> 
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" /> 
	<title>湖南省自来水公司营销管理信息系统 - 员工登陆</title> 
	
	<link rel="stylesheet" href="./css/reset.css" type="text/css" media="screen" title="no title" />
	<link rel="stylesheet" href="./css/text.css" type="text/css" media="screen" title="no title" />
	<link rel="stylesheet" href="./css/form.css" type="text/css" media="screen" title="no title" />
	<link rel="stylesheet" href="./css/buttons.css" type="text/css" media="screen" title="no title" />
	<link rel="stylesheet" href="./css/login.css" type="text/css" media="screen" title="no title" />
    <script type="text/javascript" src="js/jquery/jquery-1.5.2.min.js"></script>
</head>
<body>
<script src="js/jquery/jquery-1.5.2.min.js" type="text/javascript"></script>
<script type="text/javascript" language="javascript">
    $(document).ready(function(){
        var gh=$("#email");
        var mm=$("#password");
        alert(gh.val());
        alert(mm.val()); //html和text的区别在于,text只显示div中的文本,不包含HTML标记.html方法会显示div中其它的标记,你可以试着把<div id="mydiv"><font stle='color:red;'>aaaa</font></div> 可以体验一下就知道里面的区别了

    }) ;
</script>
<div id="login_background">
<div id="login">
	<h1>员工登陆</h1>
	<div id="login_panel">
		<form action="workspace.ftl" method="post" accept-charset="utf-8">
			<div class="login_fields">
				<div class="field">
					<label for="email">员工工号：</label>
					<input type="text" name="email" value="" id="email" tabindex="1" placeholder="请输入您的员工编号" />		
				</div>
				
				<div class="field">
					<label for="password">登陆密码： </label>
					<input type="password" name="password" value="" id="password" tabindex="2" placeholder="请输入您的密码" />			
				</div>
			</div> <!-- .login_fields -->
			
			<div class="login_actions">
				<button type="submit" class="btn btn-orange" tabindex="3">登陆</button>
			</div>
		</form>
	</div> <!-- #login_panel -->		
</div> 
<!-- #login -->
</div>
</body> 
 
</html>