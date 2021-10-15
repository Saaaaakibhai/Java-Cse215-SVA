package Tid_Goyenda.Lima;


import java.util.ArrayList;
import java.util.*;
import java.util.Random;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {

		try {
			while (true) {
				System.out.println("Write 1 or 2; 1 is for add new case; 2 is for Update existing case!!!!! ");
				Scanner sc = new Scanner(System.in); // System.in is a standard input stream
				System.out.print("write here- \n");
				int a = sc.nextInt();
				if (a == 1) {
					CaseManagementSystem c = new CaseManagementSystem();
					System.out.print("Enter a unique suspectID- \n");
					int suspectID = sc.nextInt();
					c.suspectID = suspectID;

					sc.nextLine();

					System.out.print("Enter a briefDescription- \n");
					String briefDescription = sc.nextLine();
					c.briefDescription = briefDescription;

					// empty update at first
					Random rand = new Random(); // instance of random class
					int upperbound = 25;
					// generate random values from 11-99
					int int_random = rand.nextInt(upperbound);
					String date = java.time.LocalDate.now().toString();
					CaseUpdate cu = new CaseUpdate(int_random, date, "empty");
					ArrayList<CaseUpdate> al = new ArrayList<>();
					al.add(cu);
					c.caseUpdateList = al;
					ReportCreator.GetInstance().AddCaseReport(c);
					System.out.println("New Case is Added!!!!!\n\n\n\n");

				} else if (a == 2) {
					System.out.println("Here are the all cases>>>>>>>>>>");
					GenReport gr = ReportCreator.GetInstance().AllCaseReport();
					for (CaseManagementSystem cm : gr.caseManagementSystem) {
						System.out.println("Information > \n\t suspectID: " + cm.suspectID + " \n\t Brief Description: "
								+ cm.briefDescription);
						System.out.println("\t More update information: ");
						for (CaseUpdate c : cm.caseUpdateList) {
							System.out.println("\t\t update case id: " + c.getUpdate_id());
							System.out.println("\t\t update case date: " + c.getUpdate_date());
							System.out.println("\t\t update case details: " + c.getDetailOfSuspect());
							System.out.println("\n");
						}
					}

					System.out.print("Do you want to update? Yes: 1 ____ No:0 - \n");
					int updatestatus = sc.nextInt();
					if (updatestatus == 1) {
						System.out.print("Provide Suspect ID:  - \n");
						int id = sc.nextInt();

						sc.nextLine();

						System.out.print("Provide New Brief Description:  - \n");
						String bd = sc.nextLine();

						for (CaseManagementSystem cm : gr.caseManagementSystem) {
							if (cm.suspectID == id) {
								cm.briefDescription = bd;
								System.out.println("Brief Description is updated!!!! \n");

								System.out.print("Do you want to more update? Yes: 1 ____ No:0 - \n");
								int moreupdatestatus = sc.nextInt();
								if (moreupdatestatus == 1) {
									Random rand = new Random(); // instance of random class
									int upperbound = 25;
									// generate random values from 11-99
									int int_random = rand.nextInt(upperbound);
									String date = java.time.LocalDate.now().toString();

									sc.nextLine();

									System.out.print("Provide new details info of suspect:  - \n");
									String ds = sc.nextLine();

									CaseUpdate cu = new CaseUpdate(int_random, date, ds);
									cm.caseUpdateList.add(cu);
									System.out.println("New Case is Added!!!!!\n\n\n\n");
								} else {
									break;
								}
							}
						}
					} else {
						break;
					}

				} else {
					System.out.println("Invalid Input");
					break;
				}
			}

		} catch (Exception a) {
			System.out.println("Error" + a);
		}
	}
}

//it's a singleton class which will help us as a database framework.
class ReportCreator {
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

class CaseManagementSystem {
	public int suspectID;
	public String briefDescription;
	public ArrayList<CaseUpdate> caseUpdateList;

	public CaseManagementSystem() {
		caseUpdateList = new ArrayList<>();
	}

	public CaseManagementSystem(ArrayList<CaseUpdate> caseUpdateList) {
		this.caseUpdateList = caseUpdateList;
	}

	// getter
	public ArrayList<CaseUpdate> getCaseUpdateList() {
		return caseUpdateList;
	}

	// setter
	public void setCaseUpdateList(ArrayList<CaseUpdate> caseUpdateList) {
		this.caseUpdateList = caseUpdateList;
	}

	// getter
	public int getSuspectID() {
		return suspectID;
	}

	// Setter
	public void setSuspectID(int suspectID) {
		this.suspectID = suspectID;
	}

	// getter
	public String getBriefDescription() {
		return briefDescription;
	}

	// Setter
	public void setBriefDescription(String briefDescription) {
		this.briefDescription = briefDescription;
	}

}

class CaseUpdate {

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