<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/register.css">
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/footer.css">
<script src="js/registerP.js"></script>
<title>Online Shopping Store </title>
</head>
<body>
<header>
    <nav>
		<label class="logo">OderMe</label>
		<ul>
		   <li><a class="active" href="Home.jsp">Home</a></li>
		   <li>
			  <a href="#">Category
			  <i class="fas fa-caret-down"></i>
			  </a>
			  <ul>
				 <li><a href="#">Fashion</a></li>
				 <li><a href="#">Home & Lifestyle</a></li>
				 <li><a href="#">Beauty</a></li>
				 <li><a href="#">Electronic</a></li>
				 <li><a href="#">More</a></li>
			  </ul>
		   </li>
		   <li>
			  <a href="#">Deals
			  <i class="fas fa-caret-down"></i>
			  </a>
			  <ul>
				 <li><a href="#">Offers</a></li>
				 <li><a href="#">Flash Sale</a></li>
				 <li><a href="#">Others</a></li>
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
				<li>
			</li>
			</ul>
			</li>
			<li><a href="#">Feedback</a></li>
		</ul>
	 </nav>
</header>
 <div>
  <form action="${pageContext.request.contextPath}/register" method="post" onsubmit="return cla()">
    
    <div class="wrapper">
    <div class="title">
      Seller Registration Form
    </div>
    <div class="form">
       <div class="inputfield">
          <label>Shop Name</label>
          <input type="text" class="input" name="name" required>
       </div>  
        <div class="inputfield">
          <label>Email</label>
          <input type="text" class="input" name="email" required>
       </div>  
       <div class="inputfield">
          <label>Password</label>
          <input type="password" class="input" name="password" id="password" pattern = ".{8,}" required>
       </div>  
      <div class="inputfield">
          <label>Confirm Password</label>
          <input type="password" class="input" name="re-password" id="repass" required>
       </div>   
      <div class="inputfield">
          <label>Phone Number</label>
          <input type="text" class="input" name="phone" required>
       </div>   
      <div class="inputfield">
        <input type="submit" value="Register" class="btn">
      </div>
      <div class="inputfield">
        <input type="Button" value="Back" class="btn" onclick="page()">
      </div>
    </div>
</div>
  </form>
 </div>
  <footer class="footer" style="margin-top: 250px;">
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