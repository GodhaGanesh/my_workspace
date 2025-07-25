let allForms = document.forms;

// let placeholders = ["username", "password", "mobileno"];

// placeholders.map((placeholders, index) => {
//     allForms[0][index].placeholder = placeholders;
// })

let placeholders = [
    {
        place: "username",
    },
    {
        place: "password",
    },
    {
        place: "mobileno",
    }
];

placeholders.map((placeholder, index)=> {
    allForms[0][index].placeholder = placeholder.place;
})

function home(){
    open("./index.html");
}