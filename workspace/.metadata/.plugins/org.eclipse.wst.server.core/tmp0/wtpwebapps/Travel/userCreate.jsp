<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>新規登録画面</title>
</head>
<body>

		<s:if test="errorMessage !=''">
				<s:property value="errorMessage" escape="false"/>
		</s:if>
		<s:form action="UserCreateConfirmAction">
		ログインID：
		<input type="text" name="loginUserId" value=""/>
		<br>
		ログインPASS：
		<input type="text" name="loginPassword" value=""/>
		<br>
		ユーザー名：
		<input type="text" name="userName" value=""/>
		<s:submit value="登録"/>
		</s:form>

		<br>
		ホーム画面に戻る場合は<a href='<s:url action="HomeAction"/>'>こちら</a>


</body>
</html>