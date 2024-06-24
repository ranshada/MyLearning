<html>

<body>

<%! String makeItLower(String data){

	return data.toLowerCase();
}
	
%>


<h1>My first Hello program :<%=makeItLower("Hello World") %></h1>

<% out.println("Hello Geeks "); %> <!-- Sriptlet Tag-->
<% int n1=10; int n2=30; %><!-- Sriptlet Tag-->
<% out.println("<br>sum of n1 and n2 is "); %> <!-- Sriptlet Tag-->
<%= n1+n2 %> <!-- Expression tag -->
<% out.println("<h1>Lines of code :</h1>"); %>

</body>

</html>