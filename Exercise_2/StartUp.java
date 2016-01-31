/*
Name 	: Pima Hani Safitri
ID 		: 1301140202
Class 	: IF-38-02
*/
public class StartUp {
	Member []member = new Member[50];
	Project []projectList = new Project[50];
	int nMember;
	int nProject;
	
	public void addMember(Member m) {
		member[nMember] = m;
		nMember++;
	}
	public Member getMember(int id) {
		return member[id];
	}
	public void createNewProject(String projectName) {
		projectList[nProject] = new Project(projectName);
		nProject++;
	}
	public Project getProject(int id) {
		return projectList[id];
	}
	public void setProjectMember(Project p, Member m) {
		int i;
		i = m.getProjectWorked();
        i++;
		p.addMember(m);
        m.setProjectWorked(i);
	}
	public void releaseProject(Project p) {
		p.releaseApp();
	}
	public int getNumReleasedProject() {
		int i;
		int j =0;
		for(i=0;i<nMember+1;i++) {
			if(projectList[i].isReleased()) {
				j++;
			}
		}
		return j;
	}
}