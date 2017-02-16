package task3exercise2;


public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301154096 
    // NAMA : Gangsar Yoga Pamungkas 
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    //------------------- your code here-----------------------
    private String projectName;
    private Member[] teamMember = new Member[5];
    private int nTeam = 0;
    private boolean releaseStatus = false;
    
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : 1301154096 
    // NAMA : Gangsar Yoga Pamungkas 
    //
    //------------------- your code here-----------------------
    public String getProjectName(){
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Member[] getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(Member[] teamMember) {
        this.teamMember = teamMember;
    }

    public int getnTeam() {
        return nTeam;
    }

    public void setnTeam(int nTeam) {
        this.nTeam = nTeam;
    }

    public boolean isReleaseStatus() {
        return releaseStatus;
    }
    
    public Project(String projectName){
        this.projectName = projectName;
    }
    //---------------------------------------------------------
    

    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154096
    // NAMA : Gangsar Yoga Pamungkas 
    //
    //------------------- your code here-----------------------
    public void setReleaseStatus(boolean releaseStatus) {    
        this.releaseStatus = releaseStatus;
    }

    //---------------------------------------------------------
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154096
    // NAMA : Gangsar Yoga Pamungkas 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
    public void addMember(Member a) {
        //teamMember[nTeam] = a;
        //nTeam++;
        if (nTeam <= teamMember.length) {
            teamMember[nTeam] = a;
            nTeam++;            
            a.setProjectWorked(a.getProjectWorked()+1);
       }
       else {
            System.out.println("Team full");
        }
    }
    //---------------------------------------------------------
    
    
    // 5. Declare method releaseApp() here:
    // NIM : 1301154096 
    // NAMA : Gangsar Yoga Pamungkas 
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
   
    public void releaseApp(){
        releaseStatus = true;
    }
    //---------------------------------------------------------
    
    
    // 6. Create method toString() : String here:
    // NIM : 1301154096 
    // NAMA : Gangsar Yoga Pamungkas  
    //
    // returns String that contains Project name, number of team member, 
    // and release status 
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    public String toString() {
    //------------------- your code here-----------------------
    if(releaseStatus == true){
        return(projectName + " Status is in released with team member of "+nTeam);
    }
    else
    {
        return(projectName + " Status is in progres with team member of "+nTeam);
    }
        
    
    //---------------------------------------------------------
    }
}