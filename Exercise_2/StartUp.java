/*
Name : Erwin Yulizar F
NIM  : 1301144031
Class: IF-38-01
*/

public class StartUp{
	private Member[] member;
	private Project[] projectList;
	private int nMember = 0;
	private int nProject = 0;
	
	public void addMember(Member m){
		member[nMember] = m;
		nMember++;
	}
	
	public Member getMember (int id){
		return member[id];
	}
	
	public void createNewProject(String projectName){
		Project newProject = new Project(projectName);
		projectList[nProject] = newProject;
		nProject++;
	}
	
	public void setProjectMember(Project p, Member m){
		p.addMember(m);
	}
	
	public Project getProject(int id){
		return projectList[id];
	}
	
	public void releaseProject(Project p){
		p.releaseApp();
	}
	
	public int getNumReleasedProject(){
		return nProject;
	}
	
	public int getAllMember(){
		return nMember;
	}
	
}
