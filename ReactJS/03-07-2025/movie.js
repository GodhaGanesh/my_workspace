let movies = [];
async function apiData() {
  for (let i = 1; i < 165; i++) {
    let data = await fetch(
      `https://api.themoviedb.org/3/discover/movie?api_key=46bcc0e9de7bb9f3f94f9af249709ed6&with_original_language=te&page=${i}&sort_by=release_date.desc`
    );
    let movie = await data.json();
    movies.push(...movie.results);
    console.log("loading....");
  }
  console.log(movies);
  movies.forEach((movie) => {
    let movieDiv = document.createElement("div");
    movieDiv.className = "movie";
    movieDiv.innerHTML = `
      <img src="https://image.tmdb.org/t/p/w500${movie.poster_path}" alt="${movie.title}" onError="this.onerror=null;this.src='path/to/default-image.jpg';">
      <div class="movie-info">
        <h3>${movie.title}</h3>
        <p>Release Date: ${movie.release_date}</p>
        <p>Rating: ${movie.vote_average}</p>
      </div>
    `;

    document.body.appendChild(movieDiv);
  });
}
apiData();
