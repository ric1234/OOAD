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
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/login">Login</a></li>
					<li><a href="/register">New Registration</a></li>
					<li><a href="/show-users">All Users</a></li>
				</ul>
			</div>
		</div>
	</div>

<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>

<c:choose>
<c:when test="${mode=='MODE_HOME' }">
<div class="container" id="homediv">
	<div class="jumbotron text-center">
		<h1>Welcome to CU-Connect</h1>
		<h3>Home for all the buffs</h3>
	</div>
</div>
</c:when>


<c:when test="${mode=='MODE_REGISTER' }">
<div class="container text-center">
	<h3>New Registration</h3>
	<hr>
	<form class="form-horizontal" method="POST" action="save-user">
		<input type="hidden" name="id" value="${person.id }" />
		<div class="form-group">
			<label class="control-label col-md-3">Username</label>
			<div class="col-md-7">
				<input type="text" class="form-control" name="username"
					value="${person.username }" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3">First Name</label>
			<div class="col-md-7">
				<input type="text" class="form-control" name="firstName"
					value="${person.firstName }" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3">Last Name</label>
			<div class="col-md-7">
				<input type="text" class="form-control" name="lastName"
					value="${person.lastName }" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3">Age </label>
			<div class="col-md-3">
				<input type="text" class="form-control" name="age"
					value="${person.age }" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3">Password</label>
			<div class="col-md-7">
				<input type="password" class="form-control" name="password"
					value="${person.password }" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3">Email</label>
			<div class="col-md-7">
				<input type="text" class="form-control" name="email"
					value="${person.email }" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3">Phone</label>
			<div class="col-md-7">
				<input type="text" class="form-control" name="phone"
					value="${person.phone }" />
			</div>
		</div>
		<div class="form-group ">
			<input type="submit" class="btn btn-primary" value="Register" />
		</div>
	</form>
</div>
</c:when>


<c:when test="${mode=='MODE_ALL_USERS' }">
			<div class="container text-center" id="tasksDiv">
				<h3>All Users</h3>
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
						 	<th>Delete</th>
								<th>Edit</th>   
							</tr>
						</thead>
						<tbody>
							<c:forEach var="person" items="${persons}">
								<tr>
									<td>${person.id}</td>
									<td>${person.username}</td>
									<td>${person.firstName}</td>
									<td>${person.lastName}</td>
									<td>${person.age}</td>
								  	<td><a href="/delete-person?id=${person.id }"><span
											class="glyphicon glyphicon-trash"></span></a></td>
									<td><a href="/edit-person?id=${person.id }"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>

	<c:when test="${mode=='MODE_LOGIN' }">
		<div class="container text-center">
			<h3>User Login</h3>
			<hr>
			<form class="form-horizontal" method="POST" action="/login-user">
				<c:if test="${not empty error }">
					<div class="alert alert-danger">
						<c:out value="${error }"></c:out>
					</div>
				</c:if>
				<div class="form-group">
					<label class="control-label col-md-3">Username</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="username"
							value="${person.username }" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3">Password</label>
					<div class="col-md-7">
						<input type="password" class="form-control" name="password"
							value="${person.password }" />
					</div>
				</div>
				<div class="form-group ">
					<input type="submit" class="btn btn-primary" value="Login" />
				</div>
			</form>
		</div>
	</c:when>

</c:choose>

</html>