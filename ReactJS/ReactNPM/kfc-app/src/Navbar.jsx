import React, { Component } from 'react'

export default class Navbar extends Component {
  render() {
    return (
      <>
        <nav>
          <div className="left-nav">
            <img
              src="https://online.kfc.co.in/static/media/kfcLogo.492728c6.svg"
              alt="KFC Logo"
              style={{width: '72px'}}
            />
            <div className="menu-link-name">
              <a href="">Menu</a>
              <a href="">Deals</a>
            </div>
          </div>
          <div className="right-nav">
            <div className="sign-in-container">
              <img
                src="https://images.ctfassets.net/wtodlh47qxpt/6bJdGLRkksNvWP4LI9ZiFF/cb89d6393492fd093e0f99980abfa39e/Account_Icon.svg?h=36&w=36&fm=webp&fit=fill"
                alt=""
              />
              <a href="">Sign In</a>
            </div>
            <button>0</button>
            <hr />
          </div>
        </nav>
      </>
    );
  }
}
