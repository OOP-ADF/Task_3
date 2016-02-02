
public class Driver{
	public static void main(String[] args){
		AppStore aps=new AppStore();
		
		aps.createNewApp("periscope",45);
		aps.createNewApp("instagram",50);
		aps.createNewApp("twitter",50);
		aps.createNewApp("path",65);
		
		System.out.println(aps.toString());
		System.out.println(aps.getApp(1).toString());
		SmartPhone sm=new SmartPhone();
		sm.setMemory(1000);
		System.out.println(sm.toString());
		sm.addApplication(aps,1);
		System.out.println(sm.toString());
	}
}
