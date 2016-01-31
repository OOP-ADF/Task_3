/*Nama : Dainty Amanda Fathurrohmi
Nim : 1301140062
Kelas : IF 38-02*/

public class Driver {
	public static void main(String[] args ) {
		StartUp stp = new StartUp();
		Member m = new Member ("Alex","Java");
		stp.addMember(m);
		m = new Member ("Beni","MySQL");
		stp.addMember(m);
		m = new Member ("Cakra","C++");
		stp.addMember(m);
		m = new Member ("Deni","Netbeans");
		stp.addMember(m);
		m = new Member ("Eric","Pascal");
		stp.addMember(m);
		
		stp.createNewProject("project1");
		stp.createNewProject("project2");
		
		Project p = stp.getProject(0);
		m = stp.getMember(0);
		stp.setProjectMember(p,m);
		
		stp.releaseProject(stp.getProject(1));
		
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getMember(1).toString());
		System.out.println(stp.getMember(2).toString());
		System.out.println(stp.getMember(3).toString());
		System.out.println(stp.getMember(4).toString());
		System.out.println(stp.getProject(0).toString());
		System.out.println(stp.getProject(1).toString());
		System.out.println("Number of project released : "+stp.getNumReleasedProject());
	}
}
