<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer's List</title>

<!-- reference css file -->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM- Customer Relationship Manager</h2>
		</div>
	</div>


	<div id="container">
		<div id="content">


			<!--  add out html task here -->

			<input type="button" value="Add Customer"
				onClick="window.location.href='showFormForAdd';return false;"
				class="add-button" />
				
				<form:form action="search" method="GET">
				Search Customer: <input type="text" name="searchName">
				<input type="submit" value="Search" class="add-button" />
				</form:form>
				
				</br>
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
				
				<c:url var="updateLink" value="/customer/showFormForUpdate">
				<c:param name="customerId" value="${tempCustomer.id}"/>
				</c:url>
				
				<c:url var="deleteLink" value="/customer/delete">
				<c:param name="customerId" value="${tempCustomer.id}"/>
				</c:url>
					<tr>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
						<td>
						<a href="${updateLink}">Update</a>
						| 
						<a href="${deleteLink}"
						onCLick="if (!(confirm('Are you sure to delete this customer'))) return false">Delete</a>
						
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>