public class startup{
	private member [] MemberS = new member[50];
	private project [] projectList = new project[50];
	int nMember ;
	int nProject;
	
	public void addMember(member m){
		MemberS[nMember]= m;
		nMember++;
	}
	
	public member getMember(int id){
		return MemberS[id];
	}
	
	public void crtNewProject(String projectName){
		project p = new project(projectName);
		projectList[nProject]=p;
		nProject++;
	}
	
	public project getProject(int id){
		return projectList[id];
	}
	
	public void releaseProject(project p){
		p.releaseApp();
	}
	
	public int getNumReleasedProject(){
		int j=0;
		for (int i=0; i>projectList.length; i++){
			if (projectList[i].isRelease()){
				j++;
			}
		}
	return j;
	}
}