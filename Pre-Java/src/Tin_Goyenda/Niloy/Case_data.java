package Tin_Goyenda.Niloy;

public class Case_data {
	// data fields
	private String title;
	private String description;
	private String new_description;
	private String status;
	private String suspect;
	private String new_suspect;
	private String date;

	public Case_data() {
		// no argument constructor
	}

	// getter setter

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNew_description() {
		return new_description;
	}

	public void setNew_description(String new_description) {
		this.new_description = new_description;
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

	public String getSuspect() {
		return suspect;
	}

	public void setSuspect(String suspect) {
		this.suspect = suspect;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNew_suspect() {
		return new_suspect;
	}

	public void setNew_suspect(String new_suspect) {
		this.new_suspect = new_suspect;
	}

	@Override
	public String toString() {
		return "Date: " + date + "\nCase Title: " + title + "\nInitial Suspect: " + suspect + "\nFinal suspect:"
				+ new_suspect + "\nCase Description: " + description + "\nFinal description:" + new_description
				+ "\nCase Status: " + status + "\n";
	}

}