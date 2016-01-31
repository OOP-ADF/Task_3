/*
Name	: Rizkiyana Prima Putra
NIM		: 1301140181
Class 	: IF - 38 - 01
*/


public class Driver {
	public static void main(String[] args) {
		AppStore aps = new AppStore();
		SmartPhone sm = new SmartPhone();

		aps.createNewApp("App1", 125);
		aps.createNewApp("App2", 70);
		aps.createNewApp("App3", 210);
		aps.createNewApp("App4", 89);
		aps.createNewApp("App5", 115);

		System.out.println(aps.toString());

		System.out.println(aps.getApp(1).toString());
		System.out.println(aps.getApp(2).toString());
		System.out.println(aps.getApp(3).toString());
		System.out.println(aps.getApp(4).toString());
		System.out.println(aps.getApp(5).toString());
		System.out.println();
		sm.setMemory(500);
		sm.addApplication(aps, 1);
		sm.addApplication(aps, 2);
		sm.addApplication(aps, 3);
		sm.addApplication(aps, 4);
		sm.addApplication(aps, 5);
		System.out.println();
		System.out.println("Your smartphone status :");
		System.out.println(sm.toString());
	}
}
