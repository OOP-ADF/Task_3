//Nama : Tari Lestari
//Kelas: IF-38-01
//NIM  : 1301144281

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
