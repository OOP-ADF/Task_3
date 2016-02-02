/*Nama: Adam Geraldy Katab
Kelas: IF-38-01
NIM: 1301140381*/

public class StartUp {
	private Member[] member;
	private Project[] projectList;
	private int nMember;
	private int nProject;
	
	public StartUp() {
		member = new Member[50];
		projectList = new Project[50];
		nMember = 0;
		nProject = 0;
	}
	
	public void addMember(Member m) {
		member[nMember] = m;
		nMember++;
	}
	
	public Member getMember(int id) {
		return member[id];
	}
	
	public Member[] getMemberList() {
		return member;
	}
	
	public void createNewProject(String projectName) {
		Project new_project = new Project(projectName);
		projectList[nProject] = new_project;
		nProject++;
	}
	
	public Project getProject(int id) {
		return projectList[id];
	}
	
	public Project[] getProjectList() {
		return projectList;
	}
	
	public void setProjectMember(Project p, Member m) {
		p.addMember(m);
		m.setProjectWorked(m.getProjectWorked()+1);
	}
	
	public void releaseProject(Project p) {
		p.releaseApp();
	}

	public int getNumReleasedProject() {
		int count_released = 0;
		for(Project proj: projectList) {
			if(proj != null) {
				if(proj.isReleased()) count_released++;
			}
		}
		return count_released;
	}
}
