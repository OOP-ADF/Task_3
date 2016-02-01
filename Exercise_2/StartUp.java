/**
 * Nama : Reza Muhammad K
 * Nim  : 1301144332
 */
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
 	public void setProjectMember(Project p, Member m){
        int i=m.getprojectWorked();
        i++;
 		p.addMember(m);
        m.setprojectWorked(i);
 	}
 	public void releaseProject(Project p){
 		p.releaseApp();
 	}
 	public int getNumReleasedProject(){
        int count = 0;
 		for(int i=0;i<projectList.length;i++){
            if(projectList[i]!=null){
                if(projectList[i].isReleased()){
                    count++;
                }
            }
        }
        return count;
 	}
}