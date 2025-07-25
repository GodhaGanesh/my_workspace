// var arr = [45, 55, 65, 75, 85, 95, 105, 125, 35, 25, 15, 5]
// var arr1 = arr.fill("hii", 1, 5)
// console.log(arr1);

// var value = arr.every((num) => {
//     return num % 5 == 0;
// })
// console.log(value);

// var Solution = arr.some((num) => {
//     return num % 2 == 0;
// })

// console.log(Solution);

// var value = arr.find((num) => {
//     return num % 2 == 0 || num % 5 == 0;
// })

// console.log(value)

// var value = arr.findIndex((num) => {
//     return num % 2 == 0|| num % 5 == 0;
// })

// console.log(value)

var arr = [45, 55, 65, 75, 85, 95, 105, 125, 35, 25, 15, 5]

var arr1 = arr.sort((a,b)=>{return a-b})
console.log(arr1);

arr1 = arr.sort((a,b)=>{return b-a})
console.log(arr1)

var arr = ["apple"]