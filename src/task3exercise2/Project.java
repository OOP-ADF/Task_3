package task3exercise2;


public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301154287
    // NAMA : Jeremiah Hasudungan 
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    //------------------- your code here-----------------------
    private String projectName;
    private Member[] teamMember;
    private int nTeam = 0;
    private boolean releaseStatus;
    
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : 1301154287
    // NAMA : Jeremiah Hasudungan  
    //
    //------------------- your code here-----------------------
    public Project (String projectName)
    {
        this.projectName = projectName;
        this.releaseStatus = false;
        this.teamMember = new Member[5];
    }
    
    
    //---------------------------------------------------------
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154287 
    // NAMA : Jeremiah Hasudungan
    //
    //------------------- your code here-----------------------
    public boolean isReleased()
    {
        return releaseStatus;
    }
    
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154287 
    // NAMA : Jeremiah Hasudungan 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
    public void addMember (Member m)
    {
        this.teamMember[nTeam] = m;
        nTeam++;
        m.setProjectWorked(m.getProjectWorked() + 1);
    }
    
    
    //---------------------------------------------------------
    
    
    // 5. Declare method releaseApp() here:
    // NIM : 1301154287
    // NAMA : Jeremiah Hasudungan
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
     public void releaseApp()
    {
        this.releaseStatus = true;
    }
    //---------------------------------------------------------
    
    
    // 6. Create method toString() : String here:
    // NIM : 1301154287
    // NAMA : Jeremiah Hasudungan
    //
    // returns String that contains Project name, number of team member, 
    // and release status 
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    public String toString() {
    
        
        String stat;
        if (releaseStatus == false)
            stat = "unknow";
        else
            stat = "in progress";
            
        String p = "Project " + projectName + " status is " + stat + " with team member of " + nTeam;
        return p;
    
    //---------------------------------------------------------
    }
}