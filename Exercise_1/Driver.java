/*
* Name : Dede Kiswanto
* NIM : 1301140171
* Class : IF-38-01
* Ket : Not Tested
*/

public class Driver {
	
	public static void main(String[] args) {

		AppStore aps = new AppStore();
		aps.createNewApp("app1", 100);
		aps.createNewApp("app2", 200);
		aps.createNewApp("app3", 300);
		aps.createNewApp("app4", 400);

		System.out.println(aps.toString());
		System.out.println(aps.getApp(2).toString());

		SmartPhone sm = new SmartPhone();
		sm.setMemory(3000);

		System.out.println(sm.toString());

		sm.addApplication(aps, 1);
		sm.addApplication(aps, 2);
		sm.addApplication(aps, 3);

		sm.toString();		

		// My Test Case
		// List App in AppStore
		System.out.println("\nShow List Apps in AppStore : ");
		for(int i = 0; i < aps.getTotalApp(); i++){
			System.out.println(aps.getApp(i).toString());
		}

	}	
}