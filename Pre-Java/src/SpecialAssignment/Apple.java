package SpecialAssignment;

public class Apple extends Fruit{
	//data fields called varieties
	String v1 = "Cider";
	String v2 = "Cooking";
	String v3 = "Dessert";
	
	Apple(){
		setSeason(winter);
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Season: "+getSeason()+"\nVarieties: \n1. "+v1+"\n2. "+v2+"\n3. "+v3+"\nColor: "+getColor()+"\nSeed: "+getSeed()+"\n";
	}
	
	
}
