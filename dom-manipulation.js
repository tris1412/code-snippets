// dom-manipulation.js
// Demonstration of DOM manipulation in JavaScript

document.addEventListener("DOMContentLoaded", () => {
    const btn = document.createElement("button");
    btn.textContent = "Click Me";
    document.body.appendChild(btn);

    btn.addEventListener("click", () => {
        alert("Button clicked!");
    });
});
