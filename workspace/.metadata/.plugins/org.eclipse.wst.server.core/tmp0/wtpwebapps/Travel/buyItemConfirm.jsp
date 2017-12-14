<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta  charset="UTF-8">
<title></title>

<script type="text/javascript">
		function SubmitAction(action,number){
			var form=document.createElement('form');
			document.body.appendChild(form);
			form.setAttribute('action',action);
			form.setAttribute('method','post');


			if(number==2){
				var link="購入完了します。"

			}else if(number==1){
				var link="購入画面に戻ります。"

			}

			var ret=confirm(link+"宜しいですか？");
					if(ret==true){
						form.submit();
					}
		}
</script>
</head>
<body>

<s:form>

		<p>国名</p>
		<s:property value="session.buyItemDTO.itemName"/>

		<br>
		<p>値段</p>
		<s:property value="session.totalPrice"/><span>円</span>
		<br>
		<p>人数</p>
		<s:property value="session.count"/><span>人</span>
		<br>
		<p>支払い方法</p>
		<s:property value="session.pay"/>


		<br><br><br>
				<input type="button" value="戻る" onClick="SubmitAction('BuyItemAction',1)"/>
				<input type="button" value="完了" onClick="SubmitAction('BuyItemCompleteAction',2)"/>


</s:form>
</body>
</html>