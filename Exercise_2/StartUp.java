/* RIZMA NURVIARELDA
1301144229
IF 38 09
*/

public class StartUp 
{
	private Member[] m = new Member[100];
	private Project[] p = new Project[100];
	private int iMember=0;
	private int iProject=0;
	
	public void addMember(Member x) {
		m[iMember] = x; 
		iMember++;
	} 
	
	public Member getMember(int id) {
		return m[id];
	}
	
	public void createNewProject(String ProjectName) {
		Project q = new Project(ProjectName);
		p[iProject] = q;
		iProject++;
	}
	
	public Project getProject(int id) {
		return p[id];
	}
	
	public void setProjectMember(Project x, Member y) {
		int tp = y.getTotalProject();
		tp++;
		x.addMember(y);
		y.setTotalProject(tp);
	}
	
	public void  releaseProject(Project z) {
		z.releaseApp();
	}
	
	public int getNumberReleasedProject() {
		int jumlah = 0;
		int i = 0;

		while (p[i] != null) {
			if (p[i].isReleased()) {
				jumlah++;
			}
			i++;
		}
		return jumlah;
	}
}