package Tin_Goyenda.Akib;

public class Mod_case extends Stock_case {
	private String Final_culprit;
	private String summary;
	private String modtime;

	public Mod_case() {

	}

	public String getFinal_culprit() {
		return Final_culprit;
	}

	public void setFinal_culprit(String final_culprit) {
		Final_culprit = final_culprit;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getModtime() {
		return modtime;
	}

	public void setModtime(String modtime) {
		this.modtime = modtime;
	}

	@Override
	public String toString() {
		return ("Case Title: " + getTitle() + "\nClient Name: " + getClient_name() + "\nCase Description: "
				+ getDescription() + "\nPrimary Suspect: " + getInitial_suspect() + "\nFinal Culprit: "
				+ getFinal_culprit() + "\nSummary: " + getSummary() + "\nCase Status: " + getStatus() + "\ncreated: "
				+ getDate_Time() + "\nLast modified: " + getModtime());
	}
}
