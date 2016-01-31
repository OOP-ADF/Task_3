
/*Nama : Dainty Amanda Fathurrohmi
Nim : 1301140062
Kelas : IF 38-02*/

public class Project {
	private String projectName;
	private Member[] teamMember;
	private int nTeam=0;
	private boolean releaseStatus;
	
	public Project(String projectName) {
		this.projectName=projectName;
		teamMember = new Member[5];
		releaseStatus = false;
	}
	
	public void addMember(Member m) {
		teamMember[nTeam]=m;
		nTeam++;
	}
	
	public boolean isReleaseStatus() {
		return releaseStatus;
	}
	
	public void releaseApp() {
		releaseStatus = true;
	}
	
	public String toString() {
		String status;
		if (releaseStatus=true) {
			status = "released";
		}
		else {
			status = "in progress";
		}
		return("Project "+projectName+" status is in "+status+" with team member of "+nTeam);
	}
}
