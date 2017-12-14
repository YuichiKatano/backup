<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

登録する内容は以下でよろしいですか。
<s:form action="UserCreateCompleteAction">
ログインID:
<s:property value="loginUserId" escape="false"/>
<br>
ログインPASS:
<s:property value="loginPassword" escape="false"/>
<br>
ユーザー名：
<s:property value="userName" escape="false"/>
<br>
<s:submit value="登録"/>
</s:form>

</body>
</html>