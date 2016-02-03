//Agung Suhendar_1301140279_IF 38-09

public class Project{
	private String projectName;
	private Member[] teamMember;
	private int nTeam = 0;
	private boolean releaseStatus;
	
	public Project(String projectName){
		this.projectName = projectName;
		teamMember = new Member[5];
		releaseStatus = false;
	}
	
	public void addMember(Member m){
		if (nTeam<5){
			teamMember[nTeam] = m;
			nTeam++;
		}
	}
	
	public boolean isReleased(){
		return releaseStatus;
	}
	
	public void releaseApp(){
		releaseStatus = true;
	}
	
	public String toString(){
		return "Project "+projectName+" status is in progress with team member of "+nTeam;
	}
}

