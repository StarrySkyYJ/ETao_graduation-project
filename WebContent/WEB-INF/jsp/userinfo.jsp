<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>我的设置</title>
 <link rel="stylesheet" href="${pageContext.request.contextPath }/stylesheets/style_etao_setting.css">
</head>
<body>
	<%@include file="setting_left.jsp"%>
		<div id="folding-setting">
		<s:if test="#session.existUser == null ">
			<h1>请登录...</h1>
		</s:if>
		<s:else>
		<form action="${pageContext.request.contextPath }/user_userInfoUpdate.action" method="post">
			<input name="id" type="hidden" value="<s:property value="#session.existUser.id" />" />
			<table border="1">
			
				<tr>
					<td>用户:</td>
					<td><input name="username" type="text" value="<s:property value="#session.existUser.username" />" /></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input name="password" type="text" value="<s:property value="#session.existUser.password" />" /></td>
				</tr>
				<tr>
					<td>电话:</td>
					<td><input name="phonenumber" type="text" value="<s:property value="#session.existUser.phonenumber" />" /></td>
				</tr>
				<tr>
					<td>邮箱:</td>
					<td><input name="email" type="text" value="<s:property value="#session.existUser.email" />" /></td>
				</tr>
				<tr>
					<td>学号:</td>
					<td><input name="studentid" type="text" value="<s:property value="#session.existUser.studentid" />" /></td>
				</tr>
				<tr>
					<td>年级:</td>
					<td><input name="grade" type="text" value="<s:property value="#session.existUser.grade" />" /></td>
				</tr>
				<tr>
					<td>班级:</td>
					<td><input name="classes" type="text" value="<s:property value="#session.existUser.classes" />" /></td>
				</tr>
				<tr>
					<td>宿舍:</td>
					<td><input name="dormitory" type="text" value="<s:property value="#session.existUser.dormitory" />" /></td>
				</tr>
				
				<tr>
					<td>确认修改：</td>
					<td><input type="submit" value="提交修改" /></td>
				</tr>
				</table>
				
			</form>	
				
			</s:else>
		</div>
		
</body>
</html>
