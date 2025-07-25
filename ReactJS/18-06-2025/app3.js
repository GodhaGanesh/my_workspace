let otp = '';
function generateOTP() {
    otp = '';
    for (let i = 0; i < 4; i++) {
        otp += Math.floor(Math.random() * 10);
    }
    console.log('Generated OTP: '+otp);
    document.getElementById('response').innerHTML = '';
}

function verifyOtp(){
    let userOtp = document.getElementById('otp').value;
    if (userOtp.length !== 4) {
        document.getElementById('response').innerHTML = 'Please enter a 4-digit OTP';
        document.getElementById('response').style.color = 'black';
        console.log('Please enter a 4-digit OTP');
        return;
    }
    if(userOtp === otp) {
        window.open('https://m.youtube.com', '_blank');
        console.log('OTP verified successfully!');
        otp = '';
    } else {
        document.getElementById('response').innerHTML = 'Invalid OTP. Please try again.';
        console.log('Invalid OTP. Please try again.');
        document.getElementById('response').style.color = 'red';
        document.getElementById('otp').value = '';
    }
}