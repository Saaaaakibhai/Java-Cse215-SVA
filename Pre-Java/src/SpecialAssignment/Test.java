package SpecialAssignment;

public class Test { //this is test class 

	public static void main(String[] args) { //this is main method
		
		Fruit[] f = new Fruit[10];
		
		for (int i = 0; i < f.length; i++) {
			if(i <= 4) {
				f[i] = new Apple();
				f[i].setColor("Green");
				f[i].setSeed("Apple type seed");
			}else {
				f[i] = new Mango();
				f[i].setColor("Green");
				f[i].setSeed("Mango type seed");
			}
		}
		
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i].toString());
		}
		
		
	}

}
