//Name 		 : Mohammad Zakie Faiz Rahiemy
//Student ID : 1301144422
//Class 	 : IF-38-02

public class SmartPhone{
	private Application[] appList = new Application[10];
	private int totalApp = 0;
	private int memory;
	
	public void setMemory(int memory){
		this.memory=memory;
	}
	
	public void addApplication(AppStore appStore, int appId){
		Application app = appStore.getAppList()[appId];
		int remain = getRemainingSize();
		if (app.getAppSize()<=remain){
			appList[totalApp]=app;
			totalApp++;
		}else{
			System.out.println("Go get a new memory, your smartphone memory is full");
		}
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public int getRemainingSize(){
		int usedMemory=0;
		Application app;
		for (int i=0;i<totalApp;i++){
			app = getApp(i);
			usedMemory = usedMemory + app.getAppSize();
		}
		return (memory-usedMemory);
	}
	
	public String toString(){
	int remain = getRemainingSize();
	return ("Memory size "+memory+"MB, "+totalApp+" application installed, remaining memory size: "+remain+"MB");
	}
}
