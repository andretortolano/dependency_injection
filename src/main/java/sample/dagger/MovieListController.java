package sample.dagger;

import java.util.List;

public class MovieListController {
	private MovieListScreen movieListScreen;
	private MovieListAPI movieListApi;
	
	public MovieListController() {
		this.movieListApi = new MovieListAPI();
	}
	
	public void start() {
		movieListApi.getMovieList(this);
	}
	
	public void onGetMovieListSuccess(List<Movie> movieList) {
		movieListScreen.showMovieList(movieList);
	}

	public void onMovieDetailClick(Movie movie) {
		movieListScreen.showMovieDetailScreen(movie);
	}

	public void setScreen(MovieListScreen movieListScreen) {
		this.movieListScreen = movieListScreen;
	}
}
