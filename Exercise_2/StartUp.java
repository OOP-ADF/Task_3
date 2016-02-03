public class StartUp{
	private Member[] member = new Member[100];
	private Project[] projectList = new Project[100];
	private int nMember =0;
	private int nProject =0;
	
	public void addMember(Member m){
		member[nMember] = m;
		nMember++;
	}
	
	public Member getMember(int id){
		return member[id];
	}
	
	public void createNewProject(String projectName){
		Project project = new Project(projectName);
		projectList[nProject]= project;
		nProject++;
	}
	
	
	public Project getProject(int id){
		return projectList[id];
	}
	
	public void setProjectMember(Project p, Member m){
		p.addMember(m);
	}
	
	public void releaseProject(Project p){
		p.releaseApp();
	}
	
	public int getNumReleasedProject(){
		int nReleased = 0;
		if(nProject>0){
		for (int i=0; i<nProject;i++){
			if(projectList[i].isReleased()){
				nReleased = nReleased+1;
			}
		}
		}		
		return nReleased;
	}
}


