<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="seller.login.Userlog"%>
<%@page import="seller.login.Userdatadb"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/profile.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/footer.css">
<script src="js/profile.js"></script>
<meta charset="ISO-8859-1">
<title>Online Shopping Store </title>
</head>
<body>
<header>
    <nav>
		<label class="logo">OderMe</label>
		<ul>
		   <li><a class="active" href="sellerhome.jsp">Home</a></li>
		   <li><a href="#">Contact</a></li>
		   <li><a href="my items.jsp">My Items</a></li>
		   <li>
			<a href="#">My Account
				<i class="fas fa-caret-down"></i>
			</a>
			<ul>
				<li><a href="additems.jsp">Add Items</a></li>
				<li><a href="profile.jsp">Profile</a></li>
				<li><a href="login.jsp">Log Out</a></li>
				<li>
			</li>
			</ul>
			</li>
			<li><a href="#">Feedback</a></li>
		</ul>
	 </nav>
</header>
<img src="pic/pro.jpg" style="width:500px;margin-top:80px;margin-left:800px;">
<%
	Userlog user= new Userlog();
	String username=(String)session.getAttribute("username");
	Userdatadb udb = new Userdatadb();
	user=udb.Retrive(username);
%>
 <div align="center" class="login-form">
  <form>
   <h1 class="ha1">Seller Profile</h1>
		
		<div class="txtb">
		 	<label ><b>Shop Name: </b><% out.print(user.getName()); %></label>
		</div>
		
		<div class="txtb">
			<label ><b>Email: </b><% out.print(user.getemail()); %></label>
		</div>
		<div class="txtb">
			<label ><b>Phone: </b><% out.print(user.getPhone()); %></label>
		</div>
		<input type="button" class="logbtn" value="Change My Password" onclick="page1()">
		
		<input type="button" class="logbtn" value="Delete  My Account" name="delete" onclick="page2()">
 </form>
 </div>
  <footer class="footer" style="margin-top: 100px;">
  	 <div class="container">
  	 	<div class="row">
  	 		<div class="footer-col">
  	 			<h4>company</h4>
  	 			<ul>
  	 				<li><a href="#">about us</a></li>
  	 				<li><a href="#">our services</a></li>
  	 				<li><a href="#">privacy policy</a></li>
  	 				<li><a href="#">affiliate program</a></li>
  	 			</ul>
  	 		</div>
  	 		<div class="footer-col">
  	 			<h4>get help</h4>
  	 			<ul>
  	 				<li><a href="#">FAQ</a></li>
  	 				<li><a href="#">shipping</a></li>
  	 				<li><a href="#">returns</a></li>
  	 				<li><a href="#">order status</a></li>
  	 				<li><a href="#">payment options</a></li>
  	 			</ul>
  	 		</div>
  	 		<div class="footer-col">
  	 			<h4>online shop</h4>
  	 			<ul>
  	 				<li><a href="#">watch</a></li>
  	 				<li><a href="#">bag</a></li>
  	 				<li><a href="#">shoes</a></li>
  	 				<li><a href="#">dress</a></li>
  	 			</ul>
  	 		</div>
  	 		<div class="footer-col">
  	 			<h4>About us</h4>
  	 				<p class="par">Welcome to Sri Lanka's first inspirational global experience in online grocery retailing. Be a part of this experience, redefining convenience and freshness.</p>
  	 			</div>
  	 		</div>
  	 	</div>
  </footer>
</body>
</html>