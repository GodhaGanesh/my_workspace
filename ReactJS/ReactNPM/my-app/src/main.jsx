import React from "react";
import ReactDOM from "react-dom/client";
import fruits from "./data";

// let h1 = React.createElement("h1", null, "Welcome, to ReactJS without JSX");
// ReactDOM.createRoot(document.getElementById("root")).render(h1);

// console.table(React);
// let a = 404;
// let ele = <h1>Welcome, to ReactJS with JSX {a} {a - 4}</h1>;
// ReactDOM.createRoot(document.getElementById("root")).render(ele);

let list = (
  <ol>
    {fruits.map((res) => (
      <li>{res}</li>
    ))}
  </ol>
);

ReactDOM.createRoot(document.getElementById("root")).render(list);
