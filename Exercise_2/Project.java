//Name 		 : Mohammad Zakie Faiz Rahiemy
//Student ID : 1301144422
//Class 	 : IF-38-02

public class Project{
	private String projectName;
	private Member[] teamMember = new Member[5];
	private int nTeam = 0;
	private boolean releaseStatus = false;
	
	public Project (String projectName){
		this.projectName=projectName;
	}
	
	public void addMember (Member m){
		teamMember[nTeam]=m;
		m.addProjectWorked();
		nTeam++;
	}
	
	public boolean isReleased(){
		return releaseStatus;
	}
	
	public void releaseApp(){
		releaseStatus=true;
	}
	
	public String toString(){
		String status;
		if (releaseStatus)
			status="released";
		else
			status="in progress";
		return "Project "+projectName+" status is "+status+" with team member of "+nTeam;
	}
}
