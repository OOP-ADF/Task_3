//FAISHAL ABDILLAH
//1301144232
//IF-38-02

public class Driver{
		public static void main(String[] args) {
			AppStore aps = new AppStore();
			SmartPhone sm=new SmartPhone();
			sm.setMemory(300);
				aps.createNewApp("App1",100);
				aps.createNewApp("App2",200);
				aps.createNewApp("App3",300);
			
								
		System.out.println(aps.toString());
		System.out.println(aps.getApp(3).toString());
		System.out.println(aps.getApp(2).toString());
		System.out.println(aps.getApp(1).toString());
		System.out.println( sm.toString() );
		sm.addApplication( aps,1 );
		System.out.println( sm.toString() );
		sm.addApplication( aps,2 );
		System.out.println( sm.toString() );
		sm.addApplication( aps,3 );
	}
}