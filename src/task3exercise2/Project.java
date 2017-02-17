package task3exercise2;


public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301154306 
    // NAMA : M.Widadio Ilham
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
     private String projectName;
     private Member[] teamMember = new Member[5];
     private int nTeam = 0;
     private boolean releaseStatus = false;
    
    // 2. Declare your Constructor here:
    // NIM : 1301154306 
    // NAMA : M.Widadio Ilham 
    //
    
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154306 
    // NAMA : M.Widadio Ilham 
    //
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
     
         public void setReleaseStatus(boolean releaseStatus) {    
         this.releaseStatus = releaseStatus;
     }
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154306 
    // NAMA : M.Widadio Ilham 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    public void addMember(Member a) {
         if (nTeam <= teamMember.length) {
             teamMember[nTeam] = a;
             nTeam++;            
             a.setProjectWorked(a.getProjectWorked()+1);
        }
        else {
             System.out.println("Team full");
         }
     }
    
    
    // 5. Declare method releaseApp() here:
    // NIM : 1301154306 
    // NAMA : M.Widadio Ilham
    //
    // set release status = true
    //
    public void releaseApp(){
         releaseStatus = true;
     }
    
    
    // 6. Create method toString() : String here:
    // NIM : 1301154306 
    // NAMA : M.Widadio Ilham
    //
    // returns String that contains Project name, number of team member, 
    // and release status 
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    public String toString() {
    if(releaseStatus == true){
         return(projectName + " Status is in released with team member of "+nTeam);
     }
    else 
     {
         return(projectName + " Status is on progres with team member of "+nTeam);
     }
     
    
    //---------------------------------------------------------
    }
}