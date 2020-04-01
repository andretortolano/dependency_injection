package sample.dagger;

import java.util.List;

public class MovieListScreen extends Screen {
	
	private MovieListController controller;
	
	private List<Movie> loadedMovies = null;
	
	public MovieListScreen() {
		System.out.println("MovieListScreen -> Constructor...");
		controller = new MovieListController();
		controller.setScreen(this);
	}
	
	public void start() {
		System.out.println("--- Start - MovieList - Screen");
		controller.start();
	}
	
	public void showMovieList(List<Movie> movies) {
		loadedMovies = movies;
		System.out.println(" Movie List -------------------");
		for(int i = 0; i < movies.size(); i++) {
			System.out.println("Movie " + i + " -> " + movies.get(i).toString());
		}
		System.out.println(" Movie List End ---------------");
	}
	
	public void onSeeDetailsClick(int position) {
		Movie movie = loadedMovies.get(position);
		controller.onMovieDetailClick(movie);
	}

	public void showMovieDetailScreen(Movie movie) {
		System.out.println(" OPENING Details screen with movie: " + movie.getName());
		RateMovie.selectedMovie = movie;
		// FIXME Call new View when created
	}
}
