package QUIZ;

import java.util.Scanner;

abstract class Product {
	public double price;
	public String name;

	public Product() {

	}

	protected Product(String n, double p) {
		price = p;
		name = n;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void changePrice(double percentage);
}

class ElectronicDevice extends Product{
	private String model;
	private String warranty;

	public ElectronicDevice() {

	}

	public ElectronicDevice(String n, double p,String m,String w) {
		super(n,p);
		model = m;
		warranty = w;
	}

	public String getModel() {
		return model;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	@Override
	public void changePrice(double percentage) {
		price = price + (price*(percentage/100.0));
		
	}
	
	@Override
	public String toString() {
		return "Name: "+name+"\nModel: "+model+"\nWarranty: "+warranty+"\nPrice: "+price;
	}
}

public class Solution01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter product name: ");
		String name = input.nextLine();
		System.out.println("Enter price: ");
		double price = input.nextDouble();
		input.nextLine();
		System.out.println("Enter model: ");
		String model = input.nextLine();
		System.out.println("Enter warranty: ");
		String warranty = input.nextLine();
		
		ElectronicDevice obj = new ElectronicDevice(name,price,model,warranty);
		obj.changePrice(10.0);
		System.out.println(obj.toString());

	}

}
