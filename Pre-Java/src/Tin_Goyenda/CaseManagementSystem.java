package Tin_Goyenda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CaseManagementSystem {
	// array list for storing case object
	public static ArrayList<Case> list = new ArrayList<Case>();

	public static void main(String[] args) {
		// scanner class
		Scanner input = new Scanner(System.in);
		System.out.println("\n\t\t--- Case Management System of Tin Goyenda ---\n\n");

		System.out.print("\t\tPASSWORD: ");
		String password = input.nextLine();

		if (password.equals("pasha") || password.equals("musa") || password.equals("robin")) {
			System.out.println("\t\tAccess Granted!");
			int choice;
			while (true) { // infinite loop

				System.out.println("\n\n\t\t[1] New Case");
				System.out.println("\t\t[2] Modify Case");
				System.out.println("\t\t[3] View Case");
				System.out.println("\t\t[0] Exit");
				System.out.println("\t\t-------------------");
				System.out.print("\t\tEnter your choice > ");
				choice = input.nextInt();

				switch (choice) {
				case 1:
					Case newCase = new Case();
					System.out.println("\nEnter title of the case: ");
					input.nextLine();
					String title = input.nextLine();

					System.out.println("Enter case description: ");
					String description = input.nextLine();

					newCase.setTitle(title);
					newCase.setDescription(description);
					newCase.setStatus("Open");

					String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
					newCase.setDate_Time(date);
					
					list.add(newCase); // adding to array list
					break;

				case 2:
					System.out.println("\nEnter the title of case to modify:");
					input.nextLine();
					String t = input.nextLine();

					int found = -1;
					int index = -1;
					for (int i = 0; i < list.size(); i++) {
						if (t.equals(list.get(i).getTitle())) {
							index = i;
							found++;
							break;
						}

					}

					if (found == -1)
						System.out.println("\nCASE NOT FOUND!");
					else {
						System.out.println("\n\nCase Title: " + list.get(index).getTitle());
						System.out.println("Case Details: \n" + list.get(index).getDescription());
						System.out.println("Case Status: " + list.get(index).getStatus());
						System.out.println("Last Modified: " + list.get(index).getDate_Time());

						System.out.println("\nDo you want to CLOSE the case? (yes/no)");
						String changeStatus = input.nextLine();

						if (changeStatus.equals("yes") || changeStatus.equals("YES") || changeStatus.equals("Yes")) {
							list.get(index).setStatus("Close");
							System.out.println("Case: " + list.get(index).getTitle() + "Closed!");
						} else {
							System.out.println("\nEnter new details: ");
							String edited = input.nextLine();
							list.get(index).setDescription(edited);
							String update_date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
							list.get(index).setDate_Time(update_date);
							System.out.println("\nUpdated!");
						}

					}

					break;

				case 3:
					if (list.size() == 0)
						System.out.println("\t\tNO CASE FOUND!");
					else {
						for (int i = 0; i < list.size(); i++) {
							System.out.println("CASE " + (i + 1));
							System.out.println(list.get(i).toString());
						}
						System.out.println();
					}
					break;

				case 0:
					if (password.equals("pasha")) {
						System.out.println("\n\n\t\t--- Accessed by Pasha ---\n\n");
					}
					if (password.equals("musa")) {
						System.out.println("\n\n\t\t--- Accessed by Musa ---\n\n");
					}
					if (password.equals("robin")) {
						System.out.println("\t\t--- Accessed by Robin ---\n\n");
					}
					System.out.println("\n\t\t--- THANK YOU --- ");
					System.out.println("\t\t--- Case Management System of Tin Goyenda ---\n\n");
					System.out.println("\t\t--- Developed by Ihsanul ---\n\n");
					System.exit(0);
					break;
				}

			}
		} else
			System.out.println("\t\tWrong Password!");

		input.close();
	}

}
