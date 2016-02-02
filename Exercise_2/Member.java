//Dzakyta Afuzagani
//1301140122
//IF 38 02

public class Member {
	private String name,Specialization;
	private int projectworked=0;
	
	public Member (String name) {
 		this.name=name;
 	}
 	
 	public Member (String name, String Specialization) {
 		this.name=name;
 		this.Specialization=Specialization;
 	}
	public void setName(String name){
		this.name=name;
	}
	
	public void getName() {
			this.name = name;
	}
	
	public void setProjectWorked(int projectworked){
		this.projectworked=projectworked;
	}
	
	public void getProjectWorked(){
		return getprojectworked;
	}
	
	public void setSpecialization(String Specialization){
		this.Specialization=Specialization;
	}
	
	public void getSpecialization(){
		return getSpecialization;
	}
	
	public String toString(){
		return "Member "+name+" Specialized in "+Specialization+" and Alredy Worked on "+projectworked+" Project(s)" ;
	}
	
}
