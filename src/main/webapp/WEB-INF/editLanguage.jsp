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
				<div class="col-md-12">
					<h2>Edit Language</h2>
					<p><a href="/languages/delete/${language.id}">Delete</a> | <a href="/languages">Dashboard</a></p>
					
				</div>
			</div>
			<div class="row header text-center">
				<div class="col-md-2"></div>
				<div class="col-md-8">
					<form:form method="POST" action="/languages/edit/${language.id}" modelAttribute="language" class="form-inline">
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