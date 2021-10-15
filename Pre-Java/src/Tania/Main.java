package Tania;
import java.util.ArrayList;
import java.util.*;  
import java.util.Random;
    
public class Main
{

     public static void main(String []args){
         
        try{
            while(true)
            {
                System.out.println("Write 1 or 2; 1 is for add new case; 2 is for Update existing case!!!!! ");
                Scanner sc = new Scanner(System.in);    //System.in is a standard input stream  
                System.out.print("write here- \n");  
                int a = sc.nextInt();  
                if(a == 1)
                {
                    CaseManagementSystem c = new CaseManagementSystem();
                    System.out.print("Enter a unique suspectID- \n");  
                    int suspectID = sc.nextInt();  
                    c.suspectID = suspectID;
                    
                    sc.nextLine();
                    
                    System.out.print("Enter a briefDescription- \n");  
                    String briefDescription = sc.nextLine();  
                    c.briefDescription = briefDescription;
                    sc.nextLine();
                    System.out.print("Enter a unique PasswordID- \n");  
                    int PasswordID = sc.nextInt();  
                    c.PasswordID = PasswordID;
                    sc.nextLine();
                    
                    //empty update at first
                    Random rand = new Random(); //instance of random class
                    int upperbound = 25;
                    //generate random values from 11-99
                    int int_random = rand.nextInt(upperbound); 
                    String date = java.time.LocalDate.now().toString();
                    CaseUpdate cu = new CaseUpdate(int_random, date, "empty");
                    ArrayList<CaseUpdate> al = new ArrayList<>();
                    al.add(cu);
                    c.caseUpdateList = al;
                    ReportCreator.GetInstance().AddCaseReport(c);
                    System.out.println("New Case is Added!!!!!\n\n\n\n");
                    
                    
                }
                else if( a == 2)
                {
                   System.out.println("Here are the all cases>>>>>>>>>>");  
                   GenReport gr = ReportCreator.GetInstance().AllCaseReport();
                   for(CaseManagementSystem cm : gr.caseManagementSystem)
                   {
                       System.out.println("Information > \n\t suspectID: "+ cm.suspectID +" \n\t Brief Description: "+ cm.briefDescription +"\n\tPasswordID : "+ cm.PasswordID);  
                       System.out.println("\t More update information: ");
                       for(CaseUpdate c : cm.caseUpdateList){
                           System.out.println("\t\t update case id: " + c.getUpdate_id());
                           System.out.println("\t\t update case date: " + c.getUpdate_date());
                           System.out.println("\t\t update case details: " + c.getDetailOfSuspect());
                           System.out.println("\n\t");
                       }
                   }
                   
                   System.out.print("Do you want to update? Yes: 1 ____ No:0 - \n");  
                   int updatestatus = sc.nextInt();  
                   if(updatestatus == 1)
                   {
                       System.out.print("Provide Suspect ID:  - \n");  
                       int id = sc.nextInt();
                       
                       sc.nextLine();
                       
                       System.out.print("Provide New Brief Description:  - \n");  
                       String bd = sc.nextLine();
                       
                       for(CaseManagementSystem cm : gr.caseManagementSystem)
                       {
                            if(cm.suspectID == id){
                                cm.briefDescription = bd;
                                System.out.println("Brief Description is updated!!!! \n"); 
                                
                                System.out.print("Do you want to more update? Yes: 1 ____ No:0 - \n");  
                                int moreupdatestatus = sc.nextInt();  
                                if(moreupdatestatus == 1)
                                {
                                    Random rand = new Random(); //instance of random class
                                    int upperbound = 25;
                                    //generate random values from 11-99
                                    int int_random = rand.nextInt(upperbound); 
                                    String date = java.time.LocalDate.now().toString();
                                    
                                    sc.nextLine();
                                    
                                    System.out.print("Provide new details info of suspect:  - \n");  
                                    String ds = sc.nextLine();
                                    
                                    CaseUpdate cu = new CaseUpdate(int_random, date, ds);
                                    cm.caseUpdateList.add(cu);
                                    System.out.println("New Case is Added!!!!!\n\n\n\n");  
                                }
                                else
                                {
                                    break;
                                }
                            }
                       }
                   }
                   else
                   {
                       break;
                   }
                   
                }
                else
                {
                     System.out.println("Invalid Input");
                     break;
                }
            }
            
        }catch(Exception a){
            System.out.println("Error"+a);
        }
     }
}

