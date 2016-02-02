/*Nama	: Windy Israniati Jihan
NIM		: 1301144309
Kelas	: IF-38-09 */

public class StartUp {
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nMember=0;
	private int nProject=0;
	
	public void addMember(Member m) {
		member[nMember] = m;
		nMember=nMember+1;
	}
	public Member getMember(int id) {
		return member[id];
	}
	public void createNewProject(String projectName) {
		Project pro = new Project();
		projectList[nProject] = pro;
		nProject=nProject+1;
	}
	public Project getProject(int id) {
		return projectList[id];
	}
	public void setProjectMember(Project p, Member m) {
		int projectmember;
		projectmember = m.getProjectWorked;
		projectmember=projectmember+1;
		p.addMember(m);
		m.setProjectWorked(projectmember);
	}
	public void releaseProject(Project p){
		p.releaseApp();
	}
	public int getNumReleasedProject(){
		int jml=0;
		int r=0;
		while (projectList[i]!=null) {
			if(projectList[i].isReleased()) {
				jml=jml+1;
			}
			r=r+1;
		}
		return jml;
	}
}

