<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="ja">

<head>
<meta  charset="UTF-8">
<link href="./css/japan.css" rel="stylesheet" type="text/css">
<script src="./js/japan.js" type="text/javascript"></script>
<title>日本</title>
</head>
<body>
<div id="japan">
<img src="img/japan.jpg"/>
</div>
<br>
<br>
<br>
<a href='<s:url action="BuyItemAction"/>'>購入ページへ</a>
<br>
<a href='<s:url action="CountryAction"/>'>戻る</a>
<br>
<a href='<s:url action="HomeAction"/>'>ホーム画面に戻る</a>


</body>
</html>