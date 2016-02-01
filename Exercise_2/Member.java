//IF-38-09_Adzan Nugraha_1301140249

public class Member 
{
	private String name;
	private String specialization;
	private int projectWorked=0;
	
	public Member (String name) 
	{
		this.name = name;
	}
	
	public Member (String name, String specialization) 
	{
		this.name = name;
		this.specialization = specialization;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setProjectWorked(int projectWorked) {
		this.projectWorked = projectWorked;
	}
	
	public int getProjectWorked() 
	{
		return projectWorked;
	}
	
	public String setSpecialization(String specialization) 
	{
		this.specialization = specialization;
	}
	
	public String getSpecialization() 
	{
		return specialization;
	}
	
	public String toString() {
		return ("Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" projec(s)");
	}
} 
