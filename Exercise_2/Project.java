//Aliya Nur Rezkita (1301144161)
//IF-38-01

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
		String x;
        if (releaseStatus = true) {
            x = "released";
        } else {
            x = "progress";
        }
        return "Project " + projectName + " status is in " + x + " with team member of " + nTeam;
    }
}
