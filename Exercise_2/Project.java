//Sulistiyo TR 1301144329 IF-38-09

public class Project 
{
	private String namaProjek;
	private Member[] teamMember;
	private int nTeam = 0;
	private boolean statusRilis;
	
	public Project(String namaProjek) 
	{
		this.namaProjek = namaProjek;
		teamMember = new Member[5];
		statusRilis = false;
	}
	
	public void addMember(Member m) 
	{
		teamMember[nTeam] = m;
		nTeam++;
	}
	
	public boolean isReleased() 
	{
		return statusRilis;
	}
	
	public void releaseApp() 
	{
		statusRilis = true;
	}
	
	public String toString() 
	{
		String condition;
		if (statusRilis = true) 
		{
			condition = "Released";
		}
		else 
		{
			condition = "in progress"; 
		}
		return ("Project "+namaProjek+" status is "+condition+" with team member of "+nTeam);
	}
}
