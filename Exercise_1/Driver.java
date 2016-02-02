// Name : Rizza Aulia Rahman
// Student ID : 1301144231
// Class : IF-38-01

public class Driver {
	public static void main (String[] args) {
		AppStore aps = new AppStore();
		aps.createNewApp("app1",100);
		aps.createNewApp("app2",200);
		aps.createNewApp("app3",300);
		aps.createNewApp("app4",400);
		System.out.println(aps.toString());
		System.out.println("App(s) List");
		for (int i = 0; i < aps.getTotalApp(); i++) {
			System.out.println((i+1)+". "+aps.getApp(i).toString());
		}
		Smartphone sm = new Smartphone();
		sm.setMemory(300);
		System.out.println();
		System.out.println(sm.toString());
		sm.addApplication(aps,0);
		System.out.println(sm.toString());
		sm.addApplication(aps,2);
		System.out.println(sm.toString());
		sm.addApplication(aps,1);
		System.out.println(sm.toString());
	}
}
