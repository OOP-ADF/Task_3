// Nama : Muhammad Hariz Arasy
// NIM	: 1301140259
// Kelas: IF-38-09

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
		return releaseStatus;
	}
	
	public void releaseApp() {
		releaseStatus = true;
	}
	
	public String toString() {
		String status;
		if (releaseStatus = true)
			status = "Released";
		else
			status = "in progress"; 
		return (
		"Project " + projectName +
		" status is " + status +
		" with team member of " + nTeam);
	}
}