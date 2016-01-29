//Agung Rahmat Budiman
//1301144142
//IF-38-02

public class Project {
	private String projectName;
	private Member[] teamMember = new Member[5];
	private int nTeam = 0;
	private boolean releaseStatus = false;
	
	public Project (String projectName) {
		this.projectName = projectName;
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
            status = "Progress";
        }
        else {
            status = "Closed";
        }
		return ("Project "+projectName+" status is in "+status+" with team member of "+nTeam);
	}
}
