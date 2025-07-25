// let api = fetch("https://api.github.com/users");
// console.log(api);

// let response = api.then((res) => res.json());
// let users = response.then(users =>{
//     console.log(users);
//     users.map(user => {
//         let p = document.createElement('p');
//         p.innerHTML = `<strong>${user.login}</strong>`;
//         document.body.appendChild(p);
//     })
// });

// let api2 = fetch("https://api.github.com/users");
// api2.then(res => res.json()).then(users => { users.map(user => document.body.innerHTML += `<p>${user.login}</p>`); })
// console.log(api2);

let api3 = fetch("https://fakestoreapi.com/products");
console.log(api3);
let count;
api3
  .then((res) => res.json())
  .then((products) => {
    count = products.filter((product) => {
      return product.rating.rate >= 4;
    });
    count.map((product) => {
      let productcard = document.createElement("div");
      productcard.style.border = "1px solid black";
      productcard.className = "product-card";
      productcard.innerHTML = `<img src="${product.image}" style="width: 194px; height: 194px;"><p>${product.title} - ${product.rating.rate}</p>`;
      document.getElementById("container").appendChild(productcard);
    });
  });
