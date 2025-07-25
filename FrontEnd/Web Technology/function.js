// function jungle(){
//     console.log(`Lion is entering`)
//     console.log(`Tiger is entering`)
//     console.log(`Cheetah is entering`)
//     console.log(`Squarriel is entering`)
//     console.log(`Fox is entering`)
//     console.log(`Bear is entering`)
//     console.log(`Girafee is entering`)
//     console.log(`Zebra is entering`)
//     console.log(`Rhino is entering`)
// }

// jungle()
// jungle()
// jungle()
// jungle()

// function add(n1,n2) {
//     console.log(n1+n2);
// }
// function sub(n1,n2) {
//     console.log(n1-n2);
// }
// function mul(n1,n2) {
//     console.log(n1*n2);
// }
// function div(n1,n2) {
//     console.log(n1/n2);
// }
// function mod(n1,n2) {
//     console.log(n1%n2)
// }
// add(Math.floor((Math.random()*10)),(Math.floor(Math.random()*10)))
// sub(Math.floor((Math.random()*10)),(Math.floor(Math.random()*10)))
// mul(Math.floor((Math.random()*10)),(Math.floor(Math.random()*10)))
// div(Math.floor((Math.random()*10)),(Math.floor(Math.random()*10)))
// mod(Math.floor((Math.random()*10)),(Math.floor(Math.random()*10)))

// function add(n1,n2) {
//     return n1+n2;
// }

// var addition = add(3,4)

// console.log(addition);

// var p = prompt(`Enter principle amount : `)
// var t = prompt(`Enter Loan Duration : `)
// var r = prompt(`Enter rate of intrest : `)

// function loanAmount(p,t,r) {
//     console.log(`Loan Amount is : ₹ ${p}/-`)
//     console.log(`Loan Duration : ${t}years`);
//     console.log(`Rate of Intrest : ${r}%`)

//     var intAmount = (p*t*r)/100;

//     console.log(`Intrest Amount is : ₹${intAmount}/-`);
//     return intAmount+Number(p);  
// }

// var axisBank = loanAmount(p,t,r);

// console.log(`The total Amount You hava to pay : ${axisBank}`);
// console.log(`Monthly you Have to Pay : ${axisBank/(t*12)}`);

//WAPT Calculate the are of triangle,collect the values from user by using prompt

// var base = prompt("Enter the base of the triangle: ");
// var height = prompt("Enter the height of the triangle: ");

// function calculateAreaOfTriangle(base, height) {
//     return 0.5 * base * height;
// }

// var area = calculateAreaOfTriangle(base, height);

// console.log(`The area of the triangle is: ${area}`);


// var add = function () {
//     console.log(`sub`);
// }
// add()
// var sub = function (a, b) {
//     return a + b;
// }
// console.log(sub(3, 4));

// var op = () => {
//     console.log(45 + 55);
//     console.log(65 - 43);
// }

// op();

// var areaOfTriangle = (base, height) => console.log(0.5 * base * height)

// areaOfTriangle(3, 5)


// var highorder = function (clb){
//     console.log(`hii`)
//     clb()
// }
// var callback = function(){
//     console.log(`Ganesh`)
// }
// highorder(callback)

// var add=(a,b)=>{
//     return a+b;
// }
// var sub=(a,b)=>{
//     return a-b;
// }
// var mul=(a,b)=>{
//     return a*b;
// }
// var div=(a,b)=>{
//     return a/b;
// }
// var operation = (a,b,op) =>{
//     return op(a,b)
// }

// console.log(operation(1,2,add));

//create a function that repeats call back function for n number of times

// var n = 9;

// function repeatCallback(n, callback) {
//     for (var i = 0; i < n; i++) {
//         callback();
//     }
// }

// repeatCallback(n, () => {
//     console.log("Callback executed");
// });

//iife 

(function(){
    console.log(`hii`)
})();
(()=>console.log(`queue`))();
console.log()
console.log(`bye`);

var addition = ((n1,n2)=>{
    return n1+n2;
})(4,5);
console.log(addition)