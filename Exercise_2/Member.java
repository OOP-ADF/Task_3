/*Nama: Adam Geraldy Katab
Kelas: IF-38-01
NIM: 1301140381*/

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
	
	public String getName() {
		return name;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public int getProjectWorked() {
		return projectWorked;
	}
	
	public void setProjectWorked(int value) {
		projectWorked = value;
	}
	
	public String toString() {
		return name +" specialized in "+ specialization +" and has already worked on "+ projectWorked +" project(s).";
	}
}
