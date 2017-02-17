package task3exercise1;

/**
 * NIM 1 : 1301154278 
 * NIM 2 : 1301150012
 * NIM 3 : 1301154222
 */
public class Driver {

    public static void main(String[] args) {
        //instantiate 1 AppStore object aps        
        AppStore aps = new AppStore();

        // create 4 new Applications within the App Store aps, 
        // with app name = app1, app2, app3, and app4; 
        // and app size 100, 200, 300, and 400 respectively
        aps.createNewApp( "app1" , 100 );
        aps.createNewApp( "app2" , 100 );
        aps.createNewApp( "app3" , 100 );
        
        // display the status of App Store aps
        System.out.println( aps );
        
        // display the status of one of application available on App Store aps
        System.out.println( aps.getApp( 2 ) );
        
        
        // instantiate 1 SmartPhone object sm, set the memory size 300
        Smartphone sm = new Smartphone();
        sm.setMemory(300);
        
        // display the status of SmartPhone sm        
        System.out.println( sm );
        
        // install applications (in sequence) 
        // app1, app3, and app2 in SmartPhone sm
        // display the status of SmartPhone sm after each installation
        sm.addApplication( aps, 1 );
        System.out.println(sm);
        sm.addApplication( aps, 2 );
        System.out.println(sm);
        sm.addApplication( aps, 3 );
        System.out.println(sm); 
        
        // Try another scenario case on your own
        
    }

}
