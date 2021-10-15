

class InputNotCorrectException extends Exception{
	public InputNotCorrectException(String warning) {
		super(warning);
	}
}
public abstract class Vehicle {
	private String color;
	private int IDnumber;
	private String model;
	
	public Vehicle(String color,int IDnumber,String model) throws InputNotCorrectException {
		this.color = color;
		this.model = model;
		
		if(IDnumber < 0)
			throw new InputNotCorrectException("ID Number can't be negative!");
		else
			this.IDnumber = IDnumber;
	}

	public abstract void wheels();
	
	public String getColor() {
		return color;
	}

	public int getIDnumber() {
		return IDnumber;
	}

	public String getModel() {
		return model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setIDnumber(int iDnumber) {
		IDnumber = iDnumber;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
