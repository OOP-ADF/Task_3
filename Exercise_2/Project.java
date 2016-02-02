// Syahrizal Hafid Rozaqi IF-38-02 1301144252

public class Project {
	private String projectName;
	private Member[] teamMember;
	private int nTeam = 0;
	private boolean releaseStatus;
	
	public Project (String projectName) {
		this.projectName = projectName;
		teamMember = new Member[5];
		releaseStatus = false;
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
        String status;
        if(releaseStatus) {
            status = "Released";
        }
        else {
            status = "in Progress";
        }
		return ("Project "+projectName+" status is "+status+" with team member of "+nTeam);
	}
}