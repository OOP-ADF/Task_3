// Nama : Andhika Gilang K
// Kelas : IF-38-01
// NIm : 1301140361

public class StartUp {
	private Member[] member = new Member[50];
	private Project[] projectList= new Project[50];
	private int nMember = 0;
	private int nProject = 0;
	
	public void addMember (Member m) {
		member[nMember]=m;
		nMember++;
	}
	
	public Member getMember (int id) {
		return member[id];
	}
	
	public void createNewProject( String projectName) {
		Project p1 = new Project(projectName);
		projectList[nProject]=p1;
		nProject++;
	}
	
	public Project getProject(int id) {
		return projectList[id];
	}
	public void setProjectMember(Project p,Member m) {
		p.addMember(m);
	}
	public void releaseProject(Project p){
		p.releaseApp();
	}
	public int getNumReleasedProject() {
		int sum= 0;
		for (int i= 0;i<projectList.length;i++){
			if (projectList[i] != null){
				if (projectList[i].isRelease()==true){
					sum++;
				}
			}
		}
		return sum;
	}
}
