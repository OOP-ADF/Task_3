/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3exercise2;

/**
 * NIM 1 : 1301150054
 * NIM 2 : 1301154208 
 * NIM 3 : 1301154502
 * KELAS : IF-39-12
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiate 1 StartUp object stp
        StartUp myStartUp = new StartUp();        
        Member m;
        Project p;
        // instantiate 5 new Member objects 
        // with name = Alex, Beni, Cakra, Deni, and Eric; 
        // and add them to StartUp stp
        Member m1 = new Member("Alex");
        myStartUp.addMember( m1 );
        Member m2 = new Member("Beni");
        myStartUp.addMember( m2 );
        Member m3 = new Member("Cakra");
        myStartUp.addMember( m3 );
        Member m4 = new Member("Deni");
        myStartUp.addMember( m4 );
        Member m5 = new Member("Eric");
        myStartUp.addMember( m5 );
        
        
        
        // create 2 Project object within the Start Up stp, 
        // with project name = project1 and project2
        myStartUp.createNewProject( "project1" );
        myStartUp.createNewProject( "project2" );
        
        // set project member as below
        // add Alex, Beni, and Deni into Project1        
        p = myStartUp.getProject( 1 );
        m1 = myStartUp.getMember( 1 );
        p.addMember(m); 
        p = myStartUp.getProject( 1 );
        m2 = myStartUp.getMember( 2 );
        p.addMember(m2);
        
        
        // add Beni, Cakra, Deni, and Eric into Project2  
        p = myStartUp.getProject( 2 );
        m3 = myStartUp.getMember( 3 );
        p.addMember(m); 
        p = myStartUp.getProject( 2 );
        m4 = myStartUp.getMember( 4 );
        p.addMember(m);
        p = myStartUp.getProject( 2 );
        m5 = myStartUp.getMember( 5 );
        
        
        // set release one of the project
        p = myStartUp.getProject( 1 );
        myStartUp.releaseProject( p );
        
        // display the status of every member in Start Up myStartUp
        System.out.println( myStartUp.getMember( 0 ) );
        System.out.println( myStartUp.getMember( 1 ) );
        System.out.println( myStartUp.getMember( 2 ) );
        System.out.println( myStartUp.getMember( 3 ) );
        System.out.println( myStartUp.getMember( 4 ) );
        System.out.println( myStartUp.getMember( 5 ) );
        
        // display the status of every project in Start Up myStartUp
        System.out.println( myStartUp.getProject( 1 ) );
        System.out.println( myStartUp.getProject( 2 ) );
        
        
        // display the number of released project in Start Up stp
        System.out.println("Project yang sudah release adalah : " + myStartUp.getNumReleaseProject());
        
        // Try another scenario case on your own
        
    }

}
