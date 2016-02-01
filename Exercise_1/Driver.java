/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *Aristya Wirawan-1103134329-IF3809
 * @author aris
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AppStore a = new AppStore();
        SmartPhone hp = new SmartPhone();
        a.createNewApp("app1", 100);
        a.createNewApp("app2", 200);
        a.createNewApp("app3", 300);
        a.createNewApp("app4", 400);
        System.out.println(a.toString());
        System.out.println(a.getApp(1).toString());

        hp.setMemory(300);
        System.out.println(hp.toString());

        hp.addApplication(a, 0);
        System.out.println(hp.toString());
    }

}
