<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>搜索结果</title>
</head>
<body>

<s:iterator var="si" value="ilist">
	<h3><s:property value="#si.id"/>: <s:property value="#si.itemsname"/></h3>
	
</s:iterator>
</body>
</html>