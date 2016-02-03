
// Nama : Andhika Gilang K
// Kelas : IF-38-01
// NIm : 1301140361

public class Driver {
	public static void main(String[] args){
		StartUp start = new StartUp();
		Member m1 = new Member ("Dika");
		start.addMember(m1);
		Member m2 = new Member ("Doka");
		start.addMember(m2);
		Member m3 = new Member ("Deka");
		start.addMember(m3);
		Member m4 = new Member ("Duki");
		start.addMember(m4);
		
		start.createNewProject(" asoy");
		start.createNewProject(" asoy 2");
		
		Project p1= start.getProject(0);
		Project p2= start.getProject(1);
		
		start.setProjectMember(p1,m1);
		start.setProjectMember(p1,m2);
		start.setProjectMember(p2,m3);
		start.setProjectMember(p2,m4);
		
		start.releaseProject(start.getProject(1));
		
		
		System.out.println(start.getMember(0).toString());
		System.out.println(start.getProject(0).toString());
	}
}
