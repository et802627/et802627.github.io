function insertRule1() {    
    window.alert("Colour Pallet 1");

    let body = document.querySelector("body");
    let head1 = document.querySelector("h1");
    let content = document.querySelector("p");

    body.style.backgroundColor = "#9F0102";
    head1.style.color = "#D7AA2E";
    head1.style.backgroundColor = "#9F0102";
    content.style.color = "#F3C43E";
    content.style.backgroundColor = "#9F0102";
}

function insertRule2() {
    window.alert("Colour Pallet 2");

    let body = document.querySelector("body");
    let head1 = document.querySelector("h1");
    let content = document.querySelector("p");

    body.style.backgroundColor = "#0B488F";
    head1.style.color = "#E92515";
    head1.style.backgroundColor = "#0B488F";
    content.style.color = "#00ffff";
    content.style.backgroundColor = "#0B488F";
}

function insertRule3() {    
    window.alert("Colour Pallet 3");

    let body = document.querySelector("body");
    let head1 = document.querySelector("h1");
    let content = document.querySelector("p");

    body.style.backgroundColor = "#69ffb9";
    head1.style.color = "#9386e6";
    head1.style.backgroundColor = "#69ffb9";
    content.style.color = "#f298f4";
    content.style.backgroundColor = "#69ffb9";
}

function textInput() {
    let text = document.querySelector("textarea");

    text.style.backgroundColor = "green";

    if (text != null) {
        window.alert("Input entered!");
    }
}

const textBox = document.querySelector("textarea");

textBox.addEventListener("input", textInput);

const clickedLink = document.querySelectorAll("a");

clickedLink.onclick = window.alert("Visiting another page!");

let colourButton1 = document.querySelector("#colourpallet1");
let colourButton2 = document.querySelector("#colourpallet2");
let colourButton3 = document.querySelector("#colourpallet3");

colourButton1.addEventListener("click", insertRule1);
colourButton2.addEventListener("click", insertRule2);
colourButton3.addEventListener("click", insertRule3);