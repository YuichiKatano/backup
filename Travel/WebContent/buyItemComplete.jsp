<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>購入が完了しました。</p>

<br><br><br><br>
<a href='<s:url action="MyPageAction"/>'>マイページ</a><span>から購入履歴の確認ができます</span>
<p>Homeへ戻る場合は<a href='<s:url action="HomeAction"/>'>こちら</a>

</body>
</html>