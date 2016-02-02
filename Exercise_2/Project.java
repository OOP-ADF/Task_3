//[IF-38-09]_1301144139_I Komang Hendra Wijaya Kusuma

public class Project{
	private String projectName;
	private Member[] teamMember;
	private int nTeam=0;
	private boolean releaseStatus = false;
	
	public Project(String projectName){
		this.projectName=projectName;
		teamMember = new Member[5];
	}
	
	public void addMember(Member m){
		teamMember[nTeam] = m;
		nTeam++;
	}
	
	public boolean isReleased(){
		return releaseStatus;
		
	}
	
	public void releaseApp(){
		releaseStatus=true;
	}
	
	public String toString(){
		if(releaseStatus=true){
			return "Project "+projectName+" status is released with team member of"+nTeam;
		}
		else{
			return "Project "+projectName+" status is in progress with team member of"+nTeam;
		}
	}
}

