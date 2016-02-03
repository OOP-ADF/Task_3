// Rana Renes Rengga-1301144351 (IF-38-01)

public class Driver
{
	public static void main(String[] args)
	{
		AppStore store1 =  new AppStore();
		
		store1.createNewApp("app1", 100);
		store1.createNewApp("app2", 50);
		store1.createNewApp("app3", 200);
		store1.createNewApp("app4", 300);

		System.out.println(store1.toString()); //status of appStore
		System.out.println("---------------------------------------");
		System.out.println(store1.getApp(0)); //status of one of the apps available in appStore
		System.out.println(store1.getApp(1));
		System.out.println("---------------------------------------");
		SmartPhone hape1 = new SmartPhone();
		hape1.setMemory(300);
		System.out.println("Before installation: " + hape1.toString()); //status smartphone
		hape1.addApplication(store1, 0);
		hape1.addApplication(store1, 1);
		// hape1.addApplication(store1, 1);
		// hape1.addApplication(store1, 2);
		// hape1.addApplication(store1, 3);
		System.out.println("---------------------------------------");
		System.out.println("After installation: " + hape1.toString()); //status smartphone setelah install
	}
}
