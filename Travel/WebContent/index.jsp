<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link href="./css/style.css" rel="stylesheet" type="text/css">
<meta  charset="UTF-8">
 <link rel="stylesheet" href="./css/sample.css" type="text/css">
 <script type="text/javascript" src="./js/slick.js"></script>
 <script src="./js/slick.js" type="text/javascript"></script>
<title>Home</title>
<script type="text/javascript">



</script>
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





<div id="main">


<br><br><br><br><br><br>

<s:form action="CountryAction">
		<s:submit value="国を検索"/>
</s:form>
<br><br>
	<div class='sightseeing'>
		<img src="img/japan.jpg">
	</div>
	<div>
		<img src="img/korea.jpg">
	</div>
	<div>
		<img src="img/aus.jpg">
	</div>
	<div>
		<img src="img/usa.jpg">
	</div>
	<div>
		<img src="img/canada.jpg">
	</div>

</div>



</body>
</html>