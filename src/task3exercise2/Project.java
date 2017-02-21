package task3exercise2;
public class Project {

    // 1. Declare your private attributes here:
    // NIM : 1301150021
    // NAMA : HENDRIK CHRISTIAN JANIFER SIMANJUNTAK
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
    // NIM : 1301150021
    // NAMA : HENDRIK CHRISTIAN JANIFER SIMANJUNTAK
    //
    //------------------- your code here-----------------------
        public Project(String projectName) {
            this.projectName = projectName;
        }
    //---------------------------------------------------------

    // 3. Declare your Setter and Getter method here:
    // NIM : 1301150021
    // NAMA : HENDRIK CHRISTIAN JANIFER SIMANJUNTAK
    //
    //------------------- your code here-----------------------
        public boolean isReleased() {
            return releaseStatus;
        }
    //---------------------------------------------------------

    // 4. Declare method addMember( m : Member ) here:
    // NIM : 1301150021
    // NAMA : HENDRIK CHRISTIAN JANIFER SIMANJUNTAK
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
        public void addMember(Member m) {
            teamMember[nTeam] = m;
            nTeam++;
        }
    //---------------------------------------------------------

    // 5. Declare method releaseApp() here:
    // NIM : 1301150021
    // NAMA : HENDRIK CHRISTIAN JANIFER SIMANJUNTAK
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
        public void releaseApp() {
            releaseStatus = true;
        }
    //---------------------------------------------------------

    // 6. Create method toString() : String here:
    // NIM : 1301150021
    // NAMA : HENDRIK CHRISTIAN JANIFER SIMANJUNTAK
    //
    // returns String that contains Project name, number of team member,
    // and release status
    //
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    //------------------- your code here-----------------------
        public String toString() {
            if(releaseStatus == true) {
                return ("Project " + projectName + " status is in released with team member of " + nTeam);
            }
            else {
                return ("Project " + projectName + " status is in progress with team member of " + nTeam);
            }
        }
    //---------------------------------------------------------
}
