package SpecialAssignment;

public class Mango extends Fruit {
	// data field called propagation
	String p1 = "grafting";
	String p2 = "budding";

	Mango() {
		setMangoSeason();
	}

	public void setMangoSeason() {
		setSeason(summer);
	}

	// toString() method
	public String toString() {
		return "Season: " + getSeason() + "\nPropagation: \n1. " + p1 + "\n2. " + p2 +"\nColor: "+getColor()+"\nSeed: "+getSeed()+"\n";
	}
}
