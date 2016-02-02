//Vicha Octavia Tama_1301144209_IF-38-09
  
 public class Member 
 {
	private String name;
	private String specialization;
	private int projectWorked = 0;
 	
 	public Member(String name)
	{
 		this.name = name;
 	}
 	public Member (String name, String specialization) 
	{
		this.specialization = specialization;
 		this.name = name;
 	}
 	public String getName() 
	{
 		return name;
 	}
 	public void setName(String name) 
	{
 		this.name = name;
 	}
    public int getprojectWorked() 
	{
        return projectWorked;
    }
	public void setprojectWorked(int projectWorked) 
	{
         this.projectWorked=projectWorked;
    }
	public String getSpecialization() 
	{
 		return specialization;
 	}
 	public void setSpecialization(String specialization) 
	{
 		this.specialization = specialization;
 	}
 	public String toString() 
	{
 		return ("Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" project(s)");
 	}
 }
