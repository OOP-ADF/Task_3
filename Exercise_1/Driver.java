//Name 		 : Mohammad Zakie Faiz Rahiemy
//Student ID : 1301144422
//Class 	 : IF-38-02

public class Driver{
	public static void main(String[] args){
		AppStore playStore = new AppStore();
		playStore.createNewApp("MOVElution Lab",100);
		playStore.createNewApp("iGracias Error",200);
		playStore.createNewApp("Nelpon University Connect",300);
		playStore.createNewApp("BojongSoang SmartCity",400);
		System.out.println(playStore.toString());
		System.out.println(playStore.getApp(3).toString());
		SmartPhone uPhone = new SmartPhone();
		uPhone.setMemory(300);
		System.out.println(uPhone.toString());
		uPhone.addApplication(playStore,0);
		System.out.println(uPhone.toString());
		uPhone.addApplication(playStore,2);
		System.out.println(uPhone.toString());
		uPhone.addApplication(playStore,1);
		System.out.println(uPhone.toString());
	}
}
