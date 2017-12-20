<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<link href="./css/country.css" rel="stylesheet" type="text/css">
<meta  charset="UTF-8">
<title>国検索</title>

</head>
<body>



<select name="place" onChange="location.href=value;">
	<option value="JapanAction">日本</option>
	<option value="KoreaAction">韓国</option>
	<option value="AusAction">オーストラリア</option>
	<option value="UsaAction">アメリカ</option>
	<option value="CanadaAction">カナダ</option>

</select>

<br><br>
<div class="worldmap">
	<img src="img/world.jpg">
</div>

</body>
</html>