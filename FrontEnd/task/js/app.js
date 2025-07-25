// Global array to store user details
let users = [];

function addUser() {
    var username = document.getElementById("username").value.trim();
    var age = document.getElementById("age").value.trim();
    var email = document.getElementById("email").value.trim();

    // Validate inputs
    if (!username) {
        alert("Please enter a valid username.");
        return;
    }
    if (!age || isNaN(age) || age <= 0) {
        alert("Please enter a valid age.");
        return;
    }
    var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
        alert("Please enter a valid email address.");
        return;
    }

    var duplicate = false;
    for (var i = 0; i < users.length; i++) {
        if (users[i].username === username || users[i].email === email) {
            duplicate = true;
            break;
        }
    }
    if (duplicate) {
        alert("User with this username or email already exists.");
        return;
    }
    
    const user = { username, age, email };
    users.push(user);

    var card = document.createElement("div");
    card.className = 'userCard';

    card.innerHTML = `<div class="profilePic"></div>
        <h2>${username}</h2>
        <h4>Age : ${age}</h4>
        <h4>Email : ${email}</h4>
        <button onclick="removeUser(this)" id="delete">Remove</button>`;
    document.getElementById("user-display").appendChild(card);
}
function removeAllUsers() {
    document.getElementById("user-display").innerHTML = "";
    users = [];
    clearForm();
}

function clearForm() {
    document.getElementById("username").value = "";
    document.getElementById("age").value = "";
    document.getElementById("email").value = "";
    document.getElementById("username").focus();
}

function removeUser(btn) {
    var card = btn.parentElement;
    var username = card.querySelector('h2').textContent;
    for (var i = 0; i < users.length; i++) {
        if (users[i].username === username) {
            users.splice(i, 1);
            break;
        }
    }
    card.remove();
}

    const input = document.getElementById("profile-pic");
    const responseDiv = document.getElementById("response");

    input.addEventListener("change", function (event) {
    const file = event.target.files[0];
    if (!file) {
        responseDiv.textContent = "No file selected.";
        return;
    }

    if (file.type.startsWith("image/")) {
        responseDiv.textContent = "✅ It's a valid image!";
    } else {
        responseDiv.textContent = "❌ This is not an image file.";
    }
});
