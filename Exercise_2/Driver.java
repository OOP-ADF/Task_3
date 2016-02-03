public class Driver{
	public static void main(String[] args){
		StartUp stp = new StartUp();
		
		Member m1 = new Member("Alex");
		Member m2 = new Member("Beni");
		Member m3 = new Member("Cakra");
		Member m4 = new Member("Deni");
		Member m5 = new Member("Eric");
	
		stp.addMember(m1);
		stp.addMember(m2);
		stp.addMember(m3);
		stp.addMember(m4);
		stp.addMember(m5);
		
		stp.createNewProject( "project1" );
		stp.createNewProject( "project2" );
		
		Project p1 = stp.getProject(0);
		Member m = stp.getMember(0);
		stp.setProjectMember(p1,m);
		m = stp.getMember(1);
		stp.setProjectMember(p1,m);
		m = stp.getMember(3);
		stp.setProjectMember(p1,m);
		
		Project p2 = stp.getProject(1);
		Member m = stp.getMember(1);
		stp.setProjectMember(p2,m);
		m = stp.getMember(2);
		stp.setProjectMember(p2,m);
		m = stp.getMember(3);
		stp.setProjectMember(p2,m);
		m = stp.getMember(4);
		stp.setProjectMember(p2,m);
		
		stp.releaseProject(stp.getProject(0));
		
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getMember(1).toString());
		System.out.println(stp.getMember(2).toString());
		System.out.println(stp.getMember(3).toString());
		System.out.println(stp.getMember(4).toString());
		System.out.println(stp.getProject(0).toString());
		System.out.println(stp.getProject(1).toString());
		System.out.println(stp.getProject(2).toString());
		System.out.println(stp.getProject(3).toString());
		System.out.println(stp.getProject(4).toString());
		
		System.out.println(stp.toString());
			
	}
	}
