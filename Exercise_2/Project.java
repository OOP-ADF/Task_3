/*
*name  : I Putu Prima Ananda
*class : IF-38-01
*NIM   : 1301144291
*/

public class Project {
	private String projectName;
	private Member[] teamMember = new Member[5];
	private int nTeam = 0;
	private boolean releaseStatus = false;
	
	public Project(String projectName) {
		Member[] m = new Member[5];
		this.projectName = projectName;
		releaseStatus = false;
	}
	public void addMember(Member m) {
		if (nTeam < teamMember.length) {
			teamMember[nTeam] = m;
			nTeam = nTeam +1;
		}
	}
	public boolean isReleased() {
		return releaseStatus;
	}
	public void releaseApp() {
		releaseStatus = true;
	}
	public String releaseCheck(){
		if(releaseStatus = true){
			return "completed";
		}else{
			return "in progress";
		}
	}
	public String toString() {
		return "Project "+projectName+" is "+releaseCheck()+" with team member of "+nTeam;
	}
}
