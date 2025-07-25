document.getElementById('container1').innerHTML = `<h1>Good Morning</h1>
<p>have a nice day</p>`
document.getElementById('container2').innerText = `<h1>Good Morning</h1>
<p>have a nice day</p>`

document.getElementById('container3').innerHTML = `<table cellspacing="0" style="border:black 1px solid">
        <tr>
            <th colspan="2">User Information</th>
        </tr>
        <tr>
            <td>Name</td>
            <td id="name"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td id="email"></td>
        </tr>
        <tr>
            <td>Number</td>
            <td id="number"></td>
        </tr>
        <tr>
            <td>City</td>
            <td id="city"></td>
        </tr>
        <tr>
            <td>Pin</td>
            <td id="pin"></td>
        </tr>
        <tr>
            <td>building</td>
            <td id="building"></td>
        </tr>
    </table>`;

    
document.getElementById('name').innerHTML = prompt("Enter the name");
document.getElementById('email').innerHTML = prompt("Enter your E-mail");
document.getElementById('number').innerHTML = prompt("Enter your phno.");
document.getElementById('city').innerHTML = prompt("city Name ");
document.getElementById('pin').innerHTML = prompt("Enter the pincode");
document.getElementById('building').innerHTML = prompt("building name");