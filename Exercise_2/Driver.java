/*
	Nama 	: Rizky Muhammad Rifai
	NIM  	: 1301144099
	Kelas	: IF-38-09
*/

public class Driver {
 	public static void main(String[] args ) {
 		StartUp stp = new StartUp();
 		Member m = new Member("Axl Rose", "Java");
 		stp.addMember(m);
 		m = new Member("Slash", "Ruby");
 		stp.addMember(m);
 		m = new Member("Izzy Stradlin", "MySQL");
 		stp.addMember(m);
 		m = new Member("McKagan", "C++");
 		stp.addMember(m);
 		m = new Member("Adler", "Matlab");
 		stp.addMember(m);
 		stp.createNewProject("Project 1");
 		stp.createNewProject("Project 2");
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
