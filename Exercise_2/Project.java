//Biyan Ilham Akbar, 1301144319, IF-38-09

 public class Project {
 	public String projectName;
 	public Member[] teamMember;
 	public int nTeam = 0;
 	public boolean releaseStatus;
 	
 	public Project(String projectName) {
 		this.projectName = projectName;
 		teamMember = new Member[5];
 		releaseStatus=false;}
 	
 	public void addMember(Member m) {
 		teamMember[nTeam]=m;
 		nTeam++;}
 	
 	public boolean isReleased() {
 		return releaseStatus;}
 	
 	public void releaseApp() {
 		releaseStatus=true;}
 	
 	public String toString() {
 		String status;
 		if (releaseStatus=true) {
 			status = "Released";
 		}
 		else {
 			status = "in progress"; 
 		}
 		return ("Project "+projectName+" status is "+status+" with team member of "+nTeam);}
 }
