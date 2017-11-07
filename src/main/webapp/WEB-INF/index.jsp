<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Languages</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<!-- <link rel="stylesheet" type="text/css" href="/css/style.css"> -->
	</head>

	<body>
		<div class="container">
			<div class="row header text-center">
				<div class="col-md-12"><h2>Languages</h2></div>
			</div>
			<div class="row">
				<div class="col-md-2"></div>
				<div class="col-md-8">
					<table class="table">
						<thead>
						  <tr>
							<th>Name</th>
							<th>Creator</th>
							<th>Version</th>
							<th>Action</th>
						  </tr>
						</thead>
						<tbody>
						<c:forEach items="${languages}" var="language" varStatus="loop">
							<tr>    
								<td><a href="/languages/${language.id}"><c:out value="${language.name}"/></a></td>
								<td><c:out value="${language.creator}"/></td>
								<td><c:out value="${language.version}"/></td>
								<td><a href="/languages/delete/${language.id}">Delete</a> | <a href="/languages/edit/${language.id}">Edit</a></td>
							</tr>
						</c:forEach>
						</tbody>
					  </table>
				</div>
				<div class="col-md-2"></div>
			</div>
			<br>
			<h3 class="text-center">Add Language:</h3>
			<div class="row header text-center">
				<div class="col-md-2"></div>
				<div class="col-md-8">
					<form:form method="POST" action="/languages/new" modelAttribute="language" class="form-inline">
						<form:hidden path="id"></form:hidden>
						<form:label path="name">Name
						<form:errors path="name"/>
						<form:input path="name" class="form-control"/></form:label>
						<br>
						<form:label path="creator">Creator
						<form:errors path="creator"/>
						<form:input path="creator" class="form-control"/></form:label>
						<br>
						<form:label path="version">Version
						<form:errors path="version"/>
						<form:input path="version" class="form-control"/></form:label>
						<br>
						<input type="submit" value="Submit" class="btn btn-default"/>
					</form:form>
				</div>
				<div class="col-md-2"></div>
			</div>
		</div>
	</body>
</html>