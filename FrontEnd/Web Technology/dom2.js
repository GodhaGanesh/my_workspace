document.getElementById('con').innerHTML = `<h1>I like <p id="color"></p> color <p id="car"></p> car</h1>`;
document.getElementById("color").innerHTML = prompt('Favourite color');
document.getElementById("car").innerHTML = prompt('Favourite car');
document.getElementById("color").style.color = color;
document.getElementById("car").style.color = color;
