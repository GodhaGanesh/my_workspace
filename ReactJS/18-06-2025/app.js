let i = 0;

function bulbOn() {
    document.getElementById("bulb").src = "https://www.w3schools.com/js/pic_bulbon.gif";
}
function bulbOff() {
    document.getElementById("bulb").src = "https://www.w3schools.com/js/pic_bulboff.gif";
}

function toggleBulb() {
    if (i%2 == 0) {
        bulbOn();
    } else {
        bulbOff();
    }
    i++;
}