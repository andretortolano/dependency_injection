package sample.dagger;

public class RateMovie {

	public static Screen currentScreen = null;
	
	public static Movie selectedMovie = null;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("----------- START APPLICATION");
		
		navigateToMovieListScreen();

		Thread.sleep(3000);
		((MovieListScreen) currentScreen).onSeeDetailsClick(1);
		
	}
	
	public static void navigateToMovieListScreen() {
		MovieListScreen screen = new MovieListScreen();
		currentScreen = screen;
		screen.start();
	}
	
	/**
	 * (To keep the exercise simple, we won't care about the structure of this class)
	 * 
	 * STEP: 01
	 * 
	 * 
	 */
}
