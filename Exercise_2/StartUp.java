//@auth:Irfan Trianto/1301144111/IF-38-01

public class StartUp{

	//definisi atribut
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nMember = 0;
	private int nProject = 0;

	//definisi method
	public void addMember(Member m){
			member[nMember] = m;
			nMember++;
	}
	
	public Member getMember(int id){
		return member[id];
	}
	
	public void createNewProject(String projectName){
		Project project = new Project(projectName);
		projectList[nProject] = project;
		nProject++;
	}
	
	public Project getProject(int id){
		return projectList[id];
	}
	
	public void setProjectMember(Project p, Member m){
		p.addMember(m);
	}
	
	public void releaseProject(Project p){
		p.releaseApp();
	}
	
	public int getNumReleasedProject(){
		int j= 0;
		if(nProject > 0)
		{
			for(int i = 0; i < nProject; i++ )
			{
				if(getProject(i).isReleased()) j++;
			}
		}
		return j;
	}
}
