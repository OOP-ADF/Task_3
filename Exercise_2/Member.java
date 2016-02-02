/*Hizas Sabilal Rasyad
  1301140251
  IF3801
 */
public class Member
{
	private String name;
	private String specialization = "None";
	private int projectWorked = 0;
	
	public Member(String name)
	{
		this.name = name;
	}
	
	public Member(String name, String specialization)
	{
		this.name = name;
		this.specialization = specialization;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setSpecialization(String specialization)
	{
		this.specialization = specialization;
	}
	
	public void setProjectWorked(int x)
	{
		this.projectWorked = x;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSpecialization()
	{
		return specialization;
	}
	
	public int getProjectWorked()
	{
		return projectWorked;
	}
	
	public String toString()
	{
			return "Member Alex specialized in " + specialization + " and already worked on " + projectWorked + " projec(s)";
	}
}
