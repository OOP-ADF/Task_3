// Name : Rizza Aulia Rahman
// Student ID : 1301144231
// Class : IF-38-01

public class Project {
	private String projectName;
	private Member[] teamMember = new Member[5];
	private int nTeam = 0;
	private boolean releaseStatus = false;
	
	public Project(String projectName) {
		this.projectName = projectName;
		releaseStatus = false;
	}
	public void addMember(Member m) {
		if (nTeam < teamMember.length) {
			teamMember[nTeam] = m;
			nTeam++;
		}
	}
	public boolean isReleased() {
		return releaseStatus;
	}
	public void releaseApp() {
		releaseStatus = true;
	}
	public String toString() {
		String stat;
		if (releaseStatus = false) {
			stat = "in progress";
		} else stat = "completed";
		String a = "Project "+projectName+" is "+stat+" with team member of "+nTeam;
		return a;
	}
}
