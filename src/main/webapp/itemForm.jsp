<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show All Items</title>
</head>
<body> 
ソート: <a href="ItemServlet2?action=sort&key=price_asc">価格の低い順</a>, 
<a href="ItemServlet2?action=sort&key=price_desc">価格の高い順</a><br> 
 
<form action="ItemServlet2" method="post"> 
追加:商品名<input type="text" name="name"> 
価格<input type="text" name="price" size="5"><input type="submit" value="追加"> 
<input type="hidden" name="action" value="add"> 
</form> 
 
<form action="ItemServlet2" method="post"> 
検索: <input type="text" name="price" size="5">円以下の商品を 
<input type="submit" value="検索"> 
<input type="hidden" name="action" value="search"> 
</form> 
 
<form action="ItemServlet2" method="post"> 
削除: 商品番号<input type="text" name="code" size="5"> 
番の商品を<input type="submit" value="削除"> 
<input type="hidden" name="action" value="delete"> 
</form>
</body>
</html>