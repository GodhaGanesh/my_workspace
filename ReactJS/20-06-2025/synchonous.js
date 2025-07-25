function displayMessage() {
    document.getElementById('search-bar').innerHTML = `<h1>Welcome to the Pizza Ordering System</h1>`;
    setTimeout(() => {
        document.getElementById('search-bar').innerHTML = `<h1>Ordering a Pizza</h1>`;
    }, 2000);

    setTimeout(() => {
        document.getElementById('search-bar').innerHTML = `<h1>Placing an order for a Pizza</h1>`;
    }, 4000);

    setTimeout(() => {
        document.getElementById('search-bar').innerHTML = `<h1>wait for it, it is cooking</h1>`;
    }, 6000);

    setTimeout(() => {
        document.getElementById('search-bar').innerHTML = `<h1>delivering pizza</h1>`;
    }, 8000);

    setTimeout(() => {
        document.getElementById('search-bar').innerHTML = `<h1>Enjoy your pizza</h1>`;
    }, 10000);
}

displayMessage();
setInterval(() => displayMessage(), 12000);