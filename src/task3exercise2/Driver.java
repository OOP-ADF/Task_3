/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3exercise2;
// Tugas Hardiyan
/**
 * NIM 1 : 1301154124 (M. Rakha)(IF3912)
 * NIM 2 : 1301154138 (Hardiyan Ichsan G)(IF3912)
 * NIM 3 : 1301154460 (Azahra Kartika)(IF3912)
 *
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiate 1 StartUp object stp
        StartUp stp = new StartUp();        
        Member m;
        Project p;
        // instantiate 5 new Member objects 
        // with name = Alex, Beni, Cakra, Deni, and Eric; 
        // and add them to StartUp stp
        m = new Member("Alex");
        stp.addMember( m );
        m = new Member("Beni");
        stp.addMember( m );
        m = new Member("Cakra");
        stp.addMember( m );
        m = new Member("Deni");
        stp.addMember( m );
        m = new Member("Eric");
        stp.addMember( m );
        
        
        // create 2 Project object within the Start Up stp, 
        // with project name = project1 and project2
        stp.createNewProject( "project1" );
        stp.createNewProject( "project2" );
        
        // set project member as below
        // add Alex, Beni, and Deni into Project1        
        p = stp.getProject( 0 );
        m = stp.getMember( 0 );
        p.addMember(m); 
        m = stp.getMember( 1 );
        p.addMember(m);
        m = stp.getMember( 3 );
        p.addMember(m);
        
        // add Beni, Cakra, Deni, and Eric into Project2  
        p = stp.getProject( 1 );
        m = stp.getMember( 1 );
        p.addMember(m); 
        m = stp.getMember( 2 );
        p.addMember(m);
        m = stp.getMember( 3 );
        p.addMember(m);
        m = stp.getMember( 4 );
        p.addMember(m);
        
        // set release one of the project
        p = stp.getProject( 1 );
        stp.releaseProject( p );
        
        // display the status of every member in Start Up myStartUp
        System.out.println( stp.getMember( 0 ) );
        System.out.println( stp.getMember( 1 ) );
        System.out.println( stp.getMember( 2 ) );
        System.out.println( stp.getMember( 3 ) );
        System.out.println( stp.getMember( 4 ) );
        // display the status of every project in Start Up myStartUp
        System.out.println( stp.getProject( 0 ) );
        System.out.println( stp.getProject( 1 ) );
        
        
        // display the number of released project in Start Up stp
        System.out.println( stp.getNumReleasedProject() );
        
        // Try another scenario case on your own
        
    }

}
