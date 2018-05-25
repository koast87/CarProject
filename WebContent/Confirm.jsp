<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page import="com.user.Cars" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm Page</title>

</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<div><c:if test="${car.daysIdle}">${car.price}</c:if>
	<c:if test="${car.daysIdle==false}">${offer}</c:if></div>
	<div style="margin-left:35%">
	<img src="${car.image}" alt="${car.model}" width="600px" height="400px">
	<h4>Did you want to buy this car?</h4>
	<a href="CheckoutServlet">
		<button type="button" class="btn btn-primary btn-lg ">Yes!
			Buy This Car!</button>
	</a>

	<a href=Details.jsp>
		<button type="button" class="btn btn-primary btn-lg "
			style="background-color: red">Wait! Let me check again</button>
	</a>
	</div>
</body>
</html>