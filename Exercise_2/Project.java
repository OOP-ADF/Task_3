/* 
Nama  : Muhammad Yuslan Abubakar
NIM   : 1301141071
Kelas : IF-38-01
*/

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
		m.setProjectWorked(m.getProjectWorked()+1);
	}
	
	public boolean isReleased() {
		return releaseStatus;
	}
	
	public void releaseApp() {
		releaseStatus = true;
	}
	
	public String toString() {
		String kata = "";
		if (releaseStatus == true) {
			kata = "Project " + projectName + " status is complete with team member of " + nTeam;
		}
		else {
			kata = "Project " + projectName + " status is in progress with team member of " + nTeam;
		}
		return kata; 
	}
}
