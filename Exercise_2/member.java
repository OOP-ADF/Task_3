public class member{
	private String name;
	private String specialization;
	private int projectWorked = 0;
	
	public member(String name, String specialization, int projectWorked){
		this.name = name;
		this.specialization=specialization;
		this.projectWorked = projectWorked;
		}
		
	public String getName(){
		return name;
	}
	
	public String getSpecialization(){
		return specialization;
	}
	
	public int getProjectWorked(){
		return projectWorked;
	}
	
	public String toString(){
		return "Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" project(s)";
	}
}