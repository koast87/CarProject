<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.user.Cars"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.container{width:400px}
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
</style>
<title>You Paid For It</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h2 style="margin-left:35%">Transaction History</h2>
<table class="container">

<tr>
<th>Make</th>
<th>Model</th>
<th>Year</th>
<th>Sell Date</th>
</tr>
<c:forEach var="car" items="${boughtCars}">
<tr>


<td>${car.make}</td>
<td>${car.model}</td>
<td>${car.year}</td>
<td>${sellDate}</td>

</tr>
</c:forEach>
</table>
</body>
</html>