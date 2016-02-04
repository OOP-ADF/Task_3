//Anang Kurniawan
//1301140192
//IF 38 02

public class Driver{
	public static void main(String[] args){
		AppStore aps = new AppStore();
		
		aps.createNewApp( "app1" , 100 );
		
		System.out.println( aps.toString() );
		
		System.out.println( aps.getApp( 0 ).toString() );
		
		SmartPhone sm = new SmartPhone();
		
		sm.setMemory(300);
		
		System.out.println( sm.toString() );
		
		sm.addApplication( aps, 0 );
		System.out.println( sm.toString() );
	}
}