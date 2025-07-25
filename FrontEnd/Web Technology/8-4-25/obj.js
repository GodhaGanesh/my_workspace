var userObj = {
    userFname: "sai",
    userLname: "kumar",
    userEmail: "saikumar@gmail.com",
    userPhno: 8008326633
}
// console.log(Object.keys(userObj));
// console.log(Object.values(userObj));
// console.log(Object.entries(userObj));

console.log(userObj);
// Object.freeze(userObj);
Object.seal(userObj);
userObj.userFname = 'rambo';
delete userObj.userLname;
console.log(userObj)