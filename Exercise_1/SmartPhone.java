/*
Anita Auliani
1301144349
IF-38-09
*/

public class SmartPhone {
	private Application appList[] = new Application[10];
	private static int totalApp = 0;
	private int memory = 0;
	
	public void addApplication(AppStore appStore, int appId){
		if (getRemainingSize()>=appStore.getApp(appId).getappSize())
		{
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public void setMemory(int memory){
		this.memory = memory;
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public int getRemainingSize(){
		return memory;
	}
	
	public String toString(){
		return "Memory size "+memory+"MB, "+totalApp+" application installed, and remaining memory size: "+memory+" MB";
	}
	
}