/*
	Riksa Meidy Karim
	1301142289
	IF-38-09
*/

public class Member{
	private String name;
	private String specialization;
	private int projectWorked = 0;
	
	public Member(String name){
		this.name = name;
	}
	
	public Member(String name , String specialization){
		this.name = name;
		this.specialization = specialization;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSpec(String specialization){
		this.specialization = specialization;
	}
	
	public String getSpec(){
		return specialization;
	}
	
	public void setProjectWorked(int projectWorked){
		this.projectWorked = projectWorked;
	}
	
	public int getProjectWorked(){
		return projectWorked;
	}
	
	public String toString(){
		return "Member " + name + " is specialized in " + specialization + " and already worked " + Integer.toString(projectWorked) + " projects";
	}
	
	
	
}