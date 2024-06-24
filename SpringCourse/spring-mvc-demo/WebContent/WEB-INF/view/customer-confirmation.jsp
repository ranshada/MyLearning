<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Confirmation Page</title>
</head>
<body>

Customer confirmed Details : ${customer.firstName} ${customer.lastName}
<br>
Free Passes: ${customer.freePass}

Postal Code: ${customer.postalCode}

Course Code: ${customer.courseCode }

</body>
</html>