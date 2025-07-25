let data = await fetch("https://jsonplaceholder.typicode.com/users");
console.log(data);

let users = await data.json();
console.log(users);
