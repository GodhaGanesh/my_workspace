import React, { Component } from 'react';
import Header from "./Header";
import Navbar from "./Navbar";
import Footer from "./Footbar";
import Component1 from "./Component1";
import Component2 from "./Component2";
import Component3 from "./Component3";

export default class App extends Component {
  render() {
    return (
      <>
        <Header />
        <Navbar />
        <div className="container">
          <div className="partition">
            <Component1 />
            <Component2 />
          </div>
          <Component3 />
        </div>
        <Footer />
      </>
    );
  }
}
