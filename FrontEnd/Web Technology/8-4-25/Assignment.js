var backgroundimages = [
    "https://images.unsplash.com/photo-1617380613434-7495e9b45dfb?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
    "https://images.unsplash.com/photo-1533130061792-64b345e4a833?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
    "https://images.unsplash.com/photo-1608942025318-1191eeade556?q=80&w=2055&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
    "https://images.unsplash.com/photo-1506832424678-e8232f4a068d?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDR8fGhpbWFsYXlhfGVufDB8fDB8fHww",
    "https://images.unsplash.com/photo-1544442069-97dded965a9f?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDd8fGhpbWFsYXlhfGVufDB8fDB8fHww",
    "https://images.pexels.com/photos/1531660/pexels-photo-1531660.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
    "https://images.pexels.com/photos/25245177/pexels-photo-25245177/free-photo-of-a-mountain-with-clouds-and-snow-on-it.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2"
]

var i = 0;
function getRandomBackgroundImage() {
    if (i>= backgroundimages.length) {
        i = 0;
    }
    document.body.style.backgroundImage = "url('" + backgroundimages[i] + "')";
    document.body.style.backgroundSize = "cover";
    document.body.style.backgroundPosition = "center center";
    document.body.style.backgroundRepeat = "no-repeat";
    document.body.style.backgroundAttachment = "fixed";
    document.body.style.transition = "background-image 1s ease-in-out";
    i++;
}

setInterval(getRandomBackgroundImage, 5000);

function previous(){
    i--;
    if (i < 0) {
        i = backgroundimages.length - 1;
    }
    document.body.style.backgroundImage = "url('" + backgroundimages[i] + "')";
    document.body.style.backgroundSize = "cover";
    document.body.style.backgroundPosition = "center center";
    document.body.style.backgroundRepeat = "no-repeat";
    document.body.style.backgroundAttachment = "fixed";
    document.body.style.transition = "background-image 1s ease-in-out";
}
function next(){
    i++;
    if (i >= backgroundimages.length) {
        i = 0;
    }
    document.body.style.backgroundImage = "url('" + backgroundimages[i] + "')";
    document.body.style.backgroundSize = "cover";
    document.body.style.backgroundPosition = "center center";
    document.body.style.backgroundRepeat = "no-repeat";
    document.body.style.backgroundAttachment = "fixed";
    document.body.style.transition = "background-image 1s ease-in-out";
}   