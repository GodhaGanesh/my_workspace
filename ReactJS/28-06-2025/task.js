document.getElementById("store").addEventListener("click",(e)=>{
  e.preventDefault();
  localStorage.clear();
  let userName = document.getElementById("user");
  let password = document.getElementById("pass");
  localStorage.setItem("username",userName.value);
  localStorage.setItem("password",password.value);
  userName.value = "";
  password.value = "";
})