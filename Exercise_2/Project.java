/* RIZMA NURVIARELDA
1301144229
IF 38 09
*/

public class Project {
	private String projectName;
	private Member[] teamMember;
	private int i = 0;
	private boolean releaseStatus;
	
	public Project(String x) {
		this.projectName = x;
		teamMember = new Member[5];
		releaseStatus = false;
	}
	
	public void addMember(Member m) {
		teamMember[i] = m;
		i++;
	}
	
	public boolean isReleased() {
		return releaseStatus;
	}
	
	public void releaseApp() {
		releaseStatus = true;
	}
	
	public String toString() 
	{
		String condition;
		if (releaseStatus = true) 
		{
			condition = "Released";
		}
		else 
		{
			condition = "in progress"; 
		}
		return "Project "+projectName+" status is "+condition+" with team member of " +i;
	}
}
