<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Practise</title>
</head>
<body>

Hi !!!!!  <% out.println(request.getParameter("firstName")); %>   <% out.println(request.getParameter("lastName")); %>
<br>
The Student Name is confirmed : ${param.firstName }  ${param.lastName}
<br><br>
Your Languages are:
<ul>
<%
String[] langs=request.getParameterValues("favoriteLanguage");
if(langs!=null){
for(int i=0;i<langs.length;i++){
	out.println("<li>"+langs[i]+"</li>");
	
}
}
%>


</ul>

</body>
</html>