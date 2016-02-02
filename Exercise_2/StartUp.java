/* NAMA : ANGKY FAJRIATI MS MUSA
   KELAS : IF-38-01
   NIM : 1301141221
*/

public class StartUp{
	private Member[] member=new Member[50];
	private Project[] projectList=new Project[50];
	private int nMember=0;
	private int nProject=0;
	public void addMember(Member M) {
		member[nMember]=M;
		nMember++;
	}
	public Member getMember(int id) {
		return member[id];
	}
	public void createNewProject(String projectName){
		Project P=new Project(projectName);
		projectList[nProject]=P;
		nProject++;
	}
	public Project getProject(int id){
		return projectList[id];
	}
	public void setProjectMember(Project p, Member m) {
		p.addMember(m);
	}
	public void releaseProject(Project p){
		p.releaseApp();
	}
	public int getReleasedProject(){
		int jumlah = 0;
		for (int i = 0; i < projectList.length; i++) {
			if (projectList[i] != null) {
				if (projectList[i].isReleased() == true) {
					jumlah++;
				}
			}
		}
		return jumlah;
	}
	
}
