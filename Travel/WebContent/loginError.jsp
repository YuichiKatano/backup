<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>LoginError</title>
</head>
<body>

ログインに失敗しました。
<br>
<br>

<s:if test='(#session.loginDTOList.get(0).username)=="該当なし”'>
該当者はいませんでした。
</s:if>

<a href='<s:url action="LoginAction"/>'>ログイン画面へ戻る</a>
<br>
<a href='<s:url action="UserCreateAction"/>'>新規ユーザー登録はこちら</a>


</body>
</html>