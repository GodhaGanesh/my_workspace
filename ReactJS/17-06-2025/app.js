let imgSrcs = [
    {
        img: "https://cdn.pixabay.com/photo/2025/05/22/20/52/barn-9616520_1280.jpg",
        alt: "img1",
    },
    {
        img: "https://cdn.pixabay.com/photo/2025/06/05/12/25/turtle-9642956_1280.jpg",
        alt: "img2",
    },
    {
        img: "https://cdn.pixabay.com/photo/2024/01/25/12/30/mountain-8531778_1280.jpg",
        alt: "img3",
    },
    {
        img: "https://cdn.pixabay.com/photo/2025/05/22/20/52/barn-9616520_1280.jpg",
        alt: "img4",
    },
    {
        img: "https://cdn.pixabay.com/photo/2024/01/25/12/30/mountain-8531778_1280.jpg",
        alt: "img5",
    }
]

allImages = document.images;

imgSrcs = imgSrcs.map((image, index) => {
    allImages[index].src = image.img;
    allImages[index].alt = image.alt;
    allImages[index].style.width = "49.8%"
});