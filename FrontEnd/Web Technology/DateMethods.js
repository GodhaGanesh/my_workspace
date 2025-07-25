// console.log(window.Date);
// console.log(Date());
// console.log(typeof Date());
// console.log(typeof new Date());


// var date1 = Date();
// console.log(date1);

// var date2 = new Date();
// console.log(date2)

// console.log(`Today Date Is :- ${date2.getDate()}/${date2.getMonth()+1}/${date2.getFullYear()}`);


var time = new Date();
console.log(time);
console.log(time.toLocaleString());
console.log(time.toLocaleDateString());
console.log(time.toLocaleTimeString());
console.log(time.getMonth() + 1);
console.log(time.getDate());
console.log(time.getFullYear());
console.log(time.getHours());
console.log(time.getMinutes());
console.log(time.getSeconds());
console.log(time.getMilliseconds());
console.log(time.getDay() + 1);

console.log(new Date(1947, 7, 15, 0, 0, 56, 234));

console.log(`Current Date Is :- ${time.getDate()}/${time.getMonth() + 1}/${time.getFullYear()}`);
console.log(`Current Time Is :- ${time.getHours()}:${time.getMinutes()}:${time.getSeconds()}`);
if (time.getHours() < 12) {
    console.log(`Good Morning`);
}
else if (time.getHours() < 18) {
    console.log(`Good Afternoon`);
}
else if (time.getHours() < 22) {
    console.log(`Good Evening`);
}
else {
    console.log(`Good Night`);
}

var dynamicrendering = new Date(2005,5,25,2);

console.log(dynamicrendering);
var hours = dynamicrendering.getHours()
console.log(hours);

if(hours>=0 && hours < 12){
    console.log(`Good Morning`);
}
else if(hours < 18){
    console.log(`Good Afternoon`);
}
else if(hours < 22){
    console.log(`Good Evening`);
}
else{
    console.log(`Good Night`);
}
