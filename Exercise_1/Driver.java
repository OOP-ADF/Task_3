public class Driver {
	public static void main(String[] args) {
		AppStore aps = new AppStore();
		aps.createNewApp("app1", 100);
		aps.createNewApp("app2", 200);
		aps.createNewApp("app3", 300);
		aps.createNewApp("app4", 900);
		System.out.println(aps.toString());		
		System.out.println(aps.getApp(0).toString());
		System.out.println(aps.getApp(1).toString());
		System.out.println(aps.getApp(2).toString());
		System.out.println(aps.getApp(3).toString());		
		System.out.println();		
		SmartPhone sP = new SmartPhone();
		sP.setMemory(2000);		
		sP.addApplication(aps, 0);
		sP.addApplication(aps, 1);
		sP.addApplication(aps, 2);
		sP.addApplication(aps, 3);		
		System.out.println(sP.toString());
	}
}
//AKHMAD FADILAH RAMADHAN	1301140222