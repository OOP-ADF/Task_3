/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3exercise1;
/**
 * NIM 1 : 1301154245 
 * NIM 2 : 1301154413
 * NIM 3 : 1301150021
 * 
 */
public class Driver {

    public static void main(String[] args) {
        //instantiate 1 AppStore object aps        
        AppStore aps = new AppStore();

        // create 4 new Applications within the App Store aps, 
        // with app name = app1, app2, app3, and app4; 
        // and app size 100, 200, 300, and 400 respectively
        aps.createNewApp("App 1",10);
        aps.createNewApp("App 2",50);
        aps.createNewApp("App 3",100);
        aps.createNewApp("App 4",150);

        // display the status of App Store aps
        System.out.println(aps);

        // display the status of one of application available on App Store aps
        System.out.println(aps.getApp(2));

        // instantiate 1 SmartPhone object sm, set the memory size 300
        SmartPhone sm = new SmartPhone();
        sm.setMemory(300);

        // display the status of SmartPhone sm        
        System.out.println(sm);

        // install applications (in sequence) 
        // app1, app3, and app2 in SmartPhone sm
        // display the status of SmartPhone sm after each installation
        sm.addApplication(aps,1);
        System.out.println(sm);
        sm.addApplication(aps,2);
        System.out.println(sm);
        sm.addApplication(aps,3);
        System.out.println(sm);

        // Try another scenario case on your own
    }
}