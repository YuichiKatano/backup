<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<s:if test="myPageList==null">
<h3>ご購入情報はありません。</h3>
</s:if>
<s:elseif test="message==null">
<h3>ご購入情報は以下になります。</h3>
<s:iterator value="myPageList">
		<tr>
				<td><s:property value="itemName"/></td>
				<td><s:property value="totalPrice"/><span>円</span></td>
				<td><s:property value="totalCount"/><span>個</span></td>
				<td><s:property value="payment"/></td>
				<td><s:property value="insert_date"/></td>
		</tr>
</s:iterator>
<s:form action="MyPageAction">
		<input type="hidden" name="deleteFlg" value="1">
		<s:submit value="消去" method="delete"/>
</s:form>
</s:elseif>>
<s:if test="message !=null">
		<h3><s:property value="message"/></h3>
</s:if>





</body>
</html>