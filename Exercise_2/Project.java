/* NAMA : ANGKY FAJRIATI MS MUSA
   KELAS : IF-38-01
   NIM : 1301141221
*/

public class Project{
	private String projectName;
	private Member[] teamMember=new Member[5];
	private int nTeam=0;
	private boolean releaseStatus=false;
	
	public Project(String projectName){
		this.projectName=projectName;
	}
	
	public void addMember(Member m){
		teamMember[nTeam]=m;
		nTeam++;
		m.setProjectWorked(m.getProjectWorked()+1);
	}
	public boolean isReleased(){
		return releaseStatus;
	}
	public void releaseApp(){
		releaseStatus=true;
	}
	public String toString() {
		String n;
		if(releaseStatus==true) {
			n=("Project "+projectName+" is complete with team Member of "+nTeam);
		}
		else {
			n=("Project "+projectName+" is in progress with team Member of "+nTeam);
		}
		return n;
	}
	
}
