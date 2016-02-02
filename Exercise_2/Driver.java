//@auth:Irfan Trianto/1301144111/IF-38-01

public class Driver{ 
	public static void main(String[]args) {
		//create objek StartUp
		StartUp stp = new StartUp();

		//insert member m1-m5
		Member m1 = new Member("Alex");		
		Member m2 = new Member("Beni");	
		Member m3 = new Member("Cakra");
		Member m4 = new Member("Deni");
		Member m5 = new Member("Eric");

		//insert stp to startup
		stp.addMember(m1);
		stp.addMember(m2);
		stp.addMember(m3);
		stp.addMember(m4);
		stp.addMember(m5);

		stp.createNewProject( "project1" );
		stp.createNewProject( "project2" );

		Project p1 = stp.getProject(0);
		Project p2 = stp.getProject(1);

		for(int i = 0; i < 3; i++) {
			Member m = stp.getMember(i);
			stp.setProjectMember(p1, m);
		}

		for(int i = 2; i < 5; i++) {
			Member m = stp.getMember( i );
			stp.setProjectMember( p2 , m );
		}
		stp.releaseProject( stp.getProject(0) );

		for(int i = 0; i < 5; i++)
			System.out.println( stp.getMember(i ).toString() );
		System.out.println( stp.getProject(0).toString() );
		System.out.println( stp.getProject(1).toString() );
	}
	
}
