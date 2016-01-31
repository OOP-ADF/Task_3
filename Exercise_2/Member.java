//Name 		 : Mohammad Zakie Faiz Rahiemy
//Student ID : 1301144422
//Class 	 : IF-38-02

public class Member{
	private String name;
	private String specialization;
	private int projectWorked=0;
	
	public Member (String name){
		this.name=name;
	}
	
	public Member (String name, String specialization){
		this.name=name;
		this.specialization=specialization;
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
	
	public void addProjectWorked(){
		projectWorked++;
	}
	
	public int getProjectWorked(){
		return projectWorked;
	}
	
	public String toString(){
		return "Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" project(s)";
	}
}
