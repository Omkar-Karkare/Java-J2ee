package movies;

public class Actor {

	private String aName;
	private String rName;

	public Actor() {

	}

	public Actor(String aName, String rName) {

		this.aName = aName;
		this.rName = rName;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public void printActorDetails() {
		System.out.println("Actor Name: " + this.aName);
		System.out.println("Actor Role: " + this.rName);
	}

}
