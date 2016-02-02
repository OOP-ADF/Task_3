// NAMA : Alfian Pamungkas Sakawiguna
// KELAS : IF-38-01
// NIM : 1301144411

public class Driver{ 
	public static void main(String[]args) {
		//objek StartUp
		StartUp stp = new StartUp();

		//insert m1-m5
		Member m1 = new Member("Alfian");		
		Member m2 = new Member("Kamu");	
		Member m3 = new Member("Iqra");
		Member m4 = new Member("IDCloudHost");
		Member m5 = new Member("Sakawiguna");

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
