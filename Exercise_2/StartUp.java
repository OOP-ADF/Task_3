// Name : Rizza Aulia Rahman
// Student ID : 1301144231
// Class : IF-38-01

public class StartUp {
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nMember;
	private int nProject;
	
	public void addMember(Member m) {
		if (nMember < member.length) {
			member[nMember] = m;
			nMember++;
		}
	}
	public Member getMember(int id) {
		return member[id];
	}
	public void createNewProject(String projectName) {
		Project proj = new Project(projectName);
		if (nProject < projectList.length) {
			projectList[nProject] = proj;
			nProject++;
		}
	}
	public void setProjectMember(Project p, Member m) {
		p.addMember(m);
	}
	public Project getProject(int id) {
		return projectList[id];
	}
	public void releaseProject(Project p) {
		p.releaseApp();
	}
	public int getNumReleasedProject() {
		int count = 0;
		for (int i = 0; i < nProject; i++){
			if (projectList[i].isReleased()) {
				count++;
			}
		}
		return count;
	}
	public int getNMember() {
		return nMember;
	}
	public int getNProject() {
		return nProject;
	}
}
