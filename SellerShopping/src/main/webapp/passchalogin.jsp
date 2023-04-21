<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/passwordcha.css">
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/footer.css">
<script src="js/forgotpass.js"></script>
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
<img src="pic/pass.jpg" style="width:500px;margin-top:150px;margin-left:800px;">

 <div align="center" class="login-form">
  <form action="${pageContext.request.contextPath}/UserpassServlet" method="post" onsubmit="return pa()">
   <h1 class="ha1">Change My Password</h1>
		
		<div class="txtb">
		 	<input type="text" placeholder="Enter the your email" name="email" required>
		</div>
		
		<div class="txtb">
		 	<input type="password" placeholder="Enter the new password" id="pass" name="pass" required>
		</div>
		
		<div class="txtb">
			<input type="password" placeholder="Re enter the new password" id="repass" required>
		</div>
		
			<input type="submit" class="logbtn" value="Update Password" name="update">
			<input type="button" class="logbtn" value="Back" onclick="page3()">
 </form>
 </div>
 
  <footer class="footer" style="margin-top: 180px;">
  	 <div class="container">
  	 	<div class="row">
  	 		<div class="footer-col">
  	 		<h4>company</h4>
  	 		<ul>
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