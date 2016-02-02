//Dzakyta Afuzagani
//1301140122
//IF 38 02

public class Project {
	private String ProjectName
	private Member[] teamMember;
	private int nTeam;
	nTeam = 0;
	private boolean releaseStatus;
	releaseStatus = false;


	public Project(String ProjectName) {
		this.ProjectName = ProjectName;
		teamMember = new Member[5];
	}
	
	public void addMember(Member m) {
		teamMember[nTeam]=m;
		nTeam++;
	}
	
	public void isReleased() {
		return releaseStatus;
	}
	
	publix void releaseApp() {
		releaseStatus=true;
	}
	
	public String toString() {
		String status;
		if(releaseStatus){
			status = "Released ";
		}
		else {
			status = "In Progress";
		}
		return("Project"+projectName+" status is "+status+" with team member of "+nTeam);
	}
