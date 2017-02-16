package task3exercise2;
// Tugas Rakha

public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301154124, 
    // NAMA : Muhammad Rakha, 
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    //------------------- your code here-----------------------
    private String projectName;
    private Member teamMember [] = new Member[5];
    private int nTeam = 0;
    private boolean releaseStatus = false;
    
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : 1301154124, 
    // NAMA : Muhammad Rakha, 
    //
    //------------------- your code here-----------------------
     public Project(String projectName) {
        this.projectName = projectName;
    }
    
    //---------------------------------------------------------

   
    
    // 3. Declare your Setter and Getter method here:
    // NIM : 1301154124, 
    // NAMA : Muhammad Rakha, 
    //
    //------------------- your code here-----------------------

    public String getProjectName() {
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

    public void setReleaseStatus(boolean releaseStatus) {
        this.releaseStatus = releaseStatus;
    }
    
    
    
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301154124, 
    // NAMA : Muhammad Rakha 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
    public void addmember (Member m){
        teamMember [nTeam] = m;
        nTeam ++;
        m.setProjectWorked(m.getProjectWorked()+1);
    }
    
    
    //---------------------------------------------------------
    
    
    // 5. Declare method releaseApp() here:
    // NIM : 1301154124, 
    // NAMA : Muhammad Rakha, 
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
    public void releaseApp(){
        releaseStatus = true;
    }
    //---------------------------------------------------------
    
    
    // 6. Create method toString() : String here:
    // NIM : 1301154124 
    // NAMA : Muhammad Rakha, 
    //
    // returns String that contains Project name, number of team member, 
    // and release status 
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    
    
    public String toString() {
    //------------------- your code here-----------------------
        String temp = "";
        if (releaseStatus==true) {
            temp = "Project "+projectName+ "Status is complete with team member of"+nTeam;
        }
        else {
            temp="Project "+projectName+ "Status is progress with team member of"+nTeam;
        }
        return temp;
    
    //---------------------------------------------------------
    }
}