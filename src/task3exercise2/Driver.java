/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3exercise2;

/**
 *NIM 1 :1301154273
 *NIM 2 :1301154255 
 *NIM 3 :1301154203
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
        
        m = new Member("Alex");
        myStartUp.addMember( m );
        m = new Member("Beni");
        myStartUp.addMember( m );
        m = new Member("Cakra");
        myStartUp.addMember( m );
        m = new Member("Deni");
        myStartUp.addMember( m );
        m = new Member("Eric");
        myStartUp.addMember( m );
      
        myStartUp.createNewProject( "project1" );
        myStartUp.createNewProject( "project2" );
          
        p = myStartUp.getProject( 0 );
        
        m = myStartUp.getMember( 0 );
        p.addMember(m); 
        m = myStartUp.getMember( 1 );
        p.addMember(m);
        m = myStartUp.getMember( 3 );
        p.addMember(m);
       
        p = myStartUp.getProject( 1 );
        
        m = myStartUp.getMember( 1 );
        p.addMember(m); 
        m = myStartUp.getMember( 2 );
        p.addMember(m);
        m = myStartUp.getMember( 3 );
        p.addMember(m); 
        m = myStartUp.getMember( 4 );
        p.addMember(m);
   
        p = myStartUp.getProject( 1 );
        myStartUp.releaseProject( p );
        
       
        System.out.println( myStartUp.getMember( 0 ) );
        System.out.println( myStartUp.getMember( 1 ) );
        System.out.println( myStartUp.getMember( 2 ) );
        System.out.println( myStartUp.getMember( 3 ) );
        System.out.println( myStartUp.getMember( 4 ) );
        
        System.out.println( myStartUp.getProject( 0 ) );
        System.out.println( myStartUp.getProject( 1 ) );
        
        System.out.println( myStartUp.getNumReleasedProject() );
        
        
    }

}
