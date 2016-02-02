/*Hizas Sabilal Rasyad
  1301140251
  IF3801
 */
public class Driver
{
	public static void main(String[]args)
	{
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

		stp.createNewProject( "project1" );
		stp.createNewProject( "project2" );
		Project p1 = stp.getProject( 0 );
		Project p2 = stp.getProject( 1 );
		for(int i = 0; i < 3; i++)
		{
			Member m = stp.getMember( i );
			stp.setProjectMember( p1 , m );
		}
		for(int i = 2; i < 5; i++)
		{
			Member m = stp.getMember( i );
			stp.setProjectMember( p2 , m );
		}
		stp.releaseProject( stp.getProject( 0 ) );
		for(int i = 0; i < 5; i++)
			System.out.println( stp.getMember( i ).toString() );
		System.out.println( stp.getProject( 0 ).toString() );
		System.out.println( stp.getProject( 1 ).toString() );
	}
	
}
