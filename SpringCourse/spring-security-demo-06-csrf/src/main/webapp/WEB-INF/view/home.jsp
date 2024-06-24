<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

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
 
 
  <input type="submit" value="Logout"/>
 
 </form:form>
 


</body>


</html>