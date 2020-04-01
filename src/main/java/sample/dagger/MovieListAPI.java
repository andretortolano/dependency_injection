package sample.dagger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MovieListAPI {

	public void getMovieList(MovieListController movieListController) {
		Thread newThread = new Thread(() -> {
			try {
				System.out.println(" this may take about 2 seconds, loading from the Web");
				TimeUnit.SECONDS.sleep(2);
				List<Movie> movies = new ArrayList<Movie>();
				
				movies.add(new Movie(1, "STAR WARS", "ANNAKIN AND LUKE ARE POWERFUL, BUT IN THE END REY IS STRONGER", 5));
				movies.add(new Movie(2, "JURASIC PARK", "T-REX IS ALWAYS THE GOOD GUY", 3));
				movies.add(new Movie(3, "MIB - MEN IN BLACK", "THE PUG WHO SPEAKS!!!!", 4));
				
				movieListController.onGetMovieListSuccess(movies);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		newThread.start();
	}
}
