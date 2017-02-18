package task3exercise2;

public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301150049
    // NAMA : Aldika Wicaksono 
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    private String projectName;
    private Member[] teamMember = new Member[5];

    private boolean releaseStatus = false;

    // 2. Declare your Constructor here:
    // NIM : 1301150049 
    // NAMA : Aldika Wicaksono
    //
    private int n_Team = 0;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    // 3. Declare your Setter and Getter method here:
    // NIM : 1301150049
    // NAMA : Aldika Wicaksono 
    //
    public boolean isReleased() {
        return releaseStatus;
    }

    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301150049
    // NAMA : Aldika Wicaksono 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    public void addMember(Member m) {
        teamMember[n_Team] = m;
        n_Team++;
    }

    // 5. Declare method releaseApp() here:
    // NIM : 1301150049
    // NAMA : Aldika Wicaksono 
    //
    // set release status = true
    //
    public void releaseApp() {
        releaseStatus = true;
    }

    // 6. Create method toString() : String here:
    // NIM : 1301150049 
    // NAMA : Aldika Wicaksono
    //
    // returns String that contains Project name, number of team member, 
    // and release status 
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    public String toString() {
        if (releaseStatus == true) {
            return ("Project " + projectName + " Status is in released with team member of " + n_Team);
        } else {
            return ("Project " + projectName + " Status is in progress with team member of " + n_Team);
        }
    }
}
