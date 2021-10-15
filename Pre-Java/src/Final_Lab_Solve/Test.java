

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		//use your NSU id for array size
		Vehicle[] arr = new Vehicle[5];
		
		try {
			Car car1 = new Car("RED",201,"CVXNS");
			Car car2 = new Car("RED",221,"CVXNS");
			Bike bike1 = new Bike("Black",202,"WRSG");
			Bike bike2 = new Bike("Black",203,"WPXR");
			Bike bike3 = new Bike("Black",204,"WRSG");
			
			arr[0] = car1;
			arr[1] = car2;
			arr[2] = bike1;
			arr[3] = bike2;
			arr[4] = bike3;
			
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i].toString());
			}
			
			System.out.println("\nIs car1 equals to car2? "+car1.equals(car2));
			System.out.println("Is bike1 equals to bike2? "+bike1.equals(bike2));
			
			File file = new File("src/Vehicle.txt");
			// File output (Write on File)
			PrintWriter output = new PrintWriter(file);
			for (int i = 0; i < arr.length; i++) {
				output.println(arr[i].toString());
			}
			output.println("\nIs car1 equals to car2? "+car1.equals(car2));
			output.println("Is bike1 equals to bike2? "+bike1.equals(bike2));
			output.close();
		} catch (InputNotCorrectException e) {
			System.out.println(e);
		}
		
		System.out.println("\nFile created: Vehicle.txt");
		
	}

}
