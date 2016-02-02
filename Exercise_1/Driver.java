public class Driver {
	public static void main(String[] args) {
		AppStore apps = new Appstore();
		SmartPhone sp = new SmartPhone();
		apps.createNewApp("apps1",100);
		apps.createNewApp("apps2",200);
		apps.createNewApp("apps3",300);
		apps.createNewApp("apps4",400);
		apps.createNewApp("apps5",500);
		System.out.println(apps.toString());
		System.out.println(apps.getApp(2).toString());
		sp.setMemory(300);
		System.out.println(sp.toString());
		sp.addApplication(apps,app1);
		System.out.println(sp.toString());
		sp.addApplication(apps,app2);
		System.out.println(sp.toString());
	}
}

