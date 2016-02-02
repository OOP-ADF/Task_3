/*
Nama		: Zardarian Ahadika N.
NIM			: 1301140112
Kelas		: IF-38-02
*/

public class StartUp {
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nMember = 0;
	private int nProject = 0;
	
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
        int jumlahProject = m.getProjectWorked();
        jumlahProject++;
		p.addMember(m);
        m.setProjectWorked(jumlahProject);
	}
	public void releaseProject(Project p) {
		p.releaseApp();
	}
	public int getNumReleasedProject() {
        int jumlahRelease = 0;
		for(int jumlahProject=0;jumlahProject<projectList.length;jumlahProject++) {
            if(projectList[jumlahProject]!=null) {
                if(projectList[jumlahProject].isReleased()) {
                    jumlahRelease++;
                }
            }
        }
        return jumlahRelease;
	}
}

