/*
Name 	: Pima Hani Safitri
ID 		: 1301140202
Class 	: IF-38-02
*/
public class Project {
	private String projectName;
	private Member []teamMember = new Member[5];
	int nTeam = 0;
	private boolean releaseStatus = false;
	
	public Project(String projectName) {
		this.projectName = projectName;
	}
	public void addMember(Member m) {
		teamMember[nTeam] = m;
		nTeam++;
	}
	public boolean isReleased() {
		return releaseStatus;
	}
	public void releaseApp() {
		this.releaseStatus = true;
	}
	public String toString() {
		if(releaseStatus) {
			return ("Project "+projectName+" status is relased with team member of "+nTeam);
		}
		else {
			return ("Project "+projectName+" status is in progress with team member of "+nTeam);
		}
	}
}