//@auth:Irfan Trianto/1301144111/IF-38-01

public class Driver{
     public static void main(String[] args) {
 		
 		//create objek AppStore
 		AppStore aps = new AppStore();
 		
 		//insert apps to AppStore
 		aps.createNewApp("LINE", 100);
 		aps.createNewApp("BBM", 200);
 		aps.createNewApp("Telegram", 300);
 		aps.createNewApp("app4", 400);

 		//output data in AppStore
 		System.out.println(aps.toString());
		System.out.println(aps.getApp(1).toString());
		
		//create Smartphone objek
 		SmartPhone sm = new SmartPhone();
		
		//setmemory SmartPhone
		sm.setMemory(300);
		
		//output data SmartPhone
		System.out.println(sm.toString());
		sm.addApplication( aps, 0 );
 		System.out.println(sm.toString());
 		
     }
 }
