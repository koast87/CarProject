<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.user.Cars" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
<style>
.container{
	width:100px;
}
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
tr:nth-child(odd){
	background-color: white;
}
img{
	align:center;
	margin-left:30%
}
</style>
</head>
<body style="background-color:orange">
<jsp:include page="header.jsp"></jsp:include>
<h1>Car Details</h1>
 <img src="${car.image}" alt="${car.model}" width="600px" height="400px" >
<table align="center" class="container">

	<tr>  
	<th>Model</th>
	<td>${car.model}</td>
	</tr>
	<tr>
	<th>Make</th>
	<td><c:out value="${car.make}" /></td>
	</tr>
	<tr>
	<th>Year</th>
	<td>${car.year}</td>
	</tr>
	<tr>
	<th>Price</th>
	<td>$${car.price}0</td>
	</tr>

	</table>
	<div style="margin-left:35%">
		<a href="Confirm.jsp">
	<button type="button"  class="btn btn-primary btn-lg">Buy This Car!</button>
	</a>
		<c:if test="${car.daysIdle}">
		<p>You can place an offer on this car</p>
		<p>Note: if offer is to low you will be redirected back to this page.</p>
		<form action="Bidding" method=post>
		
		<label for="offer">Offer: </label>
		<input type="text" class="form-control " style="width:100px"name="offer" id="offer" 
   	 placeholder="Offer"><br>
		<button type="submit" class="btn btn-primary btn-lg">Place an offer!</button>
		</form>
		<c:if test="offer<${car.price}-(${car.price}*.1)">Offer not accepted.</c:if>
	</c:if>
	</div>
</body>
</html>