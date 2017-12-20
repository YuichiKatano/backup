<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<img src="img/korea.jpg">
<br><br><br>
<a href='<s:url action="BuyItemAction"/>'>購入ページへ</a>
<br>
<a href='<s:url action="CountryAction"/>'>戻る</a>

</body>
</html>