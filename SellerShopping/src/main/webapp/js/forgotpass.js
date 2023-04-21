function pa(){
    if (document.getElementById("pass").value != document.getElementById("repass").value){
        alert("Password does not matched");
        return false;
    }
  }
function page3() {
  location.replace("profile.jsp")
}