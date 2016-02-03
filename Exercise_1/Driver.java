// Nama : Andhika Gilang K
// Kelas : IF-38-01
// NIm : 1301140361

public class Driver{
	public static void main ( String[] args ){
		AppStore apps = new AppStore();
		
		apps.createNewApp("test1",100);
		apps.createNewApp("test2",400);
		
		System.out.println(apps.toString());
		
		System.out.println(apps.getApp(0).toString());
		System.out.println(apps.getApp(1).toString());
		System.out.println();
		
		Smartphone nokia = new Smartphone();
		nokia.setMemory(1000);
		
		nokia.addApplication(apps,0);
		nokia.addApplication(apps,1);
		System.out.println();
		
		System.out.println(nokia.toString());
		
	}
}
