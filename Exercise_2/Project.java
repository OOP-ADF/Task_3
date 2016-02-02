/*
	Riksa Meidy Karim
	1301142289
	IF-38-09
*/

public class Project{
	private String projectName;
	private Member teamMember[];
	private int nTeam;
	private boolean releaseStatus;
	
	public Project(String projectName){
		this.projectName = projectName;
		teamMember = new Member[5];
		releaseStatus = false;
		nTeam = 0;
	}
	
	public void addMember(Member m){
		if(nTeam<5){
		teamMember[nTeam] = m;
		nTeam++;
		m.setProjectWorked(m.getProjectWorked() + 1);
		}
		else{
			System.out.println("Team Member is full");
		}
	}
	public boolean isReleased(){
		return releaseStatus;
	}
	public void releaseApp(){
		releaseStatus = true;
	}
	public String toString(){
		if(releaseStatus==false){
		return "Project " + projectName+ " is in progress with team member of " + Integer.toString(nTeam);
		}
		else{return "Project " + projectName+ " is already released with team member of " + Integer.toString(nTeam);}
	}
	
}
