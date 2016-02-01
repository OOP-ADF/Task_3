//Name : Luthfi Fauzani Ahmad
//NIM  : 130140029
//Class: IF-38-09

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
 
 	public void setProjectWorked(int projectWorked) {
 		this.projectWorked = projectWorked;
 	}
 
 	public void setSpecialization(String specialization) {
 		this.specialization = specialization;		
 	}
 
 	public int getProjectWorked() {
 		return projectWorked;
 	}
 
 	public String getSpecialization() {
 		return specialization;
 	}

 	public String toString() {
 		return "Member " + name +  " specialized in " + specialization + " and already worked on " + projectWorked + " project(s)";
 	}
 }

