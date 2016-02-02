/*Nama	: Windy Israniati Jihan
NIM		: 1301144309
Kelas	: IF-38-09 */

public class Project {
	private String projectName;
	private Member[] teamMember = new Member[5];
	private int nTeam = 0;
	private boolean releaseStatus = false;
	
	public void Project (String projectName) {
		this.projectName=projectName;
	}
	public void addMember(Member m) {
		teamMember[nTeam] = m;
		nTeam=nTeam+1;
	}
	public boolean isReleased(){
		return releaseStatus;
	}
	public void releaseApp(){
		releaseStatus = true;
	}
	public String toString(){
		if (releaseStatus=true){
			System.out.println ("Project "+projectName+" status is release with team member of"+nTeam);
		}
		else {
			System.out.println ("Project "+projectName+" status is in progress with team member of"+nTeam) ;
	}
}
}
