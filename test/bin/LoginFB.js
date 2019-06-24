 function checkLogin(){
    var username= document.getElementById("username");
    var password= document.getElementById("password");
    if(username=="admin" && password=="12345"){
        alert("Login successfull! Welcome admin");
    }
    else{
    alert("Login failed!!!")
	}
}