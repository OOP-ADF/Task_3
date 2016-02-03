public class StartUp {
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nMember;
	private int nProject;
	private int a = 0;
	private int b = 0;
	private int c = 0;
	
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
		a=m.getProjectWorked();
		a++;
		p.addMember(m);
		m.setProjectMember(a);
	}
	
	public void releaseProject(Project p) {
		p.releaseApp();
	}
	
	public int getNumReleasedProject() {
		while(b<projectList.length) {
			if(projectList[b].isReleased()==true) {
				c=b+1;
				b=projectList.length;
			}
			b++;
		}
	return c;
	}
}

