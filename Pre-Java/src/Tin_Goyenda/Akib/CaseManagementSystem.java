package Tin_Goyenda.Akib;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CaseManagementSystem {
	public static ArrayList<Mod_case> list = new ArrayList<Mod_case>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\n\t___Welcome to Case Management System of Tin Goyenda___\n\n");
		System.out.println("\tPlease Login: \n");
		System.out.print("\t\tUsername: ");
		String username = input.nextLine();
		System.out.print("\t\tPASSWORD: ");
		String password = input.nextLine();

		if (username.equals("kishorpasha") && password.equals("pasha")
				|| username.equals("musaaman") && password.equals("musa")
				|| username.equals("robinmilford") && password.equals("robin")) {
			System.out.println("\n\t\tAccess Granted!!");

			int choice;
			while (true) { // infinite loop
				System.out.println("\n\n\tChoose any option from below:");
				System.out.println("\n\t\t[1] New Case");
				System.out.println("\t\t[2] Modify Case");
				System.out.println("\t\t[3] View Case");
				System.out.println("\t\t[0] Exit");
				System.out.println("\t\t-------------------");
				System.out.print("\t\tEnter your choice > ");
				choice = input.nextInt();
				Mod_case newcase = new Mod_case();

				switch (choice) {
				case 1:

					System.out.println("\nEnter title of the case: ");
					input.nextLine();
					String title = input.nextLine();

					System.out.println("Enter client name: ");
					String client = input.nextLine();

					System.out.println("Enter case description: ");
					String description = input.nextLine();

					System.out.println("Enter primary suspect name: ");
					String primary_suspect = input.nextLine();

					System.out.println("Case Created!");

					String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

					newcase.setTitle(title);
					newcase.setClient_name(client);
					newcase.setDescription(description);
					newcase.setInitial_suspect(primary_suspect);
					newcase.setStatus("Open");
					newcase.setDate_Time(date);

					list.add(newcase); // adding to array list
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

					if (found == -1) {
						System.out.println("\nCASE NOT FOUND!");
					}

					else {
						System.out.println("\nCASE FOUND!");
						System.out.println("\nCase Title: " + list.get(index).getTitle());
						System.out.println("Case Details: \n" + list.get(index).getDescription());
						System.out.println("Case Status: " + list.get(index).getStatus());
						System.out.println("Created: " + list.get(index).getDate_Time());
						String update_date = LocalDateTime.now()
								.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
						list.get(index).setModtime(update_date);

						System.out.println("\nwhat type of modification you want?");
						System.out.println("\n\t[1] Add Description");
						System.out.println("\t[2] Change Case Status");
						int mod_window = input.nextInt();
						switch (mod_window) {
						case 1:
							System.out.println("\nEnter new details: ");
							input.nextLine();
							String edited = input.nextLine();
							list.get(index).setDescription(edited);

							System.out.println("\nUpdated!");
							break;
						case 2:
							System.out.println("\nDo you want to CLOSE the case? (yes/no)");
							input.nextLine();
							String changeStatus = input.nextLine();

							if (changeStatus.equals("yes") || changeStatus.equals("YES")
									|| changeStatus.equals("Yes")) {
								list.get(index).setStatus("Close");

								System.out.println("Enter final culprit name: ");
								String culprit = input.nextLine();
								list.get(index).setFinal_culprit(culprit);
								System.out.println("Enter case summary: ");
								String case_summary = input.nextLine();
								list.get(index).setSummary(case_summary);
								System.out.println("Case: " + list.get(index).getTitle() + " Closed!");

							} else if (changeStatus.equals("no") || changeStatus.equals("NO")
									|| changeStatus.equals("No")) {
								list.get(index).setStatus("Open");
								break;
							} else {
								System.out.println("\n\tERROR!!");
								System.out.println("\tPlease Try Again");
							}
							break;
						}
						break;
					}

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
					String exit;
					if (username.equals("kishorpasha")) {
						System.out.println("\n\n\tHey!! Kishor Pasha are you sure want to exit?\n");
					}
					if (username.equals("musaaman")) {
						System.out.println("\n\n\tHey!! Musa Aman are you sure want to exit?\n");
					}
					if (username.equals("robinmilford")) {
						System.out.println("\n\n\tHey!! Robin Milford are you sure want to exit?\n");
					}
					System.out.println("\t> (Yes / No)\n");
					input.nextLine();
					exit = input.nextLine();

					if (exit.equals("yes") || exit.equals("YES") || exit.equals("Yes")) {
						System.out.println("\n\t\t\t THANK YOU FOR USING\n");
						System.out.println("\t\t--- Case Management System of Tin Goyenda ---\n\n");
						System.exit(0);
						break;
					}

					else if (exit.equals("no") || exit.equals("NO") || exit.equals("No")) {
						continue;
					} else {
						System.out.println("\n\t\tERROR!!\n");
						System.out.println("\t   Please Try Again");
						continue;
					}

				default:
					System.out.println("\n\t\tERROR!!");
					System.out.println("\t   Please Try Again");
				}
			}
		}

		else {
			System.out.println("\n\t\tAccess Denied!!!");
		}
		input.close();
	}

}
