//FAISHAL ABDILLAH
//1301144232
//IF-38-02
public class StartUp {
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nMember;
	private int nProject;
	int x = 0;
	int y = 0;
		
	public void addMember(Member m) {
		member[nMember] = m;
		nMember++;
	}
		public Member getMember(int id) {
		return member[id];
	}
		public String createNewProject(String projectName) {
		projectList[nProject] = new projectName[projectList];
		nProject++;
	}
	public Project getProject(int id) {
		return projectList[id];
	}
	public void setProjectMember(Project p, Member m) {
		x=m.getProjectWorked();
		x++;
		p.addMember(m);
		m.setProjectMember(x);
	}
		public void releaseProject(Project p) {
		p.releaseapp();
	}
		public int getNumReleasedProject() {
			for(int i=0;i<projectList.length;i++)
				if(projectList[i].isReleased !=false){
					y++
				}
		
		}return y;
}


