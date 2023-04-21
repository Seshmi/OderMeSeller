<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="seller.login.Userlog"%>
<%@page import="seller.login.Userdatadb"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/additems.css">
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/footer.css">
<meta charset="ISO-8859-1">
<title>Online Shopping Store</title>
</head>
<body class="bo">
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
<%
	Userlog user= new Userlog();
	String username=(String)session.getAttribute("username");
	Userdatadb udb = new Userdatadb();
	user=udb.Retrive(username);
%>
</header>
 <form action="<%= request.getContextPath() %>/additempage" method="post" enctype="multipart/form-data">
 <div class="wrapper" >
    <div class="title">
      Add Item Form
    </div>
    <div class="form">
    <div class="inputfield">
          <label>Shop Email</label>
          <input type="text" class="input"  name="shopemail" value="<% out.print(user.getemail()); %>" readonly>
       </div> 
       <div class="inputfield">
          <label>Item Name</label>
          <input type="text" class="input" name="itemname" required>
       </div>      
        <div class="inputfield">
          <label>Category</label>
          <div class="custom_select">
            <select name="itemcategory" required>
              <option value="">Select</option>
              <option value="Fashion">Fashion</option>
              <option value="Home & Lifestyle">Home & Lifestyle</option>
              <option value="Beauty">Beauty</option>
			  <option value="Electronic">Electronic</option>
			  <option value="Other">Other</option>
            </select>
          </div>
       </div> 
        <div class="inputfield">
          <label>Item Price</label>
          <input type="text" class="input"  name="itemprice" required>
       </div>  
        <div class="inputfield">
          <label>Quantity</label>
          <input type="text" class="input"  name="itemquantity" required>
       </div>
       <div class="inputfield">
          <label>Item Picture</label>
          <input type="file" class="input" name="pic">
       </div>
      <div class="inputfield terms">
          <label class="check">
            <input type="checkbox" required>
            <span class="checkmark"></span>
          </label>
          <p>Agreed to terms and conditions</p>
       </div> 
      <div class="inputfield">
        <input type="submit" value="Publish The Item" class="btn">
      </div>
    </div>
</div>
</form>

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