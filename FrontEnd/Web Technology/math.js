// console.log(Math)
// console.log(Math.PI)
// console.log(Math.E)
// console.log(Math.max(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
// console.log(Math.min(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
// console.log(Math.random(1)); // It will give random number between 0 to 1
// console.log(Math.round(4.2));
// console.log(Math.round(4.5));
// console.log(Math.ceil(4.2));
// console.log(Math.ceil(4.5));
// console.log(Math.floor(4.2));
// console.log(Math.floor(4.5));
// console.log(Math.trunc(4.2));
// console.log(Math.trunc(4.5));
// console.log(Math.sqrt(225));
// console.log(Math.pow(2, 4));
// console.log(Math.abs(7));

// console.log(Math.random());

// function generateOTP() {
//     return Math.floor(1000 + Math.random() * 9000);
// }
// for(var i = 0; i < 5; i++){
//     console.log(generateOTP());
// }


const secretKey = "MySecretKey123"; // Keep this secret on backend ideally

function generateOTP(length = 6) {
  const digits = '0123456789';
  let otp = '';
  for (let i = 0; i < length; i++) {
    otp += digits[Math.floor(Math.random() * 10)];
  }
  return otp;
}

const encryptedOTP = CryptoJS.AES.encrypt(generateOTP(), secretKey).toString();
console.log("Encrypted OTP (unreadable):", encryptedOTP);

// To decrypt it later
const bytes = CryptoJS.AES.decrypt(encryptedOTP, secretKey);
const decryptedOTP = bytes.toString(CryptoJS.enc.Utf8);
console.log("Decrypted OTP (original):", decryptedOTP);
