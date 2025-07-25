setInterval(()=>{
    let currentDate = new Date();
    let hh = currentDate.getHours();
    let mm = currentDate.getMinutes();
    let ss = currentDate.getSeconds();

    hh = hh < 10 ? "0" + hh : hh;
    mm = mm < 10 ? "0" + mm : mm;
    ss = ss < 10 ? "0" + ss : ss;

    document.getElementById("time").innerHTML = `${hh}:${mm}:${ss}`;
}, 1000);

document.getElementById("time").style.color = 'crimson';
