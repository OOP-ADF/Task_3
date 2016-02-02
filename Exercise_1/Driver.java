// NAMA : Alfian Pamungkas Sakawiguna
// KELAS : IF-38-01
// NIM : 1301144411

public class Driver{
  public static void main(String[] args) {
    AppStore apps=new AppStore();
    
    apps.createNewApp("Learn Al-Qur'an",80);
	  apps.createNewApp("Mp3 Qur'an",45);
	  apps.createNewApp("Tausiah",55);
    
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
