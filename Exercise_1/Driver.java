/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver31;

/**
 *
 * @author mahasiswabelajar7[1301144342]
 * Class : IF 38 02
 * Date : 2/2/2016
 */
public class Driver31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AppStore apps=new AppStore();
    
        apps.createNewApp("Learn Al-Qur'an",78);
	apps.createNewApp("Mp3 Qur'an",45);
	apps.createNewApp("Islamic Center",60);
    
        System.out.println(apps.toString());
	  
	System.out.println(apps.getApp(0).toString());
	System.out.println(apps.getApp(1).toString());
	System.out.println(apps.getApp(2).toString());
    
        SmartPhone SmartPhoneMem=new SmartPhone();
    
        SmartPhoneMem.setMemory(2000);
    
        SmartPhoneMem.addApplication(apps,2);
    
        System.out.println(SmartPhoneMem.toString());
    }
    
}
