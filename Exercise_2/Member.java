/*
  Fauzy Alfy A.
  1301144269
  IF-38-09
*/
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
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public int setProjectWorked() {
		return projectWorked;
	}
	
	public void getProjectWorked(int projectWorked) {
		this.projectWorked = projectWorked;
	}
	
	public String toString() {
		return "Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" projec(s)";
	}
}

