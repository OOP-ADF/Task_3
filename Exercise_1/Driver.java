/*
Hani Dika Riani
1301144012
IF-38-02
*/

public class Driver{
	public static void main(String[] args){
		AppStore aps = new AppStore();
		aps.createNewApp("App A",100);
		aps.createNewApp("App B",200);
		aps.createNewApp("App C",300);
		aps.createNewApp("App D",400);
		System.out.println(aps.toString());
		System.out.println(aps.getApp(2).toString());
	
		SmartPhone sm = new SmartPhone();	
		sm.setMemory(300);
		System.out.println(sm.toString());
		sm.addApplication(aps, 1);
		sm.addApplication(aps, 3);
		sm.addApplication(aps, 2);
		System.out.println(sm.toString());
	}
}
