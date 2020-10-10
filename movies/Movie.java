package movies;

public class Movie {

	private String mName;
	private String year;
	private Actor[] actors;

	public Movie() {

	}

	public Movie(String mName, String year, Actor[] actors) {

		this.mName = mName;
		this.year = year;
		this.actors = actors;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Actor[] getActors() {
		return actors;
	}

	public void setActors(Actor[] actors) {
		this.actors = actors;
	}

	public void printMovie() {

		System.out.println("Movie Name:" + this.mName);
		System.out.println("Year of Release:" + this.year);
		for (Actor a : actors) {
			a.printActorDetails();
		}

	}

}
