//Nama : Ubassy Abdillah
//NIM : 1301148282

public class Driver {
	public static void main(String[] args) {
		StartUp stp=new StartUp();
		
		Member m1=new Member("Alex");
		Member m2=new Member("Beni");
		Member m3=new Member("Cakra");
		Member m4=new Member("Deni");
		Member m5=new Member("Eric");
		stp.addMember(m1);
		stp.addMember(m2);
		stp.addMember(m3);
		stp.addMember(m4);
		stp.addMember(m5);
		
		stp.createNewProject("project1");
		stp.createNewProject("project2");
		
		Project p = stp.getProject(0);
		Member m = stp.getMember(0);
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
		
		stp.releaseProject(stp.getProject(1));
		
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getMember(1).toString());
		System.out.println(stp.getMember(2).toString());
		System.out.println(stp.getMember(3).toString());
		System.out.println(stp.getMember(4).toString());
		
		System.out.println(stp.getProject(0).toString());
		System.out.println(stp.getProject(1).toString());
		
		System.out.println("Number of released project: "+stp.getNumReleasedProject());
	}
}
