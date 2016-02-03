/*
Name : Amalya Citra Pradana
Student ID : 1301140389
Class : IF-38-\09
*/

public class StartUp{
	private Member member[] = new Member[50];
	private Project projectList[] = new Project[50];
	private int nMember = 0;
	private int nProject = 0;
	private int numReleasedProject = 0;
	
	public void addMember(Member m){
		member[nMember]= m;
		nMember++;
	}
	
	public Member getMember(int id){
		return member[id];
	}
	
	public void createNewProject(String projectName){
		Project pro = new Project(projectName);
		projectList[nProject] = pro;
		nProject++;
	}
	
	public Project getProject(int id){
		return projectList[id];
	}
	
	public void setProjectMember (Project p, Member m){
		p.addMember(m);
	}
	
	public void releaseProject (Project p){
		p.releaseApp();
		numReleasedProject++;
	}
	
	public int getNumReleasedProject(){
		return numReleasedProject;
	}
}