//[IF-38-09]_1301144139_I Komang Hendra Wijaya Kusuma

public class Member{
	private String name;
	private String specialization;
	private int projectWorked=0;
	
	public Member(String name){
		this.name=name;
	}
	
	public Member(String name, String specialization){
		this.name=name;
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
	
	public void setProjectWorked(int projectWorked) {
		this.projectWorked = projectWorked;
	}
 	
 	public int getProjectWorked() 
 	{
 		return projectWorked;
 	}
	
	public String toString(){
		return "Member Alex specialized in "+specialization+"and already worked on "+projectWorked+"projec(s)";
	}
}
