
//atika w - 1301144211
public class Member{
	private String name;
	private String specialization;
	private int projectWorked=0;
	
	public Member(String name){
		this.name=name;
	}
	
	public Member(String name, String specialization){
		this.name=name;
		this.specialization=specialization;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSpecialization(String specialization){
		this.specialization=specialization;
	}
	
	public String getSpecialization(){
		return specialization;
	}
	
	public void setProjectWorked(int projectWorked){
		this.projectWorked=projectWorked;
	}
	
	public int getProjectWorked(){
		return projectWorked;
	}
	
	public String toString(){
		return("Member "+getName()+" specialized"+getSpecialization()+" and already worked on "+getProjectWorked()+" Project");
	}
}
