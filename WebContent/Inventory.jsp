<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.user.Cars"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Inventory</title>
<style>
div.gallery {
	margin: 5px;
	border: 1px solid #ccc;
	float: left;
	width: 180px;
}

div.gallery:hover {
	border: 1px solid #777;
}

div.gallery img {
	width: 100%;
	height: auto;
}

div.desc {
	padding: 15px;
	text-align: center;
}

* {
	box-sizing: border-box;
}

.responsive {
	padding: 0 6px;
	float: left;
	width: 24.99999%;
}

@media only screen and (max-width: 700px) {
	.responsive {
		width: 49.99999%;
		margin: 6px 0;
	}
}

@media only screen and (max-width: 500px) {
	.responsive {
		width: 100%;
	}
}

.clearfix:after {
	content: "";
	display: table;
	clear: both;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<h1 align="center">Cars</h1>
	<form action="CarDetails" method="get">
	<div>
		<c:forEach var="car" items="${cars}">

			<div class="gallery"
				style="width: 400px; height: 400px; margin-right: 100px; margin-left: 25px">
				<a href="CarDetails?carId=${car.carId}"> <img src="${car.image}" alt="${car.model}"
					style="width: 400px; height: 300px">
				</a>
				<div class="desc">${car.make}${car.model}</div>
			</div>

		</c:forEach>
	</div>
	</form>
</body>
</html>