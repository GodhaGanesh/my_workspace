// import React, { StrictMode } from "react";
// import { createRoot } from "react-dom/client";
// import DemoClass from "./DemoClass";

// let statement = "vashi is villan";
// createRoot(document.getElementById("root")).render(
//   <>
//     <DemoClass />
//     <h1>Hii, This is Chitti</h1>
//     <p>memory one giga byte</p>
//     <em>can you donate me sana</em>
//     <br />
//     <button
//       style={{
//         backgroundColor: "green",
//         padding: "10px 20px",
//         border: "none",
//         borderRadius: "10px",
//         color: "white",
//         cursor: "pointer",
//       }}
//       onClick={() => {
//         document.getElementById("message").innerHTML = "sana given !! Thanks";
//         document.getElementById("expression").src =
//           "https://media1.tenor.com/m/-6tCX00n5AMAAAAd/laughing-loudly-laughing.gif";
//         setTimeout(() => {
//           document.getElementById("expression").src =
//             "https://media1.tenor.com/m/Z3xS5S91arMAAAAC/rajini-heroines.gif";
//         }, 2000);
//         setTimeout(() => {
//           document.getElementById("message").innerHTML = "Vashi is villan";
//           document.getElementById("expression").src =
//             "https://media1.tenor.com/m/KbXyTm7I0WIAAAAC/rajni-robo.gif";
//         }, 5000);
//       }}
//     >
//       Give Sana
//     </button>
//     <button
//       style={{
//         backgroundColor: "red",
//         padding: "10px 20px",
//         border: "none",
//         borderRadius: "10px",
//         color: "white",
//         cursor: "pointer",
//         marginLeft: "10px",
//       }}
//       onClick={() => {
//         document.getElementById("message").innerHTML = "oridurmarguda!!";
//         document.getElementById("expression").src =
//           "https://media1.tenor.com/m/MvWb1FilxQoAAAAd/rajnikant-sivaji-the-boss.gif";
//         setTimeout(() => {
//           document.getElementById("message").innerHTML = "Vashi is villan";
//           document.getElementById("expression").src =
//             "https://media1.tenor.com/m/KbXyTm7I0WIAAAAC/rajni-robo.gif";
//         }, 15000);
//       }}
//     >
//       no
//     </button>
//     <br />
//     <img id="expression" alt="" style={{ width: "200px" }} />
//     <p id="message">{statement}</p>
//     <DemoClass />
//   </>
// );

import React from "react";
import { createRoot } from "react-dom/client";
import App from "./App";
import "./style.css";
createRoot(document.getElementById("root")).render(
  <>
    <App/>
  </>
);
