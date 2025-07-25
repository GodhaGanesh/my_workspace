var waterIntake = 0;
var studyTime = 0;
var workouts = 0;
var currentDate = new Date();
document.getElementById("date").innerText = `${currentDate.getDate()}/${currentDate.getMonth() + 1}/${currentDate.getFullYear()}`;
document.getElementById("time").innerText = `${currentDate.getHours()}:${currentDate.getMinutes()}`;
function drinkWater() {
    waterIntake += 1;
    document.getElementById("water").innerText = waterIntake;
}

function study() {
    studyTime += 15;
    document.getElementById("study").innerText = studyTime;
}

function workout() {
    workouts += 1;
    document.getElementById("workout").innerText = workouts;
}

function reset() {
    waterIntake = 0;
    studyTime = 0;
    workouts = 0;
    document.getElementById("water").innerText = waterIntake;
    document.getElementById("study").innerText = studyTime;
    document.getElementById("workout").innerText = workouts;
}
function tooglemoe() {
    document.getElementById
}