public class Project{
	private String projectName;
	private Member[] teamMember = new Member[5];
	private boolean releaseStatus = false;
	int nTeam =0;
	
	public void Project(String projectName){
		this.projectName = projectName;
	}
	
	public void addMember(Member m){
		teamMember[nTeam] =m;
		nTeam++;
	}
	
	public boolean isReleased(){
		return releaseStatus;
	}
	
	public void releaseApp(){
		releaseStatus = true;
	}
	
	public String toString(){
		if (isReleased()){
			return (projectName+"status is complete with team member of "+ nTeam);
		}else
			return (projectName+"status is in progress with team member of "+ nTeam);
	}
}

