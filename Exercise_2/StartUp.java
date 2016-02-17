//Biyan Ilham Akbar, 1301144319, IF-38-09

 public class StartUp {
 	public Member[] member = new Member[100];
 	public Project[] projectList = new Project[100];
 	public int nMember=0;
 	public int nProject=0;
 	
 	public void addMember(Member m) {
 		member[nMember]=m; 
 		nMember++;} 
 	
 	public Member getMember(int id) {
 		return member[id];}
 	
 	public void createNewProject(String ProjectName) {
 		Project p=new Project(ProjectName);
 		projectList[nProject]=p;
 		nProject++;}
 	
 	public Project getProject(int id){
 		return projectList[id];}
 	
 	public void  releaseProject(Project p) {
 		p.releaseApp();}
 	
 	public int getNumReleasedProject() {
 		int count;
 		int i=0;
 		count=0;
 		while (projectList[i] != null) {
 			if (projectList[i].isReleased()) {
 				count++;
 			}
 			i++;
 		}
 		return count;}
 
 	public void setProjectMember(Project p, Member m) {
 		int proWork= m.getProjectWorked();
 		proWork++;
 		p.addMember(m);
 		m.setProjectWorked(proWork);}
 }
