package sample.dagger;

public class Movie {

	private int id;
	private String name;
	private String description;
	private int rating;
	
	public Movie(int id, String name, String description, int rating) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.rating = rating;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getRating() {
		return rating;
	}
	
	public String toString() {
		return "Name: " + this.name + ", Description: " + this.description + ", Rating: " + this.rating;
	}
}
