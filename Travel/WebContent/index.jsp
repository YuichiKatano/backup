<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<link href="./css/style.css" rel="stylesheet" type="text/css">
<script src="./js/slick.js" type="text/javascript"></script>
<link rel="stylesheet" href="slick.css">






<title>Home</title>
</head>
<body>



<header>
		<div class="logo"><h2>TravelWorld</h2></div>

				<ul>
						<li><a href =<s:url action ="BuyItemAction"/>>購入</a></li>


				</ul>

<div class="login">
<ul>
	<li><a href=<s:url action="LoginAction"/>>ログイン</a></li>
	<li><a href=<s:url action="UserCreateAction"/>>新規登録</a></li>
</ul>
</div>
</header>








<br><br><br><br><br><br>

<s:form action="CountryAction">
		<s:submit value="国を検索"/>
</s:form>
<div id="main">
<br><br>
	<div id='sightseeing'>

		<img src="img/japan.jpg">

		<img src="img/korea.jpg">

		<img src="img/aus.jpg">

		<img src="img/usa.jpg">

		<img src="img/canada.jpg">

	</div>

</div>



</body>
</html>