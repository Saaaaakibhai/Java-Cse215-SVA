package Tania;

import java.util.ArrayList;

class GenReport {
	public ArrayList<CaseManagementSystem> caseManagementSystem;

	public GenReport() {
		caseManagementSystem = new ArrayList<>();
	}

	public GenReport(ArrayList<CaseManagementSystem> caseManagementSystem) {
		this.caseManagementSystem = caseManagementSystem;
	}

	// getter
	public ArrayList<CaseManagementSystem> getCaseManagementSystem() {
		return caseManagementSystem;
	}

	// setter
	public void setCaseManagementSystem(ArrayList<CaseManagementSystem> caseManagementSystem) {
		this.caseManagementSystem = caseManagementSystem;
	}

	public void AddNewCase(CaseManagementSystem c) {
		caseManagementSystem.add(c);
	}

	public void RemoveCase(CaseManagementSystem c) {
		caseManagementSystem.remove(c);
	}

}
