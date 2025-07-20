import React, { Component } from "react";

export default class Header extends Component {
  constructor(props) {
    super(props);
    this.state = {
      lang: "All",
    };
  }
  handleClick = (e, langName) => {
    e.preventDefault();
    this.setState({lang: langName.charAt(0).toUpperCase()+langName.slice(1).toLowerCase()})
    const langMap = {
      all: "all",
      telugu: "te",
      hindi: "hi",
      kannada: "kn",
      tamil: "ta",
      english: "en",
      malayalam: "ml",
    };
    const langCode = langMap[langName.toLowerCase()];
    if (this.props.onLanguageChange) {
      this.props.onLanguageChange(langCode);
    }
  };
  render() {
    return (
      <>
        <header>
          <nav className="navb">
            <div className="topleft">
              <div
                className="logo"
                style={{ display: "flex", alignItems: "center" }}
              >
                <h2>Nazaara</h2>
              </div>
              <div className="navigation">
                <span
                  style={{
                    fontSize: 27,
                    fontWeight: 50,
                    color: "#4d4d4d",
                    marginRight: 10,
                  }}
                >
                  |
                </span>
                <button>
                  <svg
                    className="fbl-icon QrPIxm _1a_Ljt _0rfOXL"
                    viewBox="0 0 24 24"
                    height="18px"
                    width="18px"
                    role="img"
                    aria-hidden="true"
                  >
                    <svg
                      width="24"
                      height="24"
                      fill="none"
                      xmlns="http://www.w3.org/2000/svg"
                    >
                      <path
                        d="M2.664 2.063 C 2.436 2.146,2.257 2.297,2.131 2.511 L 2.020 2.700 2.020 6.500 L 2.020 10.300 2.131 10.489 C 2.192 10.592,2.301 10.723,2.374 10.778 C 2.675 11.008,2.531 11.000,6.498 11.000 C 10.604 11.000,10.387 11.015,10.701 10.701 C 11.015 10.387,11.000 10.604,11.000 6.500 C 11.000 2.396,11.015 2.613,10.701 2.299 C 10.386 1.984,10.606 2.000,6.483 2.003 C 3.408 2.005,2.795 2.015,2.664 2.063 M13.664 2.063 C 13.436 2.146,13.257 2.297,13.131 2.511 L 13.020 2.700 13.020 6.500 L 13.020 10.300 13.131 10.489 C 13.192 10.592,13.301 10.723,13.374 10.778 C 13.675 11.008,13.531 11.000,17.498 11.000 C 21.604 11.000,21.387 11.015,21.701 10.701 C 22.015 10.387,22.000 10.604,22.000 6.500 C 22.000 2.396,22.015 2.613,21.701 2.299 C 21.386 1.984,21.606 2.000,17.483 2.003 C 14.408 2.005,13.795 2.015,13.664 2.063 M9.000 6.500 L 9.000 9.000 6.500 9.000 L 4.000 9.000 4.000 6.500 L 4.000 4.000 6.500 4.000 L 9.000 4.000 9.000 6.500 M20.000 6.500 L 20.000 9.000 17.500 9.000 L 15.000 9.000 15.000 6.500 L 15.000 4.000 17.500 4.000 L 20.000 4.000 20.000 6.500 M2.664 13.063 C 2.436 13.146,2.257 13.297,2.131 13.511 L 2.020 13.700 2.020 17.500 L 2.020 21.300 2.131 21.489 C 2.192 21.592,2.301 21.723,2.374 21.778 C 2.675 22.008,2.531 22.000,6.498 22.000 C 10.604 22.000,10.387 22.015,10.701 21.701 C 11.015 21.387,11.000 21.604,11.000 17.500 C 11.000 13.396,11.015 13.613,10.701 13.299 C 10.386 12.984,10.606 13.000,6.483 13.003 C 3.408 13.005,2.795 13.015,2.664 13.063 M17.240 13.035 C 16.941 13.133,16.694 13.350,16.572 13.620 C 16.508 13.762,16.499 13.933,16.488 15.150 L 16.475 16.520 15.116 16.520 C 13.625 16.520,13.618 16.521,13.341 16.765 C 12.904 17.148,12.897 17.822,13.325 18.228 C 13.605 18.494,13.637 18.499,15.128 18.512 L 16.475 18.525 16.488 19.872 C 16.499 21.067,16.508 21.238,16.572 21.380 C 16.732 21.736,17.127 21.999,17.500 21.999 C 17.873 21.999,18.268 21.736,18.428 21.380 C 18.492 21.238,18.501 21.067,18.512 19.872 L 18.525 18.525 19.872 18.512 C 21.363 18.499,21.395 18.494,21.675 18.228 C 22.103 17.822,22.096 17.148,21.659 16.765 C 21.382 16.521,21.375 16.520,19.884 16.520 L 18.525 16.520 18.512 15.150 C 18.501 13.933,18.492 13.762,18.428 13.620 C 18.337 13.417,18.145 13.216,17.943 13.112 C 17.771 13.024,17.399 12.983,17.240 13.035 M9.000 17.500 L 9.000 20.000 6.500 20.000 L 4.000 20.000 4.000 17.500 L 4.000 15.000 6.500 15.000 L 9.000 15.000 9.000 17.500 "
                        fill="currentColor"
                        stroke="none"
                        fillRule="evenodd"
                      ></path>
                    </svg>
                  </svg>
                  &nbsp;Subscriptions
                </button>
              </div>
            </div>
            <div className="user">
              <button className="rounded-btn">
                <svg
                  className="fbl-icon _30dE3d _1a_Ljt _0rfOXL"
                  viewBox="0 0 24 24"
                  height="24"
                  width="24"
                  role="img"
                  aria-hidden="true"
                >
                  <title>Search</title>
                  <svg
                    width="24"
                    height="24"
                    fill="none"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      d="M9.360 2.025 C 7.466 2.198,5.790 2.960,4.446 4.259 C 3.730 4.951,3.257 5.602,2.817 6.500 C 1.479 9.228,1.809 12.458,3.674 14.900 C 3.949 15.260,4.616 15.933,5.000 16.239 C 6.430 17.378,8.196 17.999,10.000 17.999 C 11.567 17.999,13.170 17.508,14.465 16.632 L 14.911 16.331 17.645 19.066 C 19.449 20.870,20.434 21.828,20.540 21.879 C 20.942 22.074,21.370 22.002,21.686 21.686 C 22.002 21.370,22.074 20.942,21.879 20.540 C 21.828 20.434,20.870 19.449,19.066 17.645 L 16.331 14.911 16.632 14.465 C 18.219 12.120,18.436 9.087,17.200 6.529 C 16.809 5.718,16.392 5.120,15.761 4.464 C 14.541 3.195,12.996 2.388,11.240 2.100 C 10.865 2.039,9.711 1.992,9.360 2.025 M11.041 4.097 C 12.371 4.333,13.638 5.046,14.506 6.045 C 15.229 6.879,15.707 7.879,15.909 8.980 C 15.999 9.468,15.999 10.532,15.909 11.020 C 15.805 11.587,15.653 12.064,15.423 12.545 C 14.584 14.296,13.102 15.462,11.174 15.887 C 10.603 16.013,9.397 16.013,8.826 15.887 C 6.341 15.339,4.548 13.496,4.090 11.020 C 4.000 10.531,4.000 9.469,4.090 8.980 C 4.394 7.335,5.309 5.928,6.660 5.025 C 7.725 4.313,8.873 3.981,10.140 4.019 C 10.448 4.029,10.853 4.063,11.041 4.097 "
                      fill="currentColor"
                      stroke="none"
                      fillRule="evenodd"
                    ></path>
                  </svg>
                </svg>
              </button>
              <div className="dropdown">
                <button
                  style={{ display: "flex", alignItems: "center" }}
                  id="lang"
                  className="dropbtn"
                >
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    width="16"
                    height="16"
                    fill="currentColor"
                    className="bi bi-translate"
                    viewBox="0 0 16 16"
                  >
                    <path d="M4.545 6.714 4.11 8H3l1.862-5h1.284L8 8H6.833l-.435-1.286zm1.634-.736L5.5 3.956h-.049l-.679 2.022z" />
                    <path d="M0 2a2 2 0 0 1 2-2h7a2 2 0 0 1 2 2v3h3a2 2 0 0 1 2 2v7a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2v-3H2a2 2 0 0 1-2-2zm2-1a1 1 0 0 0-1 1v7a1 1 0 0 0 1 1h7a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1zm7.138 9.995q.289.451.63.846c-.748.575-1.673 1.001-2.768 1.292.178.217.451.635.555.867 1.125-.359 2.08-.844 2.886-1.494.777.665 1.739 1.165 2.93 1.472.133-.254.414-.673.629-.89-1.125-.253-2.057-.694-2.82-1.284.681-.747 1.222-1.651 1.621-2.757H14V8h-3v1.047h.765c-.318.844-.74 1.546-1.272 2.13a6 6 0 0 1-.415-.492 2 2 0 0 1-.94.31" />
                  </svg>{" "}
                  &nbsp; {this.state.lang} &nbsp;
                  <svg
                    className="fbl-icon _30dE3d _1a_Ljt Sfvq+f"
                    viewBox="0 0 24 24"
                    height="24"
                    width="24"
                    role="img"
                    aria-hidden="true"
                  >
                    <title>Caret Down</title>
                    <svg
                      width="24"
                      height="24"
                      fill="none"
                      xmlns="http://www.w3.org/2000/svg"
                    >
                      <path
                        d="M6.643 9.069 C 6.113 9.256,5.857 9.918,6.113 10.444 C 6.174 10.570,6.942 11.363,8.829 13.245 C 11.219 15.629,11.478 15.876,11.657 15.935 C 11.906 16.017,12.094 16.017,12.343 15.935 C 12.522 15.876,12.781 15.629,15.171 13.245 C 18.046 10.377,18.001 10.429,17.999 9.982 C 17.998 9.669,17.903 9.462,17.661 9.249 C 17.449 9.062,17.278 9.000,16.980 9.001 C 16.582 9.002,16.576 9.008,14.210 11.371 L 12.000 13.579 9.770 11.354 C 7.753 9.343,7.521 9.124,7.343 9.065 C 7.101 8.985,6.876 8.986,6.643 9.069 "
                        fill="currentColor"
                        stroke="none"
                        fillRule="evenodd"
                      ></path>
                    </svg>
                  </svg>
                </button>
                <div className="dropdown-content">
                  <a
                    href="#"
                    onClick={(e) => this.handleClick(e, "all")}
                    className="langChange dropdown-item"
                    style={{
                      borderTopLeftRadius: "10px",
                      borderTopRightRadius: "10px",
                    }}
                  >
                    All
                  </a>
                  <a
                    href="#"
                    onClick={(e) => this.handleClick(e, "telugu")}
                    className="langChange dropdown-item"
                  >
                    Telugu
                  </a>
                  <a
                    href="#"
                    onClick={(e) => this.handleClick(e, "hindi")}
                    className="langChange dropdown-item"
                  >
                    Hindi
                  </a>
                  <a
                    href="#"
                    onClick={(e) => this.handleClick(e, "kannada")}
                    className="langChange dropdown-item"
                  >
                    Kannada
                  </a>
                  <a
                    href="#"
                    onClick={(e) => this.handleClick(e, "tamil")}
                    className="langChange dropdown-item"
                  >
                    Tamil
                  </a>
                  <a
                    href="#"
                    onClick={(e) => this.handleClick(e, "english")}
                    className="langChange dropdown-item"
                  >
                    English
                  </a>
                  <a
                    href="#"
                    onClick={(e) => this.handleClick(e, "malayalam")}
                    className="langChange dropdown-item"
                    style={{
                      borderBottomLeftRadius: "10px",
                      borderBottomRightRadius: "10px",
                    }}
                  >
                    Malayalam
                  </a>
                </div>
              </div>
              <button className="rounded-btn">
                <svg
                  className="fbl-icon QrPIxm _1a_Ljt _0rfOXL"
                  viewBox="0 0 24 24"
                  height="24"
                  width="24"
                  role="img"
                  aria-hidden="true"
                >
                  <title>Categories Remaster</title>
                  <svg
                    width="24"
                    height="24"
                    fill="none"
                    xmlns="http://www.w3.org/2000/svg"
                  >
                    <path
                      d="M4.580 3.047 C 3.859 3.185,3.199 3.848,3.044 4.592 C 2.905 5.257,3.105 5.912,3.596 6.404 C 4.393 7.200,5.607 7.200,6.404 6.404 C 7.200 5.607,7.200 4.393,6.404 3.596 C 5.913 3.106,5.277 2.914,4.580 3.047 M11.580 3.047 C 10.859 3.185,10.199 3.848,10.044 4.592 C 9.789 5.816,10.751 7.000,12.000 7.000 C 13.080 7.000,14.000 6.080,14.000 5.000 C 14.000 4.477,13.790 3.983,13.404 3.596 C 12.913 3.106,12.277 2.914,11.580 3.047 M18.580 3.047 C 17.859 3.185,17.199 3.848,17.044 4.592 C 16.789 5.816,17.751 7.000,19.000 7.000 C 19.920 7.000,20.768 6.310,20.956 5.408 C 21.095 4.743,20.895 4.088,20.404 3.596 C 19.913 3.106,19.277 2.914,18.580 3.047 M4.580 10.047 C 4.236 10.113,3.883 10.310,3.596 10.596 C 2.800 11.393,2.800 12.607,3.596 13.404 C 4.393 14.200,5.607 14.200,6.404 13.404 C 7.200 12.607,7.200 11.393,6.404 10.596 C 5.913 10.106,5.277 9.914,4.580 10.047 M11.580 10.047 C 10.707 10.214,10.000 11.087,10.000 12.000 C 10.000 12.920,10.690 13.768,11.592 13.956 C 12.816 14.211,14.000 13.249,14.000 12.000 C 14.000 11.477,13.790 10.983,13.404 10.596 C 12.913 10.106,12.277 9.914,11.580 10.047 M18.580 10.047 C 17.707 10.214,17.000 11.087,17.000 12.000 C 17.000 12.920,17.690 13.768,18.592 13.956 C 19.816 14.211,21.000 13.249,21.000 12.000 C 21.000 11.477,20.790 10.983,20.404 10.596 C 19.913 10.106,19.277 9.914,18.580 10.047 M4.580 17.047 C 3.859 17.185,3.199 17.848,3.044 18.592 C 2.789 19.816,3.751 21.000,5.000 21.000 C 5.920 21.000,6.768 20.310,6.956 19.408 C 7.095 18.743,6.895 18.088,6.404 17.596 C 5.913 17.106,5.277 16.914,4.580 17.047 M11.580 17.047 C 10.859 17.185,10.199 17.848,10.044 18.592 C 9.789 19.816,10.751 21.000,12.000 21.000 C 13.080 21.000,14.000 20.080,14.000 19.000 C 14.000 18.477,13.790 17.983,13.404 17.596 C 12.913 17.106,12.277 16.914,11.580 17.047 M18.580 17.047 C 17.859 17.185,17.199 17.848,17.044 18.592 C 16.789 19.816,17.751 21.000,19.000 21.000 C 20.080 21.000,21.000 20.080,21.000 19.000 C 21.000 18.477,20.790 17.983,20.404 17.596 C 19.913 17.106,19.277 16.914,18.580 17.047 "
                      fill="currentColor"
                      stroke="none"
                      fillRule="evenodd"
                    ></path>
                  </svg>
                </svg>
              </button>
              <button id="user" className="rounded" style={{ padding: 4 }}>
                <img
                  src="data:image/png;base64,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"
                  alt=""
                  className="rounded"
                />
              </button>
              <button
                style={{
                  backgroundColor: "#157bcf",
                  marginLeft: 13,
                  letterSpacing: ".035em",
                }}
                id="jp"
              >
                About Us
              </button>
            </div>
          </nav>
        </header>
      </>
    );
  }
}
