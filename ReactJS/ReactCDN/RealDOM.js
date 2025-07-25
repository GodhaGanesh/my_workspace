let root = document.getElementById("root");
let h1 = document.createElement("h1");
let p = document.createElement("p")
let btn = document.createElement("button")

h1.innerHTML = "Welcom to JSpiders !!";
p.innerHTML = "everything is possible here !!";
btn.innerHTML = "Register Now";
btn.className = "btn btn-reg";

root.appendChild(h1);
root.appendChild(p);
root.appendChild(btn);