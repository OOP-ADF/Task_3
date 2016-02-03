/*
Name : Amalya Citra Pradana
Student ID : 1301140389
Class : IF-38-09
*/

public class Driver{
	public static void main(String[] args){
		AppStore aps = new AppStore();
		SmartPhone sm = new SmartPhone();
		
		aps.createNewApp("app1",100);
		aps.createNewApp("app2",100);
		aps.createNewApp("app3",200);
		aps.createNewApp("app4",200);
		aps.createNewApp("app5",100);
		System.out.println(aps.toString());
		System.out.println(aps.getApp(1).toString());
		
		sm.setMemory(1000);
		System.out.println(sm.toString());
		
		sm.addApplication(aps, 1);
		System.out.println(sm.toString());
	}
}


