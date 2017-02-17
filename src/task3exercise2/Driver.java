package task3exercise2;

/**
 * NIM 1 : 1301150012 
 * NIM 2 : 1301154222
 * NIM 3 : 1301154278
 */
public class Driver {

    public static void main(String[] args) {
        // instantiate 1 StartUp object stp
        StartUp myStartUp = new StartUp();        
        Member m;
        Project p;
        // instantiate 5 new Member objects 
        // with name = Alex, Beni, Cakra, Deni, and Eric; 
        // and add them to StartUp stp
        m = new Member("Alex");
        myStartUp.addMember( m );
        m = new Member("Beni");
        myStartUp.addMember( m );
        //...
        
        
        // create 2 Project object within the Start Up stp, 
        // with project name = project1 and project2
        myStartUp.createNewProject( "project1" );
        myStartUp.createNewProject( "project2" );
        
        // set project member as below
        // add Alex, Beni, and Deni into Project1        
        p = myStartUp.getProject( 0 );
        m = myStartUp.getMember( 0 );
        p.addMember(m); 
        m = myStartUp.getMember( 1 );
        p.addMember(m);
        //...
        
        // add Beni, Cakra, Deni, and Eric into Project2  
        p = myStartUp.getProject( 1 );
        m = myStartUp.getMember( 1 );
        p.addMember(m); 
        m = myStartUp.getMember( 2 );
        p.addMember(m);
        //...
        
        // set release one of the project
        p = myStartUp.getProject( 1 );
        myStartUp.releaseProject( p );
        
        // display the status of every member in Start Up myStartUp
        System.out.println( myStartUp.getMember( 0 ) );
        System.out.println( myStartUp.getMember( 1 ) );
        //...
        
        // display the status of every project in Start Up myStartUp
        System.out.println( myStartUp.getProject( 0 ) );
        System.out.println( myStartUp.getProject( 1 ) );
        //...
        
        // display the number of released project in Start Up stp
        //System.out.println( ... );
        
        // Try another scenario case on your own
        
    }

}
