<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration Form</title>

<style>
.error{color:red}

</style>
</head>
<body>

<em>Fill out the form Asterik(*) means required</em>
<br><br><br>
<form:form action="processForm" modelAttribute="customer">

First Name : <form:input path="firstName"/>
<br><br><br>

Last Name(*) : <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
<br><br><br>
Enter Customer Pass: <form:input path="freePass"/>
<form:errors path="freePass" cssClass="error"/>
<br><br><br>

Enter Postal Code: <form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>
<br><br><br>

Enter Course Code: <form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error"/>
<br><br><br>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>