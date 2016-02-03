// Rana Renes Rengga-1301144351 (IF-38-01)

public class Member
{
	private String name;
	private String specialization;
	private int projectWorked = 0;

	public Member(String name)
	{
		setName(name);
	}
	public Member(String name, String specialization)
	{
		setName(name);
		setSpecialization(specialization);
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public void setSpecialization(String specialization)
	{
		this.specialization = specialization;
	}
	public String getSpecialization()
	{
		return specialization;
	}

	public void setProjectWorked(int projectWorked)
	{
		this.projectWorked = projectWorked;
	}
	public int getProjectWorked()
	{
		projectWorked++;
		return projectWorked;
	}

	public String toString()
	{
		return ("Member " + name + " specialized in " + specialization + " and already worked on " + projectWorked + " project/projects");
	}
}
