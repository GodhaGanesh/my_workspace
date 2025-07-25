let food = "Biriyani";
let promise = new Promise((resolve, reject) => {
    if (food === "Biriyani") {
        resolve("Thank You, Placing Your Order");
    }
    else {
        reject("Sorry, it is out of stock");
    }
})

promise.then(res => console.log(res));
promise.catch(err => console.log(err));