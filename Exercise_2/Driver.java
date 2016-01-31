//Hirianinda Malsegianty S.
//1301140262
//IF 38-02
public class driver {
	
	public static void main(String[] args) {
       StartUp stp = new StartUp();
		
		Member m1 = new Member("Alex");
		stp.addMember( m1 );
		Member m2 = new Member("Beni");
		stp.addMember( m2 );
		Member m3 = new Member("Cakra");
		stp.addMember( m3 );
		Member m4 = new Member("Deni");
		stp.addMember( m4 );
		Member m5 = new Member("Eric");
		stp.addMember( m5 );
		
		stp.createNewProject( "project1" );
		stp.createNewProject( "project2" );
		
		Project p1 = stp.getProject( 0 );
		Project p2 = stp.getProject( 1 );
		Member m11 = stp.getMember( 0 );
		Member m22 = stp.getMember( 1 );
		Member m33 = stp.getMember( 2 );
		Member m44 = stp.getMember( 3 );
		Member m55 = stp.getMember( 4 );
		stp.setProjectMember( p1 , m11 );
		stp.setProjectMember( p1 , m22 );
		stp.setProjectMember( p1 , m44 );
		stp.setProjectMember( p1 , m33 );
		stp.setProjectMember( p1 , m55 );
		
		stp.releaseProject( stp.getProject( 1 ) );
		
		stp.getNumReleasedProject();
    }
    
}