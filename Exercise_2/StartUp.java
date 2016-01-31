/*Nama : Dainty Amanda Fathurrohmi
Nim : 1301140062
Kelas : IF 38-02*/

public class StartUp {
	private Member[] member = new Member[100];
	private Project[] projectList = new Project[100];
	private int nMember=0;
	private int nProject=0;
	
	public void addMember(Member m) {
		member[nMember]=m;
		nMember++;
	}
	
	public Member getMember(int id) {
		return member[id];
	}
	
	public void createNewProject(String projectName) {
		Project p = new Project(projectName);
		projectList[nProject]=p;
		nProject++;
	}
	
	public Project getProject(int id) {
		return projectList[id];
	}
	
	public void releaseProject(Project p) {
		p.releaseApp();
	}
	
	public int getNumReleasedProject() {
		int count=0;
		int i=0;
		while (projectList[i]!=null) {
			if (projectList[i].isReleaseStatus()) {
 			count++;
			}
			i++;
		}
		return count;
	}
	
	 public void setProjectMember(Project p, Member m) {
		int pWorked= m.getProjectWorked();
		pWorked++;
		p.addMember(m);
		m.setProjectWorked(pWorked);
	}
}
