import React, { Component } from "react";
import Header from "./Header";
import Navbar from "./Navbar";
import Hero from "./Hero";
import BrowseMenu from "./BrowseMenu";
import PromoCards from "./PromoCards";
import "./fonts.css";
import "./App.css";
export default class App extends Component {
  render() {
    return (
      <>
        <div className="fix">
          <Header />
          <Navbar />
        </div>
        <Hero />
        <BrowseMenu />
        <PromoCards />
      </>
    );
  }
}
