/*
Name : Erwin Yulizar F
NIM  : 1301144031
Class: IF-38-01
*/

public class Project{
	private String projectName;
	private Member[] teamMember;
	private int nTeam = 0;
	private boolean releaseStatus;
	
	public Project (String projectName){
		this.projectName = projectName;
		teamMember = new Member[5];
		releaseStatus = false;
	}
	
	public void addMember(Member m){
		teamMember[nTeam] = m;
		nTeam++;
	}
	
	public boolean isReleased(){
		return releaseStatus;
	}
	
	public void releaseApp() {
		releaseStatus = true;
	}
	
	public String toString() {
		return "Prjoect "+projectName+" status is in progress with team member of "+nTeam;
	}
}
