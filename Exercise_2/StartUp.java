//[IF-38-09]_1301144139_I Komang Hendra Wijaya Kusuma

public class StartUp{
	private Member[] member= new Member[100];
	private Project[] projectList= new Project[100];
	private int nMember=0;
	private int nProject=0;
	
	public void addMember(Member m){
  	member[nMember] = m;
  	nMember++;
	}
	
	public Member getMember(int id){
  	return member[id];
	}
	
	public void createNewProject(String projectName) {
  	Project p = new Project(projectName);
  	projectList[nProject] = p;
  	nProject++;
  	}
  	
	public Project getProject(int id) {
  	return projectList[id];
	}
	
	public int getNumReleasedProject() {
  	int counter = 0;
  	for(int i=0;i<projectList.length;i++) {
  		if(projectList[i]!=null) 
 			{
 			  if(projectList[i].isReleased()) {
 			    counter++;
 			  }
 			  
 			}
  	}
  return counter;
	}
	
	public void releaseProject(Project p) {
 		p.releaseApp();
 	}

	public void setProjectMember(Project p, Member m) {
  	int a=m.getProjectWorked();
  	a++;
  	p.addMember(m);
	  m.setProjectWorked(a);
	}
}
