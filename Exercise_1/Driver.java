
/*
Name : Erwin Yulizar F
NIM  : 1301144031
Class: IF-38-01
*/

public class Driver{
	public static void main(String[] args){
		AppStore store = new AppStore();
		
		store.createNewApp("app1",100);
		store.createNewApp("app2",200);
		store.createNewApp("app3",300);
		store.createNewApp("app4",400);
		
		System.out.println(store.toString());
		System.out.println(store.getApp(2).toString());
		
		SmartPhone phone1 = new SmartPhone();
		phone1.setMemory(300);
		
		System.out.println(phone1.toString());
		
		phone1.addApplication(store,1);
		System.out.println(phone1.toString());
		
		phone1.addApplication(store,2);
		System.out.println(phone1.toString());
		
		phone1.addApplication(store,3);
		System.out.println(phone1.toString());
	}
}
