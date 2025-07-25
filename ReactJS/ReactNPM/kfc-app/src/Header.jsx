import React, { Component } from "react";

export default class Header extends Component {
  render() {
    return (
      <>
        <header>
          <img
            src="https://online.kfc.co.in/static/media/Search_Pin.e88a4d93.svg"
            alt="KFC Logo"
          />
          <p>Allow location access for local store menu and promos</p>
          <button>Set Location</button>
        </header>
      </>
    );
  }
}
