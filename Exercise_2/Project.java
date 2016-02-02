/*
* Name : Dede Kiswanto
* Class : IF-38-01
* NIM : 1301140171
* Status : Compiled
*/


public class Project {

	private String projectName;
	private Member[] teamMember;
	private int nTeam = 0;
	private boolean releaseStatus;

	public Project(String projectName) {
		this.projectName = projectName;
		teamMember = new Member[5];
		releaseStatus = false;
	} 

	public void addMember(Member m) {
		teamMember[nTeam] = m;
		nTeam++;
		m.addProjectWorked();
	}

	public boolean isReleased() {
		return releaseStatus;
	}

	public void releaseApp() {
		releaseStatus = true;
	}

	public String toString() {
		if(isReleased())
			return "Project " + projectName + " status has been completed with team member of " + nTeam;
		else
		 	return "Project " + projectName + " status is in progress with team member of " + nTeam;
	}

}
