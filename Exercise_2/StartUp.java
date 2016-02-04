//Anang Kurniawan
//1301140192
//IF 38 02

public class StartUp{
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nMember = 0;
	private int nProject = 0;
	
	public void addMember(Member m)
	{
		member[nMember] = m;
		nMember++;
	}
	
	public Member getMember(int id)
	{
		return member[id];
	}
	
	public void createNewProject(String projectName)
	{
		Project project = new Project(projectName);
		projectList[nProject] = project;
		nProject++;
	}
	
	public Project getProject(int id)
	{
		return projectList[id];
	}
	
	public void setProjectMember(Project p, Member m)
	{
		p.addMember(m);
	}
	
	public void releaseProject(Project p)
	{
		p.releaseApp();
	}
	
	public int getNumReleasedProject()
	{
		int i = 0;
		int count = 0;
		while (i<=50)
		{
			if (getProject(i).releaseStatus)
			{
				count++;
			}
		}
		return count;
	}
}
