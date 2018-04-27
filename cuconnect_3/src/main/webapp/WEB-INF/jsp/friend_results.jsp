<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
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
<h1> Matches </h1> <br>
			<div class="container text-center" id="tasksDiv">
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>UserName</th>
								<th>First Name</th>
								<th>LastName</th>
								<th>Age</th>
						 	 	<th>Email</th>
						 	 	<th>Phone</th>
							</tr>
						</thead>
						<tbody>
							<c:out value="${person}">
								<tr>
									<td>${person.id}</td>
									<td>${person.username}</td>
									<td>${person.firstName}</td>
									<td>${person.lastName}</td>
									<td>${person.age}</td>
									<td>${person.email}</td>
									<td>${person.phone}</td>
								  	
								</tr>
							</c:out>
						</tbody>
					</table>
				</div>
			</div>

</body>
</html>