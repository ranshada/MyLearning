<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World view</title>
</head>
<style type="text/css">

body {
    background-color: fuchsia;
}
</style>

<h1>Hello World of Spring</h1>

<br>

Student name : ${param.studentname}
<br><br><br><br>
New Message : ${message}

</body>
</html>