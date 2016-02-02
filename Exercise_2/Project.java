//FAISHAL ABDILLAH
//1301144232
//IF-38-02
public class Project {
	private String projectName;
	private Member[] teamMember = new Member[5];
	private int nTeam = 0;
	private boolean releaseStatus = false;
	
	public Project(String projectName){
		this.projectName = projectName;
		teamMember = new Member[5];
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
	if(releaseStatus !=false) {
		System.out.print("Project "+projectName+" status is Released with team member of "+nTeam);
	}
	else 
		System.out.print("Project "+projectName+" status is in progress with team member of "+nTeam);
		
}
}
