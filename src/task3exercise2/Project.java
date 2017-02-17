package task3exercise2;


public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301154530 
    // NAMA : Nurul Evawani 
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

    public Project(String projectName) {
        this.projectName = projectName;
    }

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
    
    public void addMember(Member m) {
        nTeam++;
        teamMember[nTeam]= m;
    }
    
    public void releaseApp () {
        releaseStatus = true;
    }
    
    public String toString () {
        String kalimat;
        if (releaseStatus == false ) {
            kalimat = "on progress";
        }
        else {
            kalimat = "complete";
        }
    return "Project "+projectName+" status is "+kalimat+ "with team member of"+nTeam;
    }
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    
    
    // 5. Declare method releaseApp() here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
    
    //---------------------------------------------------------
    
    
    // 6. Create method toString() : String here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    // returns String that contains Project name, number of team member, 
    // and release status 
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    public String toString() {
    //------------------- your code here-----------------------
        return null;
    
    //---------------------------------------------------------
    }
}