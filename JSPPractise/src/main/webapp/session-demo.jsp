<%@ page import="java.util.*" %>

<html>
<body>

<form action="session-demo.jsp">

ADD new Item:  
<input type="text" name="item">

<br>

<input type="submit" name="submit">

<hr>

</form>

To Do List Items:

<% 
// get the todo items from the session


List<String> items=(List<String>)session.getAttribute("myToDoList");

//if the todo items doesn't exist create one

if(items==null){

items=new ArrayList<String>();
session.setAttribute("myToDoList", items);

}

//see if there data to add

String theItem=request.getParameter("item");
if(theItem!=null && !theItem.trim().equals("")){
	
	items.add(theItem);
}
%>

<hr>

<ol>

<%

for(String temp:items){
	out.println("<li>"+temp+"</li>");
}

%>

<% session.setMaxInactiveInterval(10); 

out.println("<h1>"+session.getCreationTime()+"</h1>");

%>

Max Time Limit is :
<% out.println("<h1>"+session.getMaxInactiveInterval()+"</h1>"); %>

</ol>


</body>

</html>