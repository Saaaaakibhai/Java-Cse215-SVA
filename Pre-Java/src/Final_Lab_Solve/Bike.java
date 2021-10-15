

public class Bike extends Vehicle implements Runnable{

	public Bike(String color, int IDnumber, String model) throws InputNotCorrectException {
		super(color, IDnumber, model);
	}

	@Override
	public void HowToRun() {
		System.out.println("A bike runs with petrol");
	}

	@Override
	public void wheels() {
		System.out.println("A Bike has two wheels");
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
		return "Bike color: "+this.getColor()+"; ID: "+this.getIDnumber()+"; Model: "+this.getModel();
	}

}
