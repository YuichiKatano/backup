<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta  charset="UTF-8">
<title>Login確認画面</title>
</head>
<body>

<s:property value="#session.username"/>さん、ようこそ！
<br><br>
<a href='<s:url action="HomeAction"/>'>ホーム画面へ</a>
</body>
</html>