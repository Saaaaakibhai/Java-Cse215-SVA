package SpecialAssignment;

public class Fruit {
	//data fields
	String color;
	String seed;
	
	//a private data field
	private String season;
	
	//constant seasons
	final String summer = "SUMMER";
	final String winter = "WINTER";
	final String autumn = "AUTUMN";
	
	//getter setter methods or accessor and mutators
	//shortcut: ALT+SHIFT+s+r
	
	public String getColor() {
		return color;
	}
	public String getSeed() {
		return seed;
	}
	public String getSeason() {
		return season;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setSeed(String seed) {
		this.seed = seed;
	}
	public void setSeason(String season) {
		this.season = season;
	}

	
}
