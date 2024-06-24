<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Login Page</title>

<style>
.failed {

color: red;}


</style>

</head>
<body>
<h3>My Custom Login page</h3>
 
 <form:form action="${pageContext.request.contextPath}/authenticate"
 method="POST">
 
 <!-- Check for login error -->
 
 <c:if test="${param.error !=null}">
 
 <i class="failed">Sorry ! you enetered invalid username/password</i>
 
 </c:if>
 
 <p>
 
 User Name : <input type="text" name="username"/>
 
 </p>
 
 <p>
  Password : <input type="password" name="password"/>
 
 </p>
 
 <input type="submit" value="Login"/>
 
 </form:form>

</body>
</html>