<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<h1>This is HttpServletDemo to send Post request</h1>
	<form action="/post-requests-demo/post.do" method="POST">
		Name : <input type="text" name="username" /> <br /> <input
			type="submit" value="Click Here" />
	</form>
</body>
</html>