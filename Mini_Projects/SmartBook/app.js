let currentPage = 1;
let pdfDoc = null;
let userId = null;
let bookId = "default"; // For now

// Auth
auth.onAuthStateChanged(user => {
    if (user) {
        userId = user.uid;
        document.getElementById("auth-section").style.display = "none";
        document.getElementById("reader-section").style.display = "block";
        loadProgress();
    } else {
        document.getElementById("auth-section").style.display = "block";
        document.getElementById("reader-section").style.display = "none";
    }
});

document.getElementById('login-btn').addEventListener('click', (e) => {
    e.preventDefault();
    const email = document.getElementById('login-email').value;
    const password = document.getElementById('login-password').value;

    auth.signInWithEmailAndPassword(email, password)
        .then((userCredential) => {
        alert("Login Success!");
        })
        .catch((error) => {
        alert("Login Failed: " + error.message);
    });
});

document.getElementById('register-btn').addEventListener('click', (e) => {
    e.preventDefault();
    const email = document.getElementById('register-email').value;
    const password = document.getElementById('register-password').value;

    auth.createUserWithEmailAndPassword(email, password)
        .then((userCredential) => {
        alert("Registered Successfully!");
        })
        .catch((error) => {
        alert("Register Failed: " + error.message);
    });
});


function logout() {
    auth.signOut();
}

// Load PDF
pdfjsLib.GlobalWorkerOptions.workerSrc = "https://mozilla.github.io/pdf.js/build/pdf.worker.js";

document.getElementById("pdf-upload").addEventListener("change", function(e) {
    const file = e.target.files[0];
    if (file.type !== "application/pdf") return alert("Only PDF files allowed.");
    
    const reader = new FileReader();
    reader.onload = function() {
        const typedArray = new Uint8Array(this.result);
        pdfjsLib.getDocument(typedArray).promise.then(pdf => {
        pdfDoc = pdf;
        renderPage(currentPage);
        });
    };
    reader.readAsArrayBuffer(file);
});

function renderPage(num) {
    pdfDoc.getPage(num).then(page => {
        const canvas = document.getElementById("pdf-canvas");
        const ctx = canvas.getContext("2d");

        const viewport = page.getViewport({ scale: 1.5 });
        canvas.height = viewport.height;
        canvas.width = viewport.width;

        page.render({ canvasContext: ctx, viewport });

        saveProgress(num);
    });
}

function nextPage() {
    if (pdfDoc && currentPage < pdfDoc.numPages) {
        currentPage++;
        renderPage(currentPage);
    }
}

function prevPage() {
    if (pdfDoc && currentPage > 1) {
        currentPage--;
        renderPage(currentPage);
    }
}

// Sync last page
function saveProgress(page) {
    db.collection("users").doc(userId).collection("books").doc(bookId).set({
        lastPage: page
    });
}

function loadProgress() {
    db.collection("users").doc(userId).collection("books").doc(bookId).get().then(doc => {
        if (doc.exists) {
        currentPage = doc.data().lastPage || 1;
        }
    });
}

// Theme toggle
function toggleTheme() {
    document.body.classList.toggle("dark");
    localStorage.setItem("theme", document.body.classList.contains("dark") ? "dark" : "light");
}

window.onload = () => {
    if (localStorage.getItem("theme") === "dark") {
        document.body.classList.add("dark");
    }
};
