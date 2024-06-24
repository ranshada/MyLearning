<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>

<br><br><br>

<form:form action="processForm" modelAttribute="student">
First Name : <form:input path="firstName"/>

<br><br><br>

Last Name : <form:input path="lastName"/>


<br><br><br>
Enter Country : 
<form:select path="country">
<form:options items="${student.countryOptions }"/>


</form:select>
<br><br><br><br>
Favorite Language : 

<br><br><br>

Java	<form:radiobutton path="favoriteLanguage" value="Java"/>
C++		<form:radiobutton path="favoriteLanguage" value="C++"/>
PHP		<form:radiobutton path="favoriteLanguage" value="PHP"/>
Ruby	<form:radiobutton path="favoriteLanguage" value="Ruby"/>

<br><br> <br>

Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Window" />

		<br><br>
<br><br> <br>

<input type="submit" value="Submit"/>

</form:form>

</body>
</html>