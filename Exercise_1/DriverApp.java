/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author iqbal
 */
public class DriverApp {
    public static void main(String [] args){
        AppStore aps = new AppStore();
        aps.createNewApp("apl1",100);
        aps.createNewApp("apl2",200);
        aps.createNewApp("apl3",300);
        aps.createNewApp("apl4",400);
        System.out.println(aps.toString());
        SmartPhone sp = new SmartPhone();
        sp.setMemory(300);
        System.out.println(sp.toString());
        sp.addAplication(aps, 1);
        sp.addAplication(aps, 3);
        sp.addAplication(aps, 2);
        System.out.println(sp.toString());;
    }
}
