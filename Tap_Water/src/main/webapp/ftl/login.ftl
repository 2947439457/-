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

</head> 
 
<body> 
<div id="login_background">
<div id="login">
	<h1>员工登陆</h1>
	<div id="login_panel">
		<form action="workspace.html" method="post" accept-charset="utf-8">
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