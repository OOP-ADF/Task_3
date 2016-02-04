//Anang Kurniawan
//1301140192
//IF 38 02

public class Project{
	String projectName;
	Member[] teamMember = new Member[5];
	int nTeam = 0;
	boolean releaseStatus = false;
	
	public Project(String projectName)
	{
		this.projectName = projectName;
	}
	
	public void addMember(Member m)
	{
		teamMember[nTeam] = m;
		nTeam++;
	}
	
	public int getnTeam()
	{
		return nTeam;
	}
	
	public String getProjectName()
	{
		return projectName;
	}
	
	public boolean isReleased()
	{
		return releaseStatus;
	}
	
	public void releaseApp()
	{
		releaseStatus = true;
	}
	
	public String toString()
	{
		if (releaseStatus)
		{
			return "Project "+getProjectName()+" status is Done with team member of "+getnTeam();
		}
		else
		{
			return "Project "+getProjectName()+" status is in progress with team member of "+getnTeam();
		}
		
	}
}
