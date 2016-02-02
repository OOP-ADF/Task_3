/*Nama: Adam Geraldy Katab
Kelas: IF-38-01
NIM: 1301140381*/

public class Project {
	private String projectName;
	private Member[] teamMember;
	private int nTeam;
	private boolean releaseStatus;
	
	public Project(String projectName) {
		this.projectName = projectName;
		teamMember = new Member[5];
		nTeam = 0;
		releaseStatus = false;
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
		return "Project "+ projectName + (releaseStatus? " is released": " is in progress")+ 
				" with team member of "+ nTeam;
	}
}