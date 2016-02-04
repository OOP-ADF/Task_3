//Anang Kurniawan
//1301140192
//IF 38 02

public class Driver{
	public static void main(String[] args){
		StartUp stp = new StartUp();
		Member m = new Member("Alex");
		stp.addMember( m );
		stp.createNewProject( "project1" );
		Project p = stp.getProject( 0 );
		Member m = stp.getMember( 0 );
		stp.setProjectMember( p , m );
		stp.releaseProject( stp.getProject( 1 ) );
		System.out.println( stp.getMember( 0 ).toString() );
		System.out.println( stp.getProject( 0 ).toString() );
	}
}
