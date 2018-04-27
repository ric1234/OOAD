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
					<li><a href="/search-users">Search Users</a></li>
				</ul>
			</div>
		</div>
	</div>


	<h1>Welcome back <c:out value="${name}" /></h1>

	<div class="container text-center">
		<h3></h3>
		<hr>
		<form class="form-horizontal" method="POST" action="add-friend">
			<div class="form-group">
				<label class="control-label col-md-3">Add Friend</label>
				<div class="col-md-7">
					<input type="text" class="form-control" name="username"
						value="${person.username}" />s
				</div>
				<input type="submit" class="btn btn-primary" value="Add" />
			</div>

		</form>
	</div>


	
	<div class="container text-right" id="tasksDiv">
		<h3></h3>
		<hr>
		<div class="table-responsive">
			<table class="table table-striped table-bordered">			
				<thead align = "right">
					<tr >
						<th>Status</th>

					</tr>
				</thead>
				<tbody>					
						<tr align = "left">
							<td><c:out value="${content}" /></td>							
							<td><a href="/delete-person?id=${person.id }"><span
									class="glyphicon glyphicon-trash"></span></a></td>
							<td><a href="/edit-person?id=${person.id }"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
						</tr>
					
				</tbody>
			</table>
		</div>
	</div>  
	
	<div class="container text-right" id="tasksDiv">
		<h3></h3>
		<hr>
		<div class="table-responsive">
			<table class="table table-striped table-bordered">			
				<thead align = "right">
					<tr >
						<th>Emotion</th>

					</tr>
				</thead>
				<tbody>					
						<tr align = "left">
							<td><c:out value="${emotion}" /></td>							
							<td><a href="/delete-person?id=${person.id }"><span
									class="glyphicon glyphicon-trash"></span></a></td>
							<td><a href="/edit-person?id=${person.id }"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
						</tr>
					
				</tbody>
			</table>
		</div>
	</div>




</body>



<c:choose>
	<c:when test="${mode=='MODE_FRIENDS' }">
		<div class="container text-right" id="tasksDiv">
			<h3></h3>
			<hr>
			<div class="table-responsive">
				<table class="table table-striped table-bordered">
					<thead>
						<tr>
							<th align="right">FriendList</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach var="friend" items="${friends}">
							<tr align="right">
								<td><c:out value="${friend}" /></td>

								<td><a href="/delete-person?id=${person.id }"><span
										class="glyphicon glyphicon-trash"></span></a></td>

							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</c:when>
</c:choose>
</html>