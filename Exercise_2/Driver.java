/*
* Name : Dede Kiswanto
* Class : IF-38-01
* NIM : 1301140171
* Status : ?
*/

public class Driver {
	
	public static void main(String[] args){
	
		StartUp stp = new StartUp();

		Member alex = new Member("Alex");

		
		Member beni = new Member("Beni");
		Member cakra = new Member("Cakra");
		Member deni = new Member("Deni");
		Member eric = new Member("Eric");

		stp.addMember(alex);
		stp.addMember(beni);
		stp.addMember(cakra);
		stp.addMember(deni);
		stp.addMember(eric);

		// Set Specialization
		eric.setSpecialization("Python Django");
		cakra.setSpecialization("Rasengan Ninjutsu");
		alex.setSpecialization("COTS Master");
		deni.setSpecialization("Pascal Programming");

		stp.createNewProject("Project 1");
		stp.createNewProject("Project 2");

		Project p1 = stp.getProject( 0 );
		Project p2 = stp.getProject( 1 );

		stp.setProjectMember( p1 , alex );
		stp.setProjectMember( p1 , beni );	
		stp.setProjectMember( p1 , deni );

		stp.setProjectMember( p2 , beni );		
		stp.setProjectMember( p2 , cakra );		
		stp.setProjectMember( p2 , deni );		
		

		//set release one of the project
		stp.releaseProject( stp.getProject( 1 ) );
		
		//display the status of every member in Start Up stp
		System.out.println(" \nList Member :");
		for(int i = 0; i < stp.getTotalMember(); i++) {
			System.out.println( stp.getMember( i ).toString() );
		}
		//display the status of every project in Start Up stp
		System.out.println(" \nList Project :");
				for(int i = 0; i < stp.getTotalProject(); i++) {
			System.out.println( stp.getProject( i ).toString() );
		}
		
		//display the number of released project in Start Up stp
		System.out.println( "\nReleased Project in Startup is : " + stp.getNumReleasedProject() );
	}
}
