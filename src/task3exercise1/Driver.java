/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3exercise1;

/**
 *NIM 1 :1301154273
 *NIM 2 :1301154255 
 *NIM 3 :1301154203
 */
public class Driver{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AppStore aps = new AppStore();

 
        aps.createNewApp( "app1" , 100 );
        aps.createNewApp( "app2" , 200 );
        aps.createNewApp( "app3" , 300 );
        aps.createNewApp( "app4" , 400 );
        
     
        System.out.println( aps );
        

        System.out.println( aps.getApp( 2 ) );
        
        
  
        SmartPhone sm = new SmartPhone();
        sm.setMemory(300);
        
 
        System.out.println( sm );
        
        sm.addApplication( aps, 1 );
        System.out.println(sm);
        sm.addApplication( aps, 3 );
        System.out.println(sm);
        sm.addApplication( aps, 2 );
        System.out.println(sm);
        
        
    }

}