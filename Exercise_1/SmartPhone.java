//Nama : Ubassy Abdillah
//NIM : 1301148282

public class SmartPhone {
	private Application[] appList= new Application[10];
	private int totalMemory,memory,totalApp=-1;
	
	public void setMemory(int memory) {
		this.memory=memory;
		totalMemory=memory;
	}
	
	public void addApplication(AppStore appStore, int appId) {
		Application app = appStore.getAppList()[appId];
		if (app.getAppSize()<=memory){
			totalApp++;
			appList[totalApp]=app;
			memory=memory-app.getAppSize();
		}
	}

	public Application getApp(int id) {
		return appList[id];
	}
	
	public int getTotalApp() {
		return totalApp+1;
	}
	
	public int getRemainingSize() {
		return memory;
	}
	
	public String toString() {
		return "Mermory size "+totalMemory+"MB, "+(totalApp+1)+" applications installed, remaining memory size: "+memory+"MB";
	}
}
