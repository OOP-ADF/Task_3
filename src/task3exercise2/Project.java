package task3exercise2;

import java.util.Arrays;


public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301154525 
    // NAMA : Karina Hasya Utami Dewi 
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    private String projectName;
    private Member [] teamMember;
    private int nTeam = 0;
    private boolean releaseStatus;
    
    
    // 2. Declare your Constructor here:
    // NIM :1301154525
    // NAMA : Karina Hasya Utami Dewi
    //
 
    
    public Project (String projectName ){
        this.projectName = projectName;
        this.teamMember = new Member [5];
        this.releaseStatus = false;
    }
        
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154525
    // NAMA : Karina Hasya Utami Dewi
    //


    public boolean isReleaseStatus() {
        return releaseStatus;
    }

 
    
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154525
    // NAMA : Karina Hasya Utami Dewi
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    
 public void addMember (Member m){
     this.teamMember[nTeam] = m;
     nTeam++;
     
     m.setProjectwork(m.getProjectwork()+1);
 }
    
    
    // 5. Declare method releaseApp() here:
    // NIM : 1301154525 
    // NAMA : Karina Hasya Utami Dewi 
    //
    // set release status = true
    //
    public void releaseApp(){
        this.releaseStatus = true;
    }
    
    // 6. Create method toString() : String here:
    // NIM : 1301154525
    // NAMA : Karina Hasya Utami Dewi 
    //
    // returns String that contains Project name, number of team member, 
    // and release status 
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    @Override
    public String toString() {
        String stat;
        boolean releseStatus = false;
        if(releseStatus == false)
            stat = "unknow";
        else
            stat = "in progress";
        
        String a ="Project "+projectName+" status is "+stat+" with team member of "+nTeam;
        
        return a;
    
    }
}
