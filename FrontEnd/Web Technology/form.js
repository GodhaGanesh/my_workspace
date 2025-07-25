// var allForms = document.forms;

// for(var i = 0;i<3;i++){
//     allForms[0].elements[i].type = "radio";
//     allForms[0].elements[i].name = "gender";
// }

// allForms[1].elements[0].type = "Email";
// allForms[1].elements[0].placeholder = "Email Address";
// allForms[1].elements[1].type = "password";
// allForms[1].elements[1].placeholder = "Password";
// allForms[1].elements[2].type = "Submit";
// allForms[1].elements[2].value = "Log in";

var allAtag = document.anchors;

console.log(allAtag)

document.title = "Facebook";
allAtag[0].innerHTML = `Instagram`;
allAtag[1].innerHTML = 'Facebook';
allAtag[2].innerHTML = "Twitter";
allAtag[0].href = "https://www.instagram.com";
allAtag[1].href = "https://www.fb.com";
allAtag[2].href = "https://www.x.com";