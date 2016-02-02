/*
  Fauzy Alfy A.
  1301144269
  IF-38-09
*/
public class Driver {
	public static void main(String[] args) {
		AppStore aps = new Appstore();
		SmartPhone sm = new SmartPhone();
		aps.createNewApp("app1",100);
		aps.createNewApp("app2",200);
		aps.createNewApp("app3",300);
		aps.createNewApp("app4",400);
		aps.createNewApp("app5",500);
		System.out.println(aps.toString());
		System.out.println(aps.getApp(2).toString());
		sm.setMemory(300);
		System.out.println(sm.toString());
		sm.addApplication(aps,app1);
		System.out.println(sm.toString());
		sm.addApplication(aps,app2);
		System.out.println(sm.toString());
	}
}

