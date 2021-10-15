package Tania;

class CaseUpdate extends Main {

	private int update_id;
	private String update_date;
	private String detailOfSuspect;

	// constructor
	public CaseUpdate() {
	}

	public CaseUpdate(int update_id, String update_date, String detailOfSuspect) {
		this.update_id = update_id;
		this.update_date = update_date;
		this.detailOfSuspect = detailOfSuspect;
	}

	// getter
	public int getUpdate_id() {
		return update_id;
	}

	// Setter
	public void setUpdate_id(int update_id) {
		this.update_id = update_id;
	}

	// getter
	public String getUpdate_date() {
		return update_date;
	}

	// Setter
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	// getter
	public String getDetailOfSuspect() {
		return detailOfSuspect;
	}

	// Setter
	public void setDetailOfSuspect(String detailOfSuspect) {
		this.detailOfSuspect = detailOfSuspect;
	}

}
