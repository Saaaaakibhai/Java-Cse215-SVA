import java.util.Scanner;

public class Octagon {
	private double side; //private data fields: side
	public static int numberOfOctagon = 0;  //count the number of octagon created
	
	Octagon(){
		//no argument constructor
		numberOfOctagon++;
	}
	
	Octagon(double side){
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		return (2.0+(4.0/Math.sqrt(2))) * Math.pow(side, 2);
	}
	
	public double getPerimeter() {
		return 8.0*side;
	}
}


class Test_Octagon{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//The 5th digit of my NSU ID is 6; so x = 6
		int x = 6;
		//creating an array of Octagon object
		Octagon[] obj = new Octagon[x];
		
		for (int i = 0; i < obj.length; i++) {
			System.out.print("Enter side for octagon "+(i+1)+": ");
			double side = input.nextDouble();
			obj[i] = new Octagon(side); //taking sides from user input
		}
		
		int index = -1;
		double max = obj[0].getArea();
		for (int i = 1; i < obj.length; i++) {
			if(obj[i].getArea() > max) {  //finding max area;
				max = obj[i].getArea();
				index = i;
			}	
		}
		
		
		//output
		System.out.println("\nLargest side: "+obj[index].getSide());
		System.out.printf("Largest Area: %.2f",obj[index].getArea());
		
	}
}
