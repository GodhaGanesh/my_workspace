import React, { Component } from "react";
import Header from "./Header";
import "./App.css";
import CardDisplay from "./CardDisplay";
import "bootstrap/dist/css/bootstrap.min.css";

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      movies: [],
      currentLang: "all",
      currentPage: 1,
      totalPages: 1,
    };
  }

  componentDidMount() {
    this.fetchMovies();
  }

  fetchMovies = () => {
    let url = "";

    if (this.state.currentLang === "all") {
      url = `https://api.themoviedb.org/3/discover/movie?api_key=46bcc0e9de7bb9f3f94f9af249709ed6&sort_by=release_date.desc&page=${this.state.currentPage}`;
    } else {
      url = `https://api.themoviedb.org/3/discover/movie?api_key=46bcc0e9de7bb9f3f94f9af249709ed6&with_original_language=${this.state.currentLang}&sort_by=release_date.desc&page=${this.state.currentPage}`;
    }

    fetch(url)
      .then((res) => res.json())
      .then((data) => {
        this.setState({
          movies: data.results,
        });
      })
      .catch((err) => console.log(err));
  };

  handlePageChangeNext = () => {
    this.setState(
      (prevState) => ({
        currentPage: prevState.currentPage + 1,
      }),
      () => {
        this.fetchMovies();
      }
    );
  };
  handlePageChangePrev = () => {
    if (this.currentPage > 1) {
      this.setState(
        (prevState) => ({
          currentPage: prevState.currentPage - 1,
        }),
        () => {
          this.fetchMovies();
        }
      );
    }
  };

  onLanguageChange = (lang) => {
    this.setState(
      {
        currentLang: lang,
        currentPage: 1,
        movies: [],
      },
      () => {
        this.fetchMovies();
      }
    );
  };

  scrollToTop = () => {
    window.scrollTo({
      top: 0,
      behavior: "smooth",
    });
  };

  render() {
    return (
      <>
        <Header onLanguageChange={this.onLanguageChange} />
        <div
          className="left mt-4"
          style={{
            width: "100%",
            display: "flex",
            justifyContent: "space-between",
            padding: "50px 65px 0 65px",
          }}
        >
          <button
            className="btn btn-primary"
            style={{ margin: "10px 10px" }}
            onClick={this.handlePageChangePrev}
          >
            Prev Page
          </button>
          <button
            className="btn btn-primary"
            style={{ margin: "10px" }}
            onClick={this.handlePageChangeNext}
          >
            Next Page
          </button>
        </div>
        <CardDisplay movies={this.state.movies} />
        <button
          className="btn btn-primary"
          style={{
            position: "fixed",
            bottom: "20px",
            right: "20px",
            borderRadius: "50%",
            padding: "10px 20px",
            zIndex: 999,
          }}
          onClick={this.scrollToTop}
        >
          ↑
        </button>
      </>
    );
  }
}

export default App;
