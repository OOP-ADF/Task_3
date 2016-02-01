// Ferdy Dian Anugrah(1301140035) IF 3809

public class Driver {
	public static void main(String[] args) {
		StartUp stp = new StartUp();
		Member m = new Member("Alex");
		Member m = new Member("Beni");
		Member m = new Member("Cakra");
		Member m = new Member("Deni");
		Member m = new Member("Eric");
		stp.addMember(m);
		stp.addMember(m);
		stp.addMember(m);
		stp.addMember(m);
		stp.addMember(m);
		
		stp.createNewProject("project 1");
		stp.createNewProject("project 2");
		
		Project p = stp.getProject(0);
		m = stp.getProject(0);
		stp.setProjectMember(p,m);
		p = stp.getProject(1);
		stp.setProjectMember(p,m);
		
		m = stp.getMember(4);
		p = stp.getProject(0);
		stp.setProjectMember(p,m);
		
		stp.releaseProject(stp.getProject(0));
		
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getMember(4).toString());
		System.out.println(stp.getProject(0).toString());
		System.out.println(stp.getProject(1).toString());
		System.out.println("Project has been released : "+stp.getNumReleasedProject());
	}
}


