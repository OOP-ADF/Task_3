/*
Name 	: Pima Hani Safitri
ID 		: 1301140202
Class 	: IF-38-02
*/
public class Member {
	String name;
	String specialization;
	int projectWorked = 0;
	
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
	public String getName() {
		return name;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setProjectWorked(int projectWorked) {
		this.projectWorked = projectWorked;
	}
	public int getProjectWorked() {
		return projectWorked;
	}
	public String toString() {
		return("Member "+name+" specialized in "+specialization+" and already worled on "+projectWorked+" project(s)");
	}
}