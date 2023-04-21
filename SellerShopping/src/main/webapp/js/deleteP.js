function page3() {
  location.replace("profile.jsp")
}
function page1(){
	if(confirm("Are You Sure Delete This Account")){
		if(confirm==yes){
			location.replace("profile.jsp")
		}
		else{
			location.replace("delete.jsp")
		}
	}
  }