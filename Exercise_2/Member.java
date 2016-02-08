public class Member {
	private String name;
	private String specialization;
	private int projectWorked=0;
	
	public Member(String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
	}
	public String getName(){
		return name;
    }
    public int getSpecialization(){
		return specialization;
    }
	public String toString(){
        return "Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" project";
    }
}