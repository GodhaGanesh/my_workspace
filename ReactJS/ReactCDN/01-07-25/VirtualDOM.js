/*let h1 = React.createElement("h1", null, "Welcome to ReactJS");
let img = React.createElement("img", {
  src: "https://images-cdn.openxcell.com/wp-content/uploads/2024/07/25085005/reactjs-inner.svg",
  width: "260px",
  alt: "ReactLogo",
  title: "ReactLogo",
});
let p = React.createElement("p", null, "lorem ipsum dolor sit amet.");
let btn = React.createElement("button", null, "Enroll");

let part = React.createElement("div", { className: "container" }, [
  h1,
  img,
  p,
  btn,
]);

let root = ReactDOM.createRoot(document.getElementById("root"));

root.render(part);*/

// with jsx

let ele = (
  <div className="container">
    <h1>Welcome to ReactJS</h1>
    <hr />
    <img
      src="https://images-cdn.openxcell.com/wp-content/uploads/2024/07/25085005/reactjs-inner.svg"
      alt="logo"
    />
    <br></br>
    <button>Enroll</button>
  </div>
);

let root = ReactDOM.createRoot(document.getElementById("root"));
root.render([ele, ele]);
