package Tin_Goyenda.Niloy;

import java.util.ArrayList;
import java.util.Scanner;

public class CaseManagementSystem {
	// array list for storing case object
	public static ArrayList<Case_data> list = new ArrayList<Case_data>();

	public static void main(String[] args) {
		// scanner class
		Scanner input = new Scanner(System.in);
		System.out.println("\n\t\t--- WELCOME TO THE SYSTEM OF TIN GOYENDA ---\n\n");
		System.out.print("\t\tEnter a Username : ");
		String user = input.nextLine();

		System.out.print("\t\tPASSWORD: ");
		String password = input.nextLine();
		if ((user.equals("@kishor_pasha") && password.equals("pasha123"))
				|| (user.equals("@musa_aman") && password.equals("musa123"))
				|| (user.equals("@robin_milford") && password.equals("robin123"))) {
			System.out.println("\n\n\t\tAccess Granted!\n");
			if (user.equals("@kishor_pasha")) {
				System.out.println("\n\n\t\t--- Accessed by Pasha ---\n\n");
			} else if (user.equals("@musa_aman")) {
				System.out.println("\n\n\t\t--- Accessed by Musa ---\n\n");
			} else if (user.equals("@robin_milford")) {
				System.out.println("\n\n\t\t--- Accessed by Robin ---\n\n");
			}

			int choice;
			while (true) { // infinite loop

				System.out.println("\n\n\t\t[1]Create New Case");
				System.out.println("\t\t[2] Edit a Previous Case");
				System.out.println("\t\t[3] View Case");
				System.out.println("\t\t[0] Quit");
				System.out.println("\t\t-------------------");
				System.out.print("\t\tEnter your choice > ");
				choice = input.nextInt();

				switch (choice) {
				case 1:
					Case_data newCase = new Case_data();

					System.out.println("\nEnter date ( format: dd/mm/yyyy) : ");
					input.nextLine();
					String date = input.nextLine();

					System.out.println("\nEnter title of the case: ");
					// input.nextLine();
					String title = input.nextLine();

					System.out.println("\n Enter name of the initial suspect: ");
					String suspect = input.nextLine();

					System.out.println("Description: ");
					String description = input.nextLine();

					newCase.setDate(date);
					newCase.setTitle(title);
					newCase.setSuspect(suspect);
					newCase.setDescription(description);
					newCase.setStatus("Open");

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
						System.out.println("\nEnter new suspect name: ");
						String edited_suspect = input.nextLine();
						list.get(index).setNew_suspect(edited_suspect);
						System.out.println("\nEnter new details: ");
						String edited = input.nextLine();
						list.get(index).setNew_description(edited);
						System.out.println("\nUpdated!");

						System.out.println(
								"\nDo you want to CLOSE the case?if yes then press 'X' on your keyboard if No then press 'O' on your keyboard:");
						String changeStatus = input.nextLine();

						if (changeStatus.equals("X") || changeStatus.equals("x")) {
							list.get(index).setStatus("Close");
							System.out.println("Case: " + list.get(index).getTitle() + " Closed!");
						} else {
							list.get(index).setStatus("Open");
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
					System.out.println("\n\n\t\t---YOU ARE OUT OF THE SYSTEM--- ");
					System.out.println("\t\t--- THANK YOU---\n\n");
					System.exit(0);
					break;
				}

			}
		} else
			System.out.println("\t\tWrong Password or Uername");

		input.close();
	}
}