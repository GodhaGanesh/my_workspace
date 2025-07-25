var i = 0;
var j = 0;
function passvis(){
    if(i%2==0){
        document.querySelector("#pass").type = "text";
        document.querySelector("i").className = "bi bi-eye-slash";
        i++;
    }
    else{
        document.querySelector("#pass").type = "password";
        document.querySelector("i").className = "bi bi-eye";
        i++;
    }
}
function toggleMode() {
    var body = document.body;
    var mode =  document.getElementById("check").value;
    if(mode=='on'){
        if (j%2==0) {
            body.style.backgroundImage = `url("https://images.pexels.com/photos/355465/pexels-photo-355465.jpeg?cs=srgb&dl=pexels-pixabay-355465.jpg&fm=jpg")`
            document.getElementById("salute").style.color = "white";
            document.getElementById("Good").style.color = "white";
            j++;
        }
        else{
            body.style.backgroundImage = `url("https://images.pexels.com/photos/1420440/pexels-photo-1420440.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2")`
            document.getElementById("salute").style.color = "black";
            document.getElementById("Good").style.color = "black";
            j++;
        }
    }
    
}

var time = new Date();
var hour = time.getHours()
if (hour>=4&&hour<12) {
    document.getElementById("salute").innerHTML = "Morning";
}
if (hour>=12&&hour<17) {
    document.getElementById("salute").innerHTML = "Afternoon";
}
if (hour>=17&&hour<20) {
    document.getElementById("salute").innerHTML = "Evening";
    toggleMode();
    document.getElementById("check").checked = true;
}
if (hour>=20||hour<4) {
    document.getElementById("salute").innerHTML = "Night";
    toggleMode();
    document.getElementById("check").checked = true;
}

function light() {
    document.body.style.backgroundImage = `url("https://images.pexels.com/photos/1420440/pexels-photo-1420440.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2")`
    document.getElementById("salute").style.color = "black";
    document.getElementById("Good").style.color = "black";
    document.getElementById("check").checked = false;
}

function dark() {
    document.body.style.backgroundImage = `url("https://images.pexels.com/photos/355465/pexels-photo-355465.jpeg?cs=srgb&dl=pexels-pixabay-355465.jpg&fm=jpg")`
    document.getElementById("salute").style.color = "white";
    document.getElementById("Good").style.color = "white";
    document.getElementById("check").checked = true;
}