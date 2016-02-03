// Rana Renes Rengga-1301144351 (IF-38-01)

public class Project
{
	private String projectName;
	private Member teamMember[] = new Member[5];
	private int nTeam = 0;
	private boolean releaseStatus = false;

	public Project(String projectName)
	{
		this.projectName = projectName;
	}

	public void addMember(Member m)
	{
		teamMember[nTeam] = m;
		nTeam++;
	}

	public boolean releaseApp()
	{
		releaseStatus = true;
		return releaseStatus;
	}
	public boolean isReleased()
	{
		return releaseStatus;
	}

	public String toString()
	{
		return ("Project " + projectName + " status is in progress with team member of " + nTeam);
	}
}