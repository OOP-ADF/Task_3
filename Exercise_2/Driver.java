/*
I Nyoman Tri Budhi Palantra
1301140089
IF-38-09
*/

public class Driver {
	public static void main(String[] args ) {
		StartUp stp = new StartUp();
		Member m = new Member("Alex", "Python");
		stp.addMember(m);
		m = new Member("Beni", "C#");
		stp.addMember(m);
		m = new Member("Cakra", "MySQL");
		stp.addMember(m);
		m = new Member("Deni", "C");
		stp.addMember(m);
		m = new Member("Eric", "Java");
		stp.addMember(m);
		
		stp.createNewProject("Project 1");
		stp.createNewProject("Project 2");
		
		Project p = stp.getProject(0);
		m = stp.getMember(2);
		stp.setProjectMember(p,m);
		p = stp.getProject(1);
		m = stp.getMember(4);
		stp.setProjectMember(p, m);
		
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
