/* Thoriq Abdul Aziz
	1301144341
	IF-38-01
*/
public class Driver{
    public static void main(String[] args) {
		AppStore aps = new AppStore();
		aps.createNewApp("app1", 100);
		aps.createNewApp("app2", 200);
		aps.createNewApp("app3", 300);
		aps.createNewApp("app4", 400);
		
		System.out.println(aps.toString());
		System.out.println(aps.getApp(1).toString());
		System.out.println(aps.getApp(2).toString());
		System.out.println(aps.getApp(3).toString());
		
		SmartPhone sm = new SmartPhone();
		
		sm.setMemory(300);
		System.out.println(sm.toString());
		sm.addAplication(aps, 0);
		sm.addAplication(aps, 1);
		System.out.println(sm.toString());
		
		
    }
}
