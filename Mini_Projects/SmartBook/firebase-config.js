const firebaseConfig = {
    apiKey: "AIzaSyDCyhcWR9h1vVYm5I_WXLpY0UPobUMWxZU",
    authDomain: "smartbookreader-4b3e9.firebaseapp.com",
    projectId: "smartbookreader-4b3e9",
    storageBucket: "smartbookreader-4b3e9.firebasestorage.app",
    messagingSenderId: "73697832594",
    appId: "1:73697832594:web:a1a6b21ed963ba0b48004b"
};

// Initialize Firebase
firebase.initializeApp(firebaseConfig);
const auth = firebase.auth();
const db = firebase.firestore();
