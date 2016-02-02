//Nama		: Febby Febriansyah
//NIM		: 1301140371
//Kelas		: IF-38-01

public class Project{
	private String projectName;
	private Member[] teamMember;
	private int nTeam = 0;
	private boolean releaseStatus;
	
	public Project(String projectName){
		this.projectName = projectName;
		this.teamMember = new Member[5];
		this.releaseStatus = false; 
	}
	public void addMember(Member m){
		teamMember[nTeam] = m;
		nTeam++;
	}
	public boolean isReleased(){
		return releaseStatus;
	}
	public void releaseApp(){
		this.releaseStatus = true;
	}
	public String toString(){
		return "Project "+projectName+" status is "+releaseStatus+" with team member of "+nTeam;
	}
}
