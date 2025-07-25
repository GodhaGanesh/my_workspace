let arr = [10, 20, 30, 40, 50];
let [a1 = 100, , , a2, , a3 = 80] = arr;
console.log(a1, a2, a3);

// let obj = {
//     x: 10,
//     y: 20,
//     x: 100,
// };

// console.log(obj.x);

let obj = {
    x: 10,
    y: 20,
    z: 100,
};

let { x, y, z, sum = 30 } = obj
console.log(x);
console.log(y);
console.log(z);
console.log(sum)