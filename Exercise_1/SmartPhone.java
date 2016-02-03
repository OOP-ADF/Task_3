/*
Name : Erwin Yulizar F
NIM  : 1301144031
Class: IF-38-01
*/

public class SmartPhone{
	private Application[] appList = new Application[10];
	private int totalApp =0;
	private int memory=0;
	
	public void setMemory(int memory){
		this.memory = memory;
	}
	
	public void addApplication (AppStore appStore, int appId ){
		Application newApp = appStore.getApp(appId);
		if (newApp.getAppSize() < getRemainingSize()){
			appList[totalApp] = newApp;
			totalApp++;
			System.out.println("Application has been isntalled");
		}else System.out.println("Application size is too big");
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public int getRemainingSize(){
		int size = 0;
		for (int i=0; i<totalApp; i++){
			size = size + appList[i].getAppSize();
		}
		return (memory-size);
	}
	
	public String toString(){
		return "memory size "+memory+" MB, "+totalApp+" application installed, remaining memory size : "+getRemainingSize()+" MB ";
	}
	
}
