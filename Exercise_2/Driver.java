/*Nama	: Windy Israniati Jihan
NIM		: 1301144309
Kelas	: IF-38-09 */

public class Driver {
	public static void main (String[] args) {
		StartUp stp = new StartUp();
		
		Member m = new Member("Alex");
		stp.addMember( m );
		Member m = new Member("Beni");
		stp.addMember( m );
		Member m = new Member("Cakra");
		stp.addMember( m );
		Member m = new Member("Deni");
		stp.addMember( m );
		Member m = new Member("Eric");
		stp.addMember( m );
		
		stp.createNewProject( "project1" );
		stp.createNewProject( "project2" );
		
		Project p = stp.getProject( 0 );
		Member m = stp.getMember( 0 );
		stp.setProjectMember( p , m );
		
		stp.releaseProject( stp.getProject( 1 ) );
		System.out.println( stp.getMember( 0 ).toString() );
		System.out.println( stp.getProject( 1 ).toString() );
		System.out.println( stp.getProject( 2 ).toString() );
		System.out.println( stp.getProject( 3 ).toString() );
		System.out.println( stp.getProject( 4 ).toString() );
		System.out.println("Project Number released = "+stp.getNumReleasedProject());
	}
}

