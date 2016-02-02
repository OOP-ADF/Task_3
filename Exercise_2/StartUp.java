//Nama		: Febby Febriansyah
//NIM		: 1301140371
//Kelas		: IF-38-01

public class StartUp{
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nMember;
	private int nProject;
	
	public void addMember(Member m){
		member[nMember] = m;
		nMember++;
	}
	public Member getMember(int id){
		return member[id];
	}
	public void createNewProject(String projectName){
		projectList[nProject] = new Project(projectName);
		nProject++;
	}
	public Project getProject(int id){
		return projectList[id];
	}
	public void setProjectMember(Project p,Member m){
		int temp = m.getProjectWorked();
		p.addMember(m);
		m.setProjectWorked(temp);
	}
	public void releaseProject(Project p){
		p.releaseApp();
	}
	public int getNumReleasedProject(){
		int num=0;
		int i=0;
		do{
			if(projectList[i].isReleased()){
				num++;
			}
			i++;
		}while(projectList[i] != null);
		return num;
	}
}
