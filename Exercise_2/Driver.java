public class Driver
 {
 	public static void main(String[]args)
 	{
 		StartUp stp = new StartUp();
 		Member a = new Member("Alex");
		Member b = new Member("Beni");
		Member c = new Member("Cakra");
		Member d = new Member("Deni");
		Member e = new Member("Eric");
 		stp.addMember(a);
 		stp.addMember(b);
 		stp.addMember(c);
		stp.addMember(d);
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
 
 //Ari Adrian Ibrahim
//1301142301
//IF 38 01
