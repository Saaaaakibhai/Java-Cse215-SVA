package Tania;

class ReportCreator extends Main {
	private static ReportCreator _instance;
	private static GenReport genReport;

	private ReportCreator() {
		genReport = new GenReport();
	}

	public static ReportCreator GetInstance() {
		if (_instance == null) {
			_instance = new ReportCreator();
		}
		return _instance;
	}

	public void AddCaseReport(CaseManagementSystem c) {
		genReport.AddNewCase(c);
	}

	public void RemoveCaseReport(CaseManagementSystem c) {
		genReport.RemoveCase(c);
	}

	public GenReport AllCaseReport() {
		return ReportCreator.genReport;
	}

	// call gen report as you want
}
