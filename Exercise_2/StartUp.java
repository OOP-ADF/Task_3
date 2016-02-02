/*
	Riksa Meidy Karim
	1301142289
	IF-38-09
*/

public class StartUp{
	private Member member[];
	private Project projectList[];
	private int nMember;
	private int nProject;
	
	public StartUp(){
		nMember = 0;
		nProject = 0;
		projectList = new Project[50];
		member = new Member[50];
	}
	
	public void addMember(Member m){
		if(nMember<50){
			member[nMember] = m;
			nMember++;
		}
		else{
			System.out.println("Member Penuh");
		}
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
	public void setProjectMember(Project p , Member m){
			p.addMember(m);
	}
	public void releaseProject(Project p){
		p.releaseApp();
	}
	public int getNumReleasedProject(){
		int temp = 0;
		for(int i=0;i<nProject;i++){
			if(projectList[i].isReleased()){
				temp++;
			}
		}
		return temp;
	}
	
	public int getMemberCount(){
		return nMember;
	}
	
	public int getProjectCount(){
		return nProject;
	}
}
