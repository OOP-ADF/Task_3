/* NAMA : ANGKY FAJRIATI MS MUSA
   KELAS : IF-38-01
   NIM : 1301141221
*/

public class Member {
	private String name;
	private String specialization;
	private int projectWorked=0;
	public Member(String name) {
		this.name=name;
	}
	public Member(String name,String specialization){
		this.name=name;
		this.specialization=specialization;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSpesialization(String specialization){
		this.specialization=specialization;
	}
	public String getSpesialization(){
		return specialization;
	}
	public void setProjectWorked(int projectWorked){
		this.projectWorked=projectWorked;
	}
	public int getProjectWorked(){
		return projectWorked;
	}
	public String toString(){
		return ("Member "+getName()+" specialized in "+getSpesialization()+" and already worked on "+getProjectWorked()+" project(s)");
	}
}
