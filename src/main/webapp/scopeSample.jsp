<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scope Sample</title>
</head>
<body> 
 
<% 
    pageContext.setAttribute("data", "page"); 
    request.setAttribute("data", "request"); 
    session.setAttribute("data", "session");
    application.setAttribute("data", "application");
%> 
 
<h1>現在の時刻</h1> 
ページスコープ: <%= pageContext.getAttribute("data") %><br> 
リクエストスコープ: <%= request.getAttribute("data") %><br> 
セッションスコープ: <%= session.getAttribute("data") %><br> 
アプリケーションスコープ: <%= application.getAttribute("data") %><br> 
 
</body>
</html>