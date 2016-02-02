/*
Anita Auliani
1301144349
IF-38-09
*/

public class Project {
	private String projectName;
	private Member[] teamMember;
	private int nTeam = 0;
	private boolean releaseStatus = false;
	
	public Project (String projectName) {
		this.projectName = projectName;
		teamMember = new Member[5];
	}
	
	public void addMember(Member m) {
		teamMember[nTeam] = m;
		nTeam++;
	}
	
	public boolean isReleased () {
		return releaseStatus;
	}
	
	public void releaseApp() {
		releaseStatus = true;
	}
	
	public String toString() {
        String stat;
        if(releaseStatus = true) {
            stat = "Released";
        }
        else {
            stat = "in Progress";
        }
		return ("Project "+projectName+" status is "+stat+" with team member of "+nTeam);
	
	
	}

	
}
