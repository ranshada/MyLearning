<html>
<body>

<!-- read fav language if cookie is present -->
<h3>Training Portal</h3>


<%

String favlan="Java";
Cookie[] coo=request.getCookies();

if(coo!=null){
for(Cookie cook:coo){
	if("myApp.favLanguage".equals(cook.getName())){
		favlan=cook.getValue();
		break;
	}
}
}

%>
<!-- -now show personlized page -->


<h4>New Books for <%= favlan %></h4>
<ul>

<li> blah blah blah </li>
<li> blah blah blah </li>


</ul>

<h4>New reports for <%= favlan %></h4>
<ul>

<li> blah blah blah </li>
<li> blah blah blah </li>

</ul>

<h4>Hot Jobs for <%= favlan %></h4>
<ul>

<li> blah blah blah </li>
<li> blah blah blah </li>

</ul>


<a href="cookie-example.html">Personalized your website</a>



</body>

</html>