/*
I Nyoman Tri Budhi Palantra
1301140089
IF-38-09
*/

public class StartUp {
	private Member[] member = new Member[100];
	private Project[] projectList = new Project[100];
	private int nMember=0;
	private int nProject=0;
	
	public void createNewProject(String ProjectName) {
		Project p=new Project(ProjectName);
		projectList[nProject]=p;
		nProject++;
	}
	
	public int getNumReleasedProject() {
		int count=0,i=0;
		while (projectList[i] != null) {
			if (projectList[i].isReleased()) {
				count++;
			}
			i++;
		}
		return count;
	}
	
	public void setProjectMember(Project p, Member m) {
		int proWork= m.getProjectWorked();
		proWork++;
		p.addMember(m);
		m.setProjectWorked(proWork);
	}
	
	public void addMember(Member m) {
		member[nMember]=m; 
		nMember++;
	}
	
	public Member getMember(int id) {
		return member[id];
	}
	
	public Project getProject(int id){
		return projectList[id];
	}
	
	public void  releaseProject(Project p) {
		p.releaseApp();
	}
}
