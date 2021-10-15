

public class Car extends Vehicle implements Runnable{

	public Car(String color, int IDnumber, String model) throws InputNotCorrectException {
		super(color, IDnumber, model);
	}

	@Override
	public void HowToRun() {
		System.out.println("A car runs with diesel");
	}

	@Override
	public void wheels() {
		System.out.println("A car has four wheels");
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.getModel().equals(((Vehicle) obj).getModel()))
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Car color: "+this.getColor()+"; ID: "+this.getIDnumber()+"; Model: "+this.getModel();
	}

}
