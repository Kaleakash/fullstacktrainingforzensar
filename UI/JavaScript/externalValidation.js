function validate() {
    var user = document.getElementById("user").value;
    var pass = document.getElementById("pass").value;
    if(user.length==0){
      document.getElementById("e1").innerHTML="User Name is required"
      document.getElementById("e2").innerHTML=""
        return false;
    }else if(pass.length==0){
        document.getElementById("e2").innerHTML="Password is required"
        document.getElementById("e1").innerHTML=""
        return false;
    }
    else {
        return true;
    }
  }

  function validateUser(){
    var user = document.getElementById("user").value;
    if(user.length==0){
        document.getElementById("e1").innerHTML="User Name is required message using key update event";
        document.getElementById("e2").innerHTML=""
    }
  }