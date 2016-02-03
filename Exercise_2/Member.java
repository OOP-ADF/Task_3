// Name : Rizza Aulia Rahman
// Student ID : 1301144231
// Class : IF-38-01

public class Member {
	private String name;
	private String specialization;
	private int projectWorked = 0;
	
	public Member(String name) {
		this.name = name;
	}
	public Member(String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSpecial(String specialization) {
		this.specialization = specialization;
	}
	public void setProjectWorked() {
		projectWorked++;
	}
	public String getName() {
		return name;
	}
	public String getSpecial() {
		return specialization;
	}
	public int getProjectWorked() {
		return projectWorked;
	}
	public String toString() {
		String a = "Member "+name+" Specialized in "+specialization+" and already worked on "+projectWorked+" project(s)";
		return a;
	}
}
