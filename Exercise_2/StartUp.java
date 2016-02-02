//Aliya Nur Rezkita(1301144161)
//IF-38-01

public class StartUp{
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nMember;
	private int nProject;
	
	public void addMember(Member m){
		member[nMember] = m;
        nMember++;
	}
	
	public Member getMember(int id){
		return member[id];
	}
	
	public void createNewProject(String projectName){
		Project p = new Project(projectName);
        projectList[nProject] = p;
        nProject++;
	}
	
	public Project getProject(int id){
		return projectList[id];
	}
	
	public void setProjectMember(Project p, Member m){
		int a = m.getProjectWorked();      
        p.addMember(m);        
        m.setProjectWorked(a);
	}
	
	public void releaseProject(Project p){
		p.releaseApp();
	}
	
	public int getNumReleasedProject(){
		return nProject;
	}
}
