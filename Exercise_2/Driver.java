// Name : Rizza Aulia Rahman
// Student ID : 1301144231
// Class : IF-38-01

public class Driver {
	public static void main (String[] args) {
		StartUp stp = new StartUp();
		Member m1 = new Member("Alex");stp.addMember(m1);
		Member m2 = new Member("Beni");stp.addMember(m2);
		Member m3 = new Member("Cakra");stp.addMember(m3);
		Member m4 = new Member("Deni");stp.addMember(m4);
		Member m5 = new Member("Eric");stp.addMember(m5);
		stp.createNewProject("Project1");
		stp.createNewProject("Project2");
		Project p1 = stp.getProject(0);
		Project p2 = stp.getProject(1);
		m1 = stp.getMember(0);
		m2 = stp.getMember(1);
		m3 = stp.getMember(2);
		m4 = stp.getMember(3);
		m5 = stp.getMember(4);
		stp.setProjectMember(p1,m1);
		stp.setProjectMember(p1,m2);
		stp.setProjectMember(p1,m4);
		stp.setProjectMember(p2,m2);
		stp.setProjectMember(p2,m3);
		stp.setProjectMember(p2,m4);
		stp.setProjectMember(p2,m5);
		stp.releaseProject(p1);
		System.out.println("Member(s) List");
		for (int i = 0; i < stp.getNMember(); i++) {
			System.out.println((i+1)+". "+stp.getMember(i).toString());
		}
		System.out.println();
		System.out.println("Project(s) List");
		for (int i = 0; i < stp.getNProject(); i++) {
			System.out.println((i+1)+". "+stp.getProject(i).toString());
		}
		System.out.println();
		int numRelease = stp.getNumReleasedProject();
		System.out.println("Number of Released Project : "+numRelease);
	}
}
