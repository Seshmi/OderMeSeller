<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/footer.css">
<meta charset="ISO-8859-1">
<title>Online Shopping Store </title>
</head>
<body>
<header>
    <nav>
		<label class="logo">OderMe</label>
		<ul>
		   <li><a class="active" href="Home.jsp">Home</a></li>
		   <li>
			  <a href="#">Category</a>
		   </li>
		   <li>
			  <a href="#">Deals
			  <i class="fas fa-caret-down"></i>
			  </a>
			  <ul>
				 <li><a href="#">Offers</a></li>
				 <li><a href="#">Promotion</a></li>
			  </ul>
		   </li>
		   <li><a href="#">Contact</a></li>
		   <li>
			<a href="#">Login
				<i class="fas fa-caret-down"></i>
			</a>
			<ul>
				<li><a href="#">User</a></li>
				<li><a href="login.jsp">Seller</a></li>
				<li><a href="#">Advertiser</a></li>
				<li><a href="#">Admin</a></li>
			</ul>
			</li>
			<li><a href="#">Feedback</a></li>
		</ul>
	 </nav>
</header>
<img src="pic/user.png" style="width:500px;margin-top:150px;margin-left:800px;">
 <div align="center" class="login-form">
  <form action="${pageContext.request.contextPath}/loginservlet" method="post" >
   <h1 class="ha1">Sign in</h1>
		
		<div class="txtb">
		 	<input type="text" placeholder="E-mail" id="user" name="user" required>
		</div>
		
		<div class="txtb">
			<input type="password" placeholder="Password" id="pass" name="pass" required>
		</div>
		
			<input type="submit" class="logbtn" value="Login" name="submit">
			<div class="bottom-text">
				<a href="forgetpass.jsp">Forgot the Password</a><br><br>
				Don't have account? <a href="register page.jsp">Sign up</a>
			</div>
 </form>
 </div>
 <footer class="footer" style="margin-top: 300px;">
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