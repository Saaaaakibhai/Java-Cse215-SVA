package Tania;
import java.util.ArrayList;



class CaseManagementSystem extends Main{

    public int suspectID;
    public int  PasswordID;
    public String briefDescription;
    public ArrayList<CaseUpdate> caseUpdateList;
    
    
    public CaseManagementSystem()
    {
        caseUpdateList = new ArrayList<>();
    }

    public CaseManagementSystem(ArrayList<CaseUpdate> caseUpdateList)
    {
        this.caseUpdateList = caseUpdateList;
    }
    
    
    //getter
    public ArrayList<CaseUpdate> getCaseUpdateList()
    {
        return caseUpdateList;
    }
    //setter
    public void setCaseUpdateList(ArrayList<CaseUpdate> caseUpdateList)
    {
        this.caseUpdateList = caseUpdateList;
    }
    //getter
    public int getSuspectID() { 
        return suspectID;
    }
     // Setter
    public void setSuspectID(int suspectID) {
        this.suspectID = suspectID;
    }
    
//getter
public int getPasswordID() { 
    return PasswordID;
}
 // Setter
public void setPasswordID(int PasswordID) {
    this.PasswordID= PasswordID;
}

    //getter
    public String getBriefDescription() { 
        return briefDescription;
    }
     // Setter
    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }
    
}

