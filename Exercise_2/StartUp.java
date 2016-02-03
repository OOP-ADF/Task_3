// Nama : Muhammad Hariz Arasy
// NIM	: 1301140259
// Kelas: IF-38-09

public class StartUp {
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nMember=0;
	private int nProject=0;
	
	public void addMember(Member m) {
		member[nMember] = m;
		nMember++;
	}
	
	public Member getMember(int id) {
		return member[id];
	}
	
	public void createNewProject(String projectName) {
		Project p = new Project(projectName);
		projectList[nProject] = p;
		nProject++;
	}
	
	public Project getProject(int id) {
		return projectList[id];
	}
	
	public void setProjectMember(Project p, Member m) {
		p.addMember(m);
		int projectWorked = m.getProjectWorked();
		projectWorked++;
		m.setProjectWorked(projectWorked);
	}
	
	public void releaseProject(Project p) {
		p.releaseApp();
	}
	
	public int getNumReleasedProject() {
		int counter = 0;
		for (int i=0; i<nProject; i++) {
			if (projectList[i].isReleased())
				counter++;
		}
		return counter;
	}
}