/*
Name : Amalya Citra Pradana
Student ID : 1301140389
Class : IF-38-09
*/

public class Driver {
	public static void main (String[] args){
		
		StartUp stp = new StartUp();
		
		Member a = new Member("Alex");
		stp.addMember(a);
		Member b = new Member("Beni");
		stp.addMember(b);
		Member c = new Member("Cakra");
		stp.addMember(c);
		Member d = new Member("Deni");
		stp.addMember(d);
		Member e = new Member("Eric");
		stp.addMember(e);
		
		stp.createNewProject("project1");
		stp.createNewProject("project2");
		
		Project p1 = stp.getProject( 0 );
		Project p2 = stp.getProject( 1 );
		
		a = stp.getMember(1);
		p1 = stp.getProject(1);
		
		stp.setProjectMember( p1 , a );
		stp.setProjectMember( p1 , b );
		stp.setProjectMember( p1 , d );
		
		stp.setProjectMember( p2 , c );
		stp.setProjectMember( p2 , e );
		
		a = stp.getMember(1);
		p1 = stp.getProject(0);
		c = stp.getMember(3);
		p2 = stp.getProject(1);
		
		stp.releaseProject(stp.getProject(1));
		
		System.out.println(stp.getMember(1).toString());
		System.out.println(stp.getMember(3).toString());
		System.out.println(stp.getProject(0).toString());
		System.out.println(stp.getProject(1).toString());
	}
}

