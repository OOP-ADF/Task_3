//Hirianinda Malsegianty S.
//1301140262
//IF 38-02
public class Member {
    
    private String name;
	private String specialization;
	private int projectWorked = 0;
	
	public Member (String name){
		this.name = name;
	}
	
	public Member (String name, String specialization){
		this.name = name;
		this.specialization = specialization;
	}
	
	public void setName (String name){
		this.name = name;
	}
	
	public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
	
	public int getProjectWorked() {
        return projectWorked;
    }
	
   public String toString() {
		return String.format("Member ",getName()," specialized in ",getSpecialization()," and already worked on ",getProjectWorked()," projects(s)");
	}
    
}
