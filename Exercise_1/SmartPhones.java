package task_3_1;

public class SmartPhones {
 	private Application[] appList = new Application[10];
 	private int totalApp;
 	private int memory;
 	public void setMemory(int memory) {
 	this.memory = memory;}
 	public void addApplication(AppStore appStore, int appId) {
 		if(getRemainingSize()>=appStore.getApp(appId).getSizeApp()) {
             totalApp++;
             appList[totalApp] = appStore.getApp(appId);}
 	}
 	public Application getApp(int id) {
 		return appList[id]; 	}
 	public int getTotalApp() {
 		return totalApp; 	}
 	public int getRemainingSize() {
 		int temp = 0;
         int temp2 = memory;
         for(int i=1;i<appList.length;i++) {
             if(appList[i]!=null) {
                 temp+=appList[i].getSizeApp();}
         }
         return temp2-=temp; 	}
 	public String toString () {
 		return "memory size "+memory+", "+totalApp+" application installed, remaining memory size: "+getRemainingSize();}
 }

