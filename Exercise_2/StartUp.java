//Agung Suhendar_1301140279_IF 38-09

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
		Project temp = new Project(projectName);
		projectList[nProject] = temp;
		nProject++;
	}
	
	public Project getProject(int id){
		return projectList[id];
	}
	
	public void releaseProject(Project p){
		p.releaseApp();
	}
	
	public int getNumReleasedProject(){
		int n=0;
		int i=0;
		while (projectList[i] != null) {
			if (projectList[i].isReleased()) {
				n++;
			}
			i++;
		}
		return n;
	}

	public void setProjectMember(Project p, Member m){
		int n = m.getProjectWorked();
		n++;
		p.addMember(m);
		m.setProjectWorked(n);
	}
}

