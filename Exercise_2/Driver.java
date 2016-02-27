public class Driver {
	public static void main(String[] args) {
		StartUp stp = new StartUp();
		
		Member m1 = new Member("Alex","Programmer");
		Member m2 = new Member("Beni","Project Manager");
		Member m3 = new Member("Cakra","Project Manager");
		Member m4 = new Member("Deni","Programmer");
		Member m5 = new Member("Eric","Programmer");
		
		stp.addMember(m1);
		stp.addMember(m2);
		stp.addMember(m3);
		stp.addMember(m4);
		stp.addMember(m5);
		
		
		stp.createNewProject("Project 1");
		stp.createNewProject("Project 2");
		
		Project p1 = stp.getProject(0);
		stp.setProjectMember(p1, m1);
		stp.setProjectMember(p1, m2);
		stp.setProjectMember(p1, m3);
		stp.setProjectMember(p1, m4);
		stp.setProjectMember(p1, m5);
		
		Project p2 = stp.getProject(1);
		stp.setProjectMember(p2, m1);
		stp.setProjectMember(p2, m2);
		stp.setProjectMember(p2, m3);
		stp.setProjectMember(p2, m4);
		stp.setProjectMember(p2, m5);
		
		stp.releaseProject(stp.getProject(1));
		
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getProject(0).toString());
		System.out.println("Project has been released : "+ stp.getNumReleasedProject());
	}
}
