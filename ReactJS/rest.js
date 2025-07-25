// let arr = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100];
// let [c1, , ...c2] = arr;
// console.log(c1); // 10
// console.log(c2); // [30, 40, 50, 60, 70, 80, 90, 100]
// let obj = {
//     a: 10,
//     b: 20,
//     c: 30,
//     x: 40,
//     y: 50,
//     z: 60,
// };

// let {c, b, ...rest} = obj;
// console.log(c); // 30
// console.log(b); // 20
// console.log(rest); // { a: 10, x: 40, y: 50, z: 60 }

// add(10,25,30,45,50,65,70,80,90,100);
// function add(...series) {
//     console.log(series);
//     let sum = series.filter((num) => num % 2 != 0)
//     console.log(sum);
// }


// groupWords("apple", "banana", "cherry", "date");
// function groupWords(w1,...rest) {
//     let obj = {
//         first: w1,
//         rest: rest,
//     };
//     console.log(obj);
// }

// let arr1 = [10, 20, 30, 40, 50];
// let arr2 = [60, 70, 80, 90, 100];
// let arr3 = [...arr1, ...arr2];
// console.log(arr3); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

// let obj1 = {
//     x: 40,
//     y: 50,
// };
// let obj2 = {
//     a: 10,
//     b: 20,
// }
// let obj3 = {...obj1, ...obj2};
// console.log(obj3); // { x: 40, y: 50, a: 10, b: 20 }

// let str = "lydia";
// let arr = [...str];
// console.log(arr); // ['l', 'y', 'd', 'i', 'a']




let obj = [{
    product: "petrol",
    id: 1,
    price: 100,
},
{
    product: "diesel",
    id: 2,
    price: 80,
},
{
    product: "gas",
    id: 3,
    price: 60, 
},
{
    product: "electricity",
    id: 4,
    price: 120,
}
];

obj = obj.map((x) => {
    return {
        ...x,
        price: x.price+10,
    };
})

console.log(obj);