/* RIZMA NURVIARELDA
1301144229
IF 38 09
*/

public class Member {
	private String name;
	private String specialization;
	private int totalProject=0;
	
	public Member (String name) {
		this.name = name;
	}
	
	public Member (String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setTotalProject(int x) {
		this.totalProject = x;
	}
	
	public int getTotalProject() {
		return totalProject;
	}
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public String toString() {
		return ("Member "+name+" specialized in "+specialization+" and already worked on "+totalProject+" projec(s)");
	}
}