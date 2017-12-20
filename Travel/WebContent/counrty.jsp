<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
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


</body>
</html>