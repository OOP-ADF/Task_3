public class Driver {
	public static void main(String[] args) {
		StartUp stp = new StartUp();
		Member m1 = new Member("Alex");
		stp.addMember(m1);
		Member m2 = new Member("Beni");
		stp.addMember(m2);
		Member m3 = new Member("Cakra");
		stp.addMember(m3);
		Member m4 = new Member("Deni");
		stp.addMember(m4);
		Member m5 = new Member("Eric");
		stp.addMember(m5);
		
		stp.createNewProject("Project 1");
		stp.createNewProject("Project 2");
		
		Project p1 = stp.getProject(0);
		stp.setProjectMember(p1,m1);
		stp.setProjectMember(p1,m2);
		stp.setProjectMember(p1,m3);
		
		Project p2 = stp.getProject(1);
		stp.setProjectMember(p2,m4);
		stp.setProjectMember(p2,m5);
		
		stp.releaseProject(stp.getProject(1));
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getProject(0).toString());
	}
}
