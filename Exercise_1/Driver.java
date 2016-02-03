//Agung Suhendar_1301140279_IF 38-09

public class Driver{
	public static void main(String[] args){
		AppStore apS = new AppStore();
		SmartPhone sm = new SmartPhone();
		
		apS.createNewApp( "app1" , 100 );
		apS.createNewApp( "app2" , 200 );
		apS.createNewApp( "app3" , 300 );
		apS.createNewApp( "app4" , 400 );
		
		System.out.println( apS.toString() );
		System.out.println( apS.getApp( 2 ).toString() );
		
        sm.setMemory(300);
		
		System.out.println(sm.getTotalApp());
		System.out.println(sm.getMem());
		System.out.println(sm.toString() );
		
		sm.addApplication(apS,1);
		System.out.println(sm.toString());
		
		sm.addApplication(apS,3);
		System.out.println(sm.toString());
		
		sm.addApplication( apS, 2 );
		System.out.println( sm.toString() );
		
	}
}

