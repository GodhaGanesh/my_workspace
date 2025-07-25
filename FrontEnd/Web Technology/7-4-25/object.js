// var userObject = {
//     userFname: "Godha Ganesh",
//     userLname: "Viswanadham",
//     userEmail: "godhaganeshviswanadham@gmail.com",
//     userPhno: "9123456789",
//     userAddress: "Hyderabad",
//     userAge: 19,
//     1: "kl Rahul",
//     fullname: function() {
//         return this.userFname + " " + this.userLname;
//     }
// }
// console.log(userObject);
// console.log(userObject.userFname);
// console.log(userObject.userLname);
// console.log(userObject.userAge);
// console.log(userObject[1]);
// console.log(userObject.fullname());

// var operation = {
//     add: function (a,b) {
//         return a + b;
//     },
//     sub: function (a,b) {
//         return a - b;
//     },
//     mul: function (a,b) {
//         return a * b;
//     },
//     div: function (a,b) {
//         return a / b;
//     },
//     mod: function (a,b) {
//         return a % b;
//     },
//     exp: function (a,b) {
//         return a ** b;
//     }
// }

// console.log(operation.add(10,20));
// console.log(operation.sub(30,20));
// console.log(operation.mul(30,20));
// console.log(operation.div(30,20));
// console.log(operation.exp(30,20));
// console.log(operation.mod(30,20));

// var obj = new Object();
// obj.fname = "Godha Ganesh";
// obj.lname = "Viswanadham";
// obj.age = 19;
// obj.fullname = function() {
//     return this.fname + " " + this.lname;
// }
// console.log(obj);
// console.log(obj.fullname());


function StudentDetails(fname, lname, age, grade, cls, email){
    this.fname = fname;
    this.lname = lname;
    this.age = age;
    this.grade = grade;
    this.cls = cls;
    this.email = email;
    this.fullname = function() {
        return this.fname + " " + this.lname;
    }
}
var raghu = new StudentDetails('Raghu', 'varan', '25', '8.9', '10th', 'raghuvaranvip@gmail.com');

console.log(raghu);
console.log(raghu.fullname());
console.log(raghu.age);

var jyothi = new StudentDetails( 'jyothirmayi', 'john', '19', '15', '113fdfddf@gmail.com');

console.log(jyothi);
console.log(jyothi.fullname());
console.log(jyothi.age);