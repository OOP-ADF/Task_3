//Vicha Octavia Tama_1301144209_IF-38-09
  
 public class StartUp {
 	private Member[] member = new Member[50];
 	private Project[] projectList = new Project[50];
 	private int nMember = 0;
 	private int nProject = 0;
 	
 	public void addMember(Member mm) 
	{
 		member[nMember] = mm;
         nMember++;
 	}
 	public Member getMember(int id) 
	{
 		return member[id];
 	}
	public void createNewProject(String projectName) 
	{
 		Project p = new Project(projectName);
 		projectList[nProject] = p;
 		nProject++;
 	}
 	public Project getProject(int id) 
	{
 		return projectList[id];
 	}
 	public void setProjectMember(Project p, Member m) 
	{
         int pm;
		 pm= m.getprojectWorked();
         pm++;
		 p.addMember(m);
         m.setprojectWorked(pm);
 	}
	
 	public void releaseProject(Project p) 
	{
 		p.releaseApp();
 	}
 	public int getNumReleasedProject() 
	{
		int jumlah;
		jumlah=0;
		int i;
		i=0;
		while(projectList[i] !=null)
		{
			if(projectList[i].isReleased())
			{
				jumlah++;
			}
			i++;
		}
		return jumlah;
	}
 }
