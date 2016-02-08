public class Project {
	private String projectName;
	private Member[] teamMember = new Member[5];
	private int nTeam = 0;
	private Boolean releaseStatus = false;

	public Project(String projectName){
		this.projectName = projectName;
	}
	public void addMember(Member m){
		nTeam++;
		teamMember[nTeam] = m;
	}
	public void releaseApp() {
		releaseStatus = true;
	}
	public String toString(){
		String kalimat;
		if (releaseStatus == False){
			kalimat = "on progress";
		} else {
			kalimat = "complete";
		}
        return "Project "+projectName+" status is  "+kalimat+" with team member of"+nTeam;
    }
}