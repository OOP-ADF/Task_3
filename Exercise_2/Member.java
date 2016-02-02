/*Nama	: Windy Israniati Jihan
NIM		: 1301144309
Kelas	: IF-38-09 */

public class Member {
	private String name;
	private String specialization;
	private int projectWorked = 0;
	
	public void Member(String name) {
		this.name = name;
	}
	public void Member(String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
	}
	public void setName (String name) {
		this.name = name;
	}
	public void setProjectWorked(){
		this.projectWorked = projectWorked;
	}
	public String getName(){
		return name;
	}
	public int getProjectWorked(){
		return projectWorked;
	}
	public String toString() {
		return "Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" projec(s)" ;
	}
}

