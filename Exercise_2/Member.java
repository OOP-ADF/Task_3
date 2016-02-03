public class Member{
	private String name;
	private String specialization;
	private int projectWorked = 0;
	
	public void Member(String name){
		this.name = name;
	}
	
	public void Member(String name, String specialization){
		this.name = name;
		this.specialization = specialization;
	}
	
	public void setPrivateName(String name){
		this.name = name;
	}
		
	public String getPrivateName(){
		return name;
	}
	
	public void setPrivateSpecialization(String specialization){
		this.specialization = specialization;
	}
		
	public String getPrivateString(){
		return specialization;
	}
	
	public void setPrivateProjectWorked(int projectWorked){
		this.projectWorked = projectWorked;
		projectWorked++;
	}
		
	public int getPrivateProjectWorked(){
		return projectWorked;
	}
	
	public String toString(){
		return ("Member"+name+"specialized in "+specialization+ " and already worked on "+projectWorked +" projects");
	}
	
}

