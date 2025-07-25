let currentDate = new Date();

function showDate() {
    document.getElementById("date").innerText = currentDate.toLocaleDateString();
}

function showTime() {
    document.getElementById("time").innerText = currentDate.toLocaleTimeString();
}