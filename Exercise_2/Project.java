/*
Name : Amalya Citra Pradana
Student ID : 1301140389
Class : IF-38-09
*/

public class Project{
	private String projectName;
	private Member teamMember[];
	private int nTeam = 0;
	private boolean releaseStatus = false;
	
	public Project (String projectName){
		teamMember = new Member[5];
	}
	
	public void setProjectName(String projectName){
		this.projectName = projectName;
	}
	
	public void addMember (Member m){
		teamMember[nTeam]= m;
		nTeam++;
	}
	
	public void releaseApp(){
		releaseStatus = true;
	}
	
	public boolean isReleased(){
		return releaseStatus;
	}
	
	public String toString (){
		if (releaseStatus==true)
			{return "Project "+projectName +" status is Released with team member of "+ Integer.toString(nTeam);}
		else 
			{return "Project "+projectName +" status is in progress with team member of "+ Integer.toString(nTeam);}	
	}
}

