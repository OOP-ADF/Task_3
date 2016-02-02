/*
Nama		: Zardarian Ahadika N.
NIM			: 1301140112
Kelas		: IF-38-02
*/

public class Member {
	private String name;
	private String specialization;
	private int projectWorked = 0;
	
	public Member (String name) {
		this.name = name;
	}
	public Member (String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
	}
	public void setNameString (String name) {
		this.name = name;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
    public void setProjectWorked(int projectWorked) {
        this.projectWorked = projectWorked;
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
		return ("Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" project(s)");
	}
}

