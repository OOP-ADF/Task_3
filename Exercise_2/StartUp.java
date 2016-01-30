//Nama : Ubassy Abdillah
//NIM : 1301148282

public class StartUp {
	private Member[] member=new Member[50];
	private Project[] projectList=new Project[50];
	private int nMember=-1,nProject=-1;
	
	public void addMember (Member m) {
		nMember++;
		member[nMember]=m;
	}
	
	public Member getMember(int id) {
		return member[id];
	}
	
	public void createNewProject (String projectName) {
		Project p = new Project(projectName);
		nProject++;
		projectList[nProject]=p;
	}
	
	public Project getProject(int id) {
		return projectList[id];
	}
	
	public void setProjectMember(Project p, Member m) {
		p.addMember(m);
	}
	
	public void releaseProject(Project p) {
		p.releaseApp();
	}
	
	public int getNumReleasedProject(){
		int count=0;
		for (int i=0;i<=nProject;i++) {
			if (projectList[i].isReleased())
				count++;
		}
		return count;
	}
}


