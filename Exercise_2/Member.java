//Nama		: Febby Febriansyah
//NIM		: 1301140371
//Kelas		: IF-38-01

public class Member{
	private String name,specialization;
	private int projectWorked = 0;
	
	public Member(String name){
		setName(name);
	}
	public Member(String name,String specialization){
		setName(name);
		setSpecialization(specialization);
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSpecialization(String specialization){
		this.specialization = specialization;
	}
	public String getName(){
		return name;
	}
	public String getSpecialization(){
		return specialization;
	}
	public String toString(){
		return "Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" project(s)";
	}
	public void setProjectWorked(int projectWorked){
		this.projectWorked = projectWorked;
	}
	public int getProjectWorked(){
		projectWorked++;
		return projectWorked;
	}
}
