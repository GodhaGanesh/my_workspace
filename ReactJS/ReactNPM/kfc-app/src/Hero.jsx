import React, { Component } from 'react'

export default class Hero extends Component {
  render() {
    return (
      <>
        <div className="header-bottom">
          <h4>LET'S ORDER FOR DELIVERY, PICK UP, OR DINE-IN</h4>
          <button>Start Order</button>
        </div>
        <div className="hero-image">
          <img
            src="https://images.ctfassets.net/wtodlh47qxpt/7oPeoPgaADykhDQb4IpxjR/fc8611839c5f3765f5712aad43ee6803/Double_Down_banner_Size_2880x1260px.jpg?fm=webp"
            alt=""
          />
        </div>
      </>
    );
  }
}
