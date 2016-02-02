/* RIZMA NURVIARELDA
1301144229
IF 38 09
*/

public class Driver {
	public static void main(String[] args) {
		AppStore apps = new AppStore();
		apps.createNewApp("Application 1", 50);
		apps.createNewApp("Application 2", 60);
		apps.createNewApp("Application 3", 80);
		apps.createNewApp("Application 4", 100);
		System.out.println(apps.toString());
		System.out.println(apps.getApp(2).toString());
		
		SmartPhone sp = new SmartPhone();
		sp.setMemory(300);
		System.out.println(sp.toString());
		sp.addApplication(apps, 1);
		System.out.println(sp.toString());
	}
}
