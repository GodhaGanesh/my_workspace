var day = new Date().getDay();
document.body.style.backgroundImage = `url('../assets/${day}.jpg')`;
var i = 0;
function dateTime() {
    var date = new Date();
    
    var hh = date.getHours();
    var mm = date.getMinutes();
    var ss = date.getSeconds();
    var ms = date.getMilliseconds();
    var dd = date.getDate();
    var mo = date.getMonth();
    var yy = date.getFullYear();
    var dy = date.getDay();

    if (hh < 12) {
        document.getElementById("greet").innerHTML = "Morning";
    }
    else if (hh < 18) {
        document.getElementById("greet").innerHTML = "Afternoon";
    }
    else if (hh < 20) {
        document.getElementById("greet").innerHTML = "Evening";
    }
    else{
        document.getElementById("greet").innerHTML = "Night";
    }

    if (hh < 10) {
        hh = "0" + hh;
    }
    if (mm < 10) {
        mm = "0" + mm;
    }
    if (ss < 10) {
        ss = "0" + ss;
    }
    if (dd < 10) {
        dd = "0" + dd;
    }

    if (i%2==0) {
        var am_pm = "AM";

        if (hh > 12) {
            hh = hh - 12;
            am_pm = "PM";
        }
        if (hh == 0) {
            hh = 12;
            am_pm = "AM";
        }
        document.getElementById("time").innerHTML = `${hh}<span>:</span>${mm} <span id="ap">${am_pm}</span>`;
    }
    else {
        document.getElementById("time").innerHTML = `${hh}<span>:</span>${mm}`;
    }

    var months = ["January", "February", "March", "April", "May", "June","july","August", "September", "October", "November", "December"];
    var days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    var dy = days[dy];
    var mo = months[mo];

    document.getElementById("date").innerHTML = `${dd} <span>${mo}</span> ${yy}`;
    document.getElementById("day").innerHTML = dy;
    document.getElementById("sec").innerHTML = ss;
}

setInterval(dateTime, 1000);

function blink() {
    document.querySelector("span").style.visibility = (document.querySelector("span").style.visibility == "hidden" ? "" : "hidden");
}
setInterval(blink, 250);

function change() {
    i++;
}

