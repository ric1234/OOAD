<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>CU-Connect | home</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome" class="navbar-brand">CU-Connect</a>
		</div>
	</div>
	<h3> Stay connected always!</h3>
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