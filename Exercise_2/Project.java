// SELVI WIDYAPRADITIA PANGESTI, 1301144041, IF3801

public class Project {

    private String projectName;
    private Member[] teamMember = new Member[5];
    private int nTeam = 0;
    private boolean releaseStatus = false;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public void addMember(Member m) {
        teamMember[nTeam] = m;
        nTeam++;
    }

    public boolean isReleased() {
        return true;
    }

    public void releaseApp() {
        releaseStatus = true;
    }

    public String toString() {
        String s;
        if (releaseStatus = true) {
            s = "released";
        } else {
            s = "progress";
        }
        return "Project " + projectName + " status is in " + s + " with team member of " + nTeam;
    }
}
