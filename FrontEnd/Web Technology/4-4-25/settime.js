var character = document.getElementById("container");

function fun1() {
    character.style.transform = "translate(90vw,0)"
}
setTimeout(fun1, 1000);

function fun2() {
    character.style.transform = "translate(90vw,77vh)"
}
setTimeout(fun2, 2000);

function fun3() {
    character.style.transform = "translate(0vw,77vh)"
}
setTimeout(fun3, 3000);

function fun4() {
    character.style.transform = "translate(0vw,0vh)"
}
setTimeout(fun4, 4000);
fun5();

function fun5() {
    setInterval(() => {
        function fun1() {
            character.style.transform = "translate(90vw,0)"
        }
        setTimeout(fun1, 1000);
        
        function fun2() {
            character.style.transform = "translate(90vw,77vh)"
        }
        setTimeout(fun2, 2000);
        
        function fun3() {
            character.style.transform = "translate(0vw,77vh)"
        }
        setTimeout(fun3, 3000);
        
        function fun4() {
            character.style.transform = "translate(0vw,0vh)"
        }
        setTimeout(fun4, 4000);
    }, 4000);
    
}
