//Dzakyta Afuzagani
//1301140122
//IF 38 02

public class StartUp {
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nMember=0;
	private int nProject=0;
	;
	
	public void addMember (Member m){
			member[nMember]=m;
			nMember++;
	}
	
	public Member getMember(int id){
		return member[id];
	}
	
	public void createNewProject( String projectName ){
		project pro = new Project(projectName);
		projectList[nProject]=pro;
		nProject++;
	}
	
	public Project getProject(int id){
		return projectList[id];
	}
	public void setProjectMember(Project pro, Member m){
		pro.addMember(m);
	}
	
	public void releaseProject(Project pro){
		pro.releaseApp();
	}
	
	public int getNumReleasedProject(){
		int itung;
		itung = 0;
		
		for (int i;i<=nProject;i++){
				if (projectList[i].isReleased())
					itung++;
		}
		return itung;
		
		
	}
}
