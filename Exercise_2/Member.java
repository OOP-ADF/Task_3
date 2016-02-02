/*
* Name : Dede Kiswanto
* Class : IF-38-01
* NIM : 1301140171
* Status : Compiled
*/


public class Member {

	private String name;
	private String specialization;
	private int projectWorked = 0;

	public Member(String name) {
		this.name = name;
	}

	//Overload Constructor
	public Member(String name, String specialization){
		this.name = name;
		this.specialization = specialization;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpecialization(String specialization){
		this.specialization = specialization;
	}

	public String getName() {
		return name;
	}

	public String getSpecialization() {
		return this.specialization;
	}

	public void addProjectWorked() {
		projectWorked++;
	}

	public int getProjectWorked() {
		return projectWorked;
	}

	public String toString() {
		return "Member " + getName() + " specialized in " + getSpecialization() + " and already worked on " + getProjectWorked() + " project(s)"; 
	}

}
