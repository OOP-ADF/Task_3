public class StartUp {
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nMember;
	private int nProject;
	private int x = 0;
	private int y = 0;
	private int z = 0;
	
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
		p.releaseApp();
	}
	
	public int getNumReleasedProject() {
		while(b<projectList.length) {
			if(projectList[y].isReleased()==true) {
				z=y+1;
				y=projectList.length;
			}
			y++;
		}
	return z;
	}
}

