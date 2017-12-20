<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta  charset="UTF-8">
<script type="text/javascript">
		if(country.equals("japan" && "korea")){
			price="30000";
		}else if(country.equals("aus")){
			price="50000";
		}else if(country.equals("usa")){
			price="80000";
		}else if(country.equals("canada")){
			price="70000";
		}
</script>
<title>購入画面</title>
</head>
<body>




<s:form action="BuyItemConfirmAction">
 		<div>
			<s:label>国名</s:label>
			<!--<s:property value="session.buyItemDTO.itemName" />-->
			<!--
			<select name="country">
					<option value="japan">日本</option>
					<option value="korea">韓国</option>
					<option value="aus">オーストラリア</option>
					<option value="usa">アメリカ</option>
					<option value="canada">カナダ</option>
			</select>
			 -->

			<select name="id">
			  <s:if test ="buyItemDTOList">
			    	<option value="1">日本</option>
					<option value="2">韓国</option>
					<option value="3">オーストラリア</option>
					<option value="4">アメリカ</option>
					<option value="5">カナダ</option>
			  </s:if>
			</select>
		 </div>
		 <div>
	<s:label>値段</s:label>

	購入場所により、値段は変わります。詳細は、購入確認画面で。


			<!--<s:property value="session.buyItemDTO.itemPrice" />-->
		</div>

		<div>
			<p>人数</p>
			<select name="count">
					<option value="1" selected="selected">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
			</select>
		</div>

		<div>
			<p>支払い方法</p>
					<input type="radio" name="payment" value="1" checked="checked">現金払い
					<input type="radio" name="payment" value="2">クレジットカード
		</div>
		<div>
			<s:submit value="購入"/>
		</div>
</s:form>


</body>
</html>