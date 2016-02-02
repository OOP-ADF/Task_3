
/* Thoriq Abdul Aziz
	1301144341
	IF-38-01
*/
public class Project {
	private String projectName;
	private Member[] teamMember = new Member[5];
	private int nTeam = 0;
	private boolean releaseStatus = false;
	
	public Project(String projectName){
		this.projectName = projectName;
		teamMember = new Member[5];
		releaseStatus = false;
	}
	
	public void addMember(Member m){
		if(nTeam<teamMember.length){
			teamMember[nTeam] = m;
			nTeam++;
		}
		else{
			System.out.println("full array");
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
