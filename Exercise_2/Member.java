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
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSpecialization(String s) {
		specialization = s;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public void setProjectWorked(int p) {
		projectWorked = p;
	}
	
	public int getProjectWorked() {
		return projectWorked;
	}
	
	public String toString() {
		return ("Member "+getName()+" specialized in "+getSpecialization()+" and already worked on "+getProjectWorked()+" project(s)");
	}
}
