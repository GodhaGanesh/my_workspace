import React from "react";

class CardDisplay extends React.Component {
  render() {
    return (
      <div className="display">
        {this.props.movies.map((movie) => (
            <div className="movie">
              <img
                src={`https://image.tmdb.org/t/p/w500${movie.poster_path}`}
                alt={movie.title}
                onError={(e) => {
                  e.target.onerror = null;
                  e.target.src = "/notAvail.jpg";
                }}
              />
              <div className="movie-info">
                <h5 className="card-title">{movie.title}</h5>
                <p>{movie.release_date}</p>
              </div>
            </div>
        ))}
      </div>
    );
  }
}

export default CardDisplay;
