//@auth:Irfan Trianto/1301144111/IF-38-01

public class Member {
	
//definisi atribut
	private String name;
	private String specialization;
	private int projectWorked = 0;

//definisi konstruktor
public Member (String name) {
	this.name = name;
}
//overloading konstruktor
public Member (String name, String specialization) {
	this.name = name;
	this.specialization = specialization;
}

//definisi method
public String getName() {
	return name;
}

public void setName(String name) {
    this.name = name;
}

public String getspecialization() {
    return specialization;
}

public void setSpecialization(String specialization) {
    this.specialization = specialization;
}

public int getProjectWorked() {
    return projectWorked;
}

public void setProjectWorked(int projectWorked) {
    this.projectWorked = projectWorked;
}
	
public String toString(){
	return "Member "+name+" specialized in "+specialization+" and already worked on "+projectWorked+" projec (s)";
	}
}
