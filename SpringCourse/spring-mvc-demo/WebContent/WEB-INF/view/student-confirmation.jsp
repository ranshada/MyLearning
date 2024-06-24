<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student confirmation</title>
</head>
<body>

The Student is confirmed :${student.firstName} ${student.lastName}

<br><br><br><br><br>

Country is :${student.country}

Favorite Laguage is : ${student.favoriteLanguage}

<br><br><br><br><br>

Operating Systems:
<ul>  
<c:forEach var="meal" items="${student.operatingSystems}">  
<li>${meal}</li>  
</c:forEach>  
</ul>  
</body>
</html>