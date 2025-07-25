// let data = ["ganesh", 2005, 20, "ganesh@gmail.com", true, "hii", "hello", "king", 'M', 6.3];
// let wanted1 = data.filter((d,i)=>i%2==0);
// console.log(wanted1);

// let wanted2 = [];
// for(let i = 0; i < data.length; i++) {
//     if (i % 2 === 0) {
//       wanted2.push(data[i]);
//     }
// }

let users = [
  { id: 1, name: "Alice", password: "Alice@123" },
  { id: 2, name: "Bob", password: "Bob@456" },
  { id: 3, name: "Charlie", password: "Charlie@789" },
  { id: 4, name: "David", password: "David@101" },
  { id: 5, name: "Eve", password: "Eve@202" }
];

console.log(users[0].password);
console.log(users[1].password);
console.log(users[2].password);
console.log(users[3].password);
console.log(users[4].password);

users.map(user => console.log(user.password));