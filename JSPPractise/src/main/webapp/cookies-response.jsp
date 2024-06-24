<html>

<head>COnfirmation</head>

<%
String fav=request.getParameter("favLan");

Cookie cookie= new Cookie("myApp.favLanguage", fav);

cookie.setMaxAge(60*60*24*365);


response.addCookie(cookie);




%>
<body>

Thanks ! We set your Fav Language to ${param.favLan }

<br><br>
<a href="cookie-example.html">Back to Home page</a>



</body>

</html>