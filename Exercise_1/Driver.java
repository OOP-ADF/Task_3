//Hirianinda Malsegianty S.
//1301140262
//IF 38-02

public class Driver {
	public static void main (String[] args) {
		AppStore apps = new AppStore();
		 apps.createNewApp("app1",100);
		 apps.createNewApp("app2",200);
		 apps.createNewApp("app3",300);
		 apps.createNewApp("app4",400);
		 
		 System.out.println(apps.toString());
		 
		 System.out.println( apps.getApp(2).toString());
		 
		 SmartPhone  sm = new SmartPhone ();
         sm.setMemory(300);
		 
		 System.out.println(sm.toString());
		 
		 sm.addApplication(apps,0);
	}
}

