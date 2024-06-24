<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

Welcome to the Luv 2 Code company home page!!!!  yohooo


<form:form action="${pageContext.request.contextPath}/logout"
 method="POST">

<hr>

<!-- Display user name and role -->

<p>

User: <security:authentication property="principal.username"/>
<br><br>
Role(s) : <security:authentication property="principal.authorities"/>
</p>

</hr>
<security:authorize access="hasRole('MANAGER')">
<hr>
<a href="${pageContext.request.contextPath}/leaders">LeaderShip Meeting</a>
(only for Manager peeps)
</hr>
</security:authorize>

<hr>
<security:authorize access="hasRole('ADMIN')">
<a href="${pageContext.request.contextPath}/systems">System Administration</a>
(only for Admin peeps)
</security:authorize>
</hr>
<p>


</p>
<br>

 
  <input type="submit" value="Logout"/>
 
 </form:form>
 


</body>


</html>