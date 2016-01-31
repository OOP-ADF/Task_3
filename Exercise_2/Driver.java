/*
Name 	: Pima Hani Safitri
ID 		: 1301140202
Class 	: IF-38-02
*/
public class Driver {
	public static void main (String[] args) {
		StartUp stp = new StartUp();
		Project p;
		Member m;
		
		m = new Member("Alex");
		stp.addMember(m);
		m = new Member("Beni");
		stp.addMember(m);
		m = new Member("Cakra");
		stp.addMember(m);
		m = new Member("Deni");
		stp.addMember(m);
		m = new Member("Eric");
		stp.addMember(m);
		
		stp.createNewProject("project1");
		stp.createNewProject("project2");
		
		p = stp.getProject(0);
		m = stp.getMember(0);
		stp.setProjectMember(p,m);
		p = stp.getProject(0);
		m = stp.getMember(1);
		stp.setProjectMember(p,m);
		p = stp.getProject(0);
		m = stp.getMember(3);
		stp.setProjectMember(p,m);
		p = stp.getProject(1);
		m = stp.getMember(1);
		stp.setProjectMember(p,m);
		p = stp.getProject(1);
		m = stp.getMember(2);
		stp.setProjectMember(p,m);
		p = stp.getProject(1);
		m = stp.getMember(3);
		stp.setProjectMember(p,m);
		p = stp.getProject(1);
		m = stp.getMember(4);
		stp.setProjectMember(p,m);
		
		stp.releaseProject(stp.getProject(0));
		for(int i=0;i<5;i++) {
			stp.getMember(i).toString();
		}
		for(int j=0;j<2;j++) {
			stp.getProject(j).toString();
		}
		
		System.out.println("Released Project : "+stp.getNumReleasedProject()+" project");
	}
}