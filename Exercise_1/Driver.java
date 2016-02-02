/*
	Riksa Meidy Karim
	1301142289
	IF-38-09
*/

public class Driver{
	public static void main(String[] args){
		AppStore apps = new AppStore();
		apps.createNewApp("ap1",50);
		apps.createNewApp("ap2",150);
		apps.createNewApp("ap3",250);
		apps.createNewApp("ap4",350);
		System.out.println(apps.toString());
		System.out.println(apps.getApp(3).toString());
		
		SmartPhone s = new SmartPhone();
		s.setMemory(1000);
		System.out.println(s.toString());
		s.addApplication(apps, 0);
		s.addApplication(apps, 1);
		s.addApplication(apps, 2);
		System.out.println(s.toString());
		
		//my scenario
		SmartPhone r = new SmartPhone();
		r.setMemory(500);
		r.addApplication(apps, 3);
		r.addApplication(apps, 2);
		System.out.println(r.toString());
		
	}
}
