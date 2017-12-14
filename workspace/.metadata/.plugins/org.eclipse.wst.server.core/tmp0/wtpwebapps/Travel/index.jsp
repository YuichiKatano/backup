<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link href="./css/style.css" rel="stylesheet" type="text/css">
<meta  charset="UTF-8">
<title>Home</title>
<script type="text/javascript">
function SubmitAction(action,place){
	var form=document.createElement('form');
	document.body.appendChild(form);
	form.setAttribute('action',action);
	form.setAttribute('method','post');

if(place=="japan"){
	document.getElement('form').action='JapanAction';
}else if(place=="korea"){
	document.getElement('form').action='KoreaAction';
}else if(place=="aus"){
	document.getElement('form').action='AusAction';
}else if(place=="usa"){
	document.getElement('form').action='UsaAction';
}else{
	document.getElement('form').action='CanadaAction';
}
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

<s:form method="post">
行きたい場所を選ぶ：
<select name="place">
		<option value="japan">日本</option>
		<option value="korea">韓国</option>
		<option value="aus">オーストラリア</option>
		<option value="usa">アメリカ</option>
		<option value="canada">カナダ</option>
</select>
<br>
<input type="button" value="検索" onClick="SubmitAction('CountryAction')"/>

</s:form>

</div>



</body>
</html>