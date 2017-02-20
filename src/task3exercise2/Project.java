package task3exercise2;

public class Project {

    // 1. Declare your private attributes here:
    // NIM : .........................., 
    // NAMA : ........................., 
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
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    //------------------- your code here-----------------------
    public Project(String projectName) {
        this.projectName = projectName;
        this.releaseStatus = false;
        this.teamMember = new Member[5];
    }

    //---------------------------------------------------------
    // 3. Declare your Setter and Getter method here:
    // NIM : ..........................,
    // NAMA : ........................., 
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

    public boolean isReleased() {
        return releaseStatus;
    }
    //---------------------------------------------------------

    // 4. Declare method addMember( m : Member ) here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
    public void addMember(Member m) {
        this.teamMember[nTeam] = m;
        nTeam++;
        m.setProjectWorked(m.getProjectWorked() + 1);
    }

    //---------------------------------------------------------
    // 5. Declare method releaseApp() here:
    // NIM : .........................., 
    // NAMA : ........................., 
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
    public void releaseApp() {
        this.releaseStatus = true;
    }

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
    //------------------- your code here-----------------------
    public String toString() {
        String x;
        if (releaseStatus == false) {
            x = "unknow";
        } else {
            x = "in progress";
        }
        String p = "Project " + projectName + " status is " + x + " with team member of " + nTeam;
        return p;

        //---------------------------------------------------------
    }
}
