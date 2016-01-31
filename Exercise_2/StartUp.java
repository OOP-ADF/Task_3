//Name 		 : Mohammad Zakie Faiz Rahiemy
//Student ID : 1301144422
//Class 	 : IF-38-02

public class StartUp{
	private Member[] member=new Member[50];
	private Project[] projectList=new Project[50];
	private int nMember = 0;
	private int nProject = 0;
	
	public void addMember (Member m){
		member[nMember]=m;
		nMember++;
	}
	
	public Member getMember(int id){
		return member[id];
	}
	
	public void createNewProject (String projectName){
		Project p = new Project(projectName);
		projectList[nProject]=p;
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
		int count = 0;
		for (int i=0;i<nProject;i++) {
			if (projectList[i].isReleased())
				count++;
		}
		return count;
	}
	
	public int getNMember (){
		return nMember;
	}
	
	public int getNProject (){
		return nProject;
	}
}
