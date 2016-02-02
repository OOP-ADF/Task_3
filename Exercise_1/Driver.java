// Syahrizal Hafid Rozaqi IF-38-02 1301144252

public class Driver {
	public static void main(String[] args) {
		AppStore aps = new AppStore();
		aps.createNewApp("app1", 100);
		aps.createNewApp("app2", 200);
		aps.createNewApp("app3", 300);
		aps.createNewApp("app4", 400);
		
		System.out.println(aps.getApp(0).toString());
		
		SmartPhone sm = new SmartPhone();
		sm.setMemory(300);
		System.out.println(sm.toString());

		sm.addApplication(aps, 0);
		System.out.println(sm.toString());

		sm.addApplication(aps, 2);
		System.out.println(sm.toString());
		
		sm.addApplication(aps, 1);
		System.out.println(sm.toString());
		
		System.out.println("List of AppStore apps:");
		for(Application app: aps.getAppList()) {
			if(app != null) {
				System.out.println("\""+ app.getAppName() +"\" - "+ app.getAppSize() +"MB.");
			}
		}
	}
}