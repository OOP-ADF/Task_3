//Name : Luthfi Fauzani Ahmad
//NIM  : 130140029
//Class: IF-38-09

public class StartUp {
 	private Member[] member = new Member[50];
 	private Project[] projectList = new Project[50];
 	private int nMember = 0;
 	private int nProject = 0;
 
 	public void addMember(Member m) {
 		if(nMember < member.length) {
 			member[nMember] = m;
 			nMember++;
 		}
 		else {
 			System.out.println("Member list is Full!");
 		}
 	}
 
 	public Member getMember(int id) {
 		return member[id - 1];
 	}
 
 	public void createNewProject(String projectName) {
 		Project project = new Project(projectName);

 		if(nProject < projectList.length) {
 			projectList[nProject] = project;
 			nProject++;
 		}
 		else {
 			System.out.println("Project list is Full!");
 		}
 	}
 
 	public Project getProject(int id) {
 		return projectList[id - 1];
 	}
 
 	public void setProjectMember(Project p, Member m) {
 		p.addMember(m);
 	}
 
 	public void releaseProject(Project p) {
 		p.releaseApp();
 	}
 
 	public int getNumReleasedProject() {
 		int flag = 0;
 		int result = 0;
 		while(flag < projectList.length) {
 			if(projectList[flag].isReleased() == true) {
 				result = flag + 1;
 				flag = projectList.length;
 			}
 			flag++;
 		}
 
 		return result;
 	}
 }

