var image = document.images
console.log(image);

for (var i = 0; i < image.length; i++) {
    image[i].src = `./assets/${i}.jpg`
    image[i].style.width = "280px"
}

function bigimage(path){
    document.getElementById("bigimage").style.display = "flex";
    document.getElementById("image").innerHTML = `<img src="${path}" id="see">`;
    var bigImage = document.getElementById("see");
    bigImage.style.width = "60%"
    bigImage.style.border = "5px solid white"
    bigImage.style.boxShadow =`0px 0px 15px black`;
    bigImage.style.borderRadius = `10px`;
    bigImage.style.minWidth = `360px`;
}

function bigimageclose() {
    document.getElementById("bigimage").style.display = "none";
}