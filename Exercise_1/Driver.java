/*
*name  : I Putu Prima Ananda
*class : IF-38-01
*NIM   : 1301144291
*/

public class Driver {
	public static void main(String[] args){
		AppStore apz = new AppStore();
		apz.createNewApp("app1",100);
		apz.createNewApp("app2",200);
		apz.createNewApp("app3",300);
		apz.createNewApp("app4",400);
		System.out.println(apz.toString());
		System.out.println("Available Apps on AppStore :");
		for (int i = 0; i<apz.getTotalApp(); i++){
			System.out.println("app-"+(i+1)+" "+apz.getApp(i).toString());
		}
		SmartPhone sm = new SmartPhone();
		sm.setMemory(300);
		System.out.println(sm.toString());
		sm.addApplication(apz,0);
		System.out.println(sm.toString());
		sm.addApplication(apz,2);
		System.out.println(sm.toString());
		sm.addApplication(apz,1);
		System.out.println(sm.toString());
	}
}
