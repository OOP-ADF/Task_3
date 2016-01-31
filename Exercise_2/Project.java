//Hirianinda Malsegianty S.
//1301140262
//IF 38-02
public class Project {
    
    private String projectName;
	private Member[] teamMember = new Member[5];
	private int nTeam = 0;
	private boolean releaseStatus = false;
	
	public Project (String projectName) {
		this.projectName = projectName;
	}
	
	public void addMember (Member m) {
		teamMember[nTeam] = m;
		nTeam++;
	}
	
	public boolean isReleased() {
		return releaseStatus;
		
	}
	
	public void releaseApp(){
		releaseStatus = true;
		
	}
	
	public String getProjectName() {
        return projectName;
    }
	
	public int getNTeam() {
        return nTeam;
    }
	
	public String toString(){
		return String.format("Project ",getProjectName()," status is in progress with team member of ",getNTeam());
	}
}