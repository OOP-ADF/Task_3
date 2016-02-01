//Muhammad Andika
//1301140145
//IF 38-09

public class StartUp{
	private Member[] member = new Member[100];
	private Project[] projectList = new Project[100];
	private int nMember = 0;
	private int nProject = 0;

	public void addMember(Member m){
		if(nMember < member.length){
			member[nMember] = m;
			nMember++;
		}
	}
	
	public Member getMember(int id){
		return member[id - 1];
	}
	
	public void createNewProject(String projectName){
		Project project = new Project(projectName);

		if(nProject < projectList.length){
			projectList[nProject] = project;
			nProject++;
		}
	}
	
	public Project getProject(int id){
		return projectList[id - 1];
	}
	
	public void setProjectMember(Project p, Member m){
		p.addMember(m);
	}
	
	public void releaseProject(Project p){
		p.releaseApp();
	}
	
	public int getNumReleasedProject(){
		int count = 0;
		int result = 0;
		while(count < projectList.length){
			if(projectList[count].isReleased() == true){
				result = count + 1;
				count = projectList.length;
			}
			count++;
		}

		return result;
	}
}
	