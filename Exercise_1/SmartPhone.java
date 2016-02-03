/*
Name : Amalya Citra Pradana
Student ID : 1301140389
Class : IF-38-09
*/

public class SmartPhone {
	private Application appList[] = new Application[10];
	private static int totalApp = 0;
	private int memory = 0;
	
	public void setMemory(int memory){
		this.memory = memory;
	}
	
	public void addApplication(AppStore appStore, int appId){
		this.appList[totalApp]=appStore.getApp(appId);
		totalApp++;
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public int getRemainingSize(){
		int memoryused = memory;
		int num = 0;
		
		for (int i=0; i<appList.length; i++){
			if (appList[i]!=null){
				num+=appList[i].getappSize();
			}
		}
		return memoryused -= num;
	}
	
	public String toString(){
		return "Memory size "+Integer.toString(memory)+"MB, "+Integer.toString(totalApp)+" application installed, and remaining memory size: "+Integer.toString(getRemainingSize())+" MB";
	}
	
}
