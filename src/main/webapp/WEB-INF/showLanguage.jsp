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
				<div class="col-md-12"><h4>Language<a href="/languages" class="pull-right">Dashboard</a></h4></div>
			</div>
			<div class="row">
				<div class="col-md-2"></div>
				<div class="col-md-8"></div>
					<h5>Name: <c:out value="${language.name}"/></h5>
					<h5>Creator: <c:out value="${language.creator}"/></h5>
					<h5>Version: <c:out value="${language.version}"/></h5>
					<h5><a href="/languages/delete/${language.id}">Delete</a> | <a href="/languages/edit/${language.id}">Edit</a></h5>
				</div>
				<div class="col-md-2"></div>
			</div>
			<div class="row header text-center">
				<div class="col-md-2"></div>
				<div class="col-md-8"></div>
				<div class="col-md-2"></div>
			</div>
		</div>
	</body>
</html>