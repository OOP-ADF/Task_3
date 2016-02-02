//Nama		: Febby Febriansyah
//NIM		: 1301140371
//Kelas		: IF-38-01

public class Driver{
	public static void main(String[] args){
		AppStore aps = new AppStore();
		
		aps.createNewApp("app1",100);
		aps.createNewApp("app2",200);
		aps.createNewApp("app3",300);
		aps.createNewApp("app4",400);
		System.out.println(aps.toString());
		System.out.println(aps.getApp(2).toString());
		
		SmartPhone sm =  new SmartPhone();
		sm.setMemory(300);
		System.out.println(sm.toString());
		for(int i = 0;i <= 3;i++){
			if(sm.getRemainingSize() <= aps.getApp(i).getappSize()){
				System.out.println("\ninsufficient storage");
				System.out.println();
			}
			else{
				sm.addApplication(aps,i);
				System.out.println(sm.toString());
			}
		}
	}
}
