<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<img src = "/static/img/cu_banner.jpg">
	<h1> Welcome </h1>
	<br>
	<h3>Looking for Friends</h3>
	<form class="form-horizontal" method="POST" action="possible_friend_match">
		<input type="text" class="form_friend" name="username" value="${person.username}" />
		<input type="submit" value="Search" />
		<!--  <div id="button"><a href="login.html">Search Username</a></div>
		<input type="submit" value="Search Username" />
		<input type="submit" value="Search Email" />
		<input type="submit" value="Search Phone" /> -->
	</form>
	

</body>
</html>