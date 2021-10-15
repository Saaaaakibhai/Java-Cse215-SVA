package Tin_Goyenda;

public class Case {
	// data fields
	private String title;
	private String description;
	private String status;
	private String date_Time;

	public Case() {
		//no argument constructor
	}

	// getter setter
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public String getDate_Time() {
		return date_Time;
	}

	public void setDate_Time(String date_Time) {
		this.date_Time = date_Time;
	}

	@Override
	public String toString() {
		return "Case Title: " + title + "\nCase Description: " + description + "\nCase Status: " + status + "\nDate: "+date_Time+"\n";
	}

}
