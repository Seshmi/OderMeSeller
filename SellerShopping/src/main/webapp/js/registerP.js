function cla(){
    if (document.getElementById("password").value != document.getElementById("repass").value){
        alert("Password does not matched");
        return false;
    }
  }
  function page() {
  	location.replace("login.jsp");
}