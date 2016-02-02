/*Nama	: Windy Israniati Jihan
NIM		: 1301144309
Kelas	: IF-38-09 */

public class SmartPhone {
	private Application[] appList = new Application[10];
	private int totalApp;
	private int memory;
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public void addApplication(AppStore appStore, int appId) {
		if (getRemainingSize()>=appStore.getApp(appId).getAppSize()) {
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
	}
	public Application getApp(int id) {
		return appList[id];
	}
	public int getTotalApp() {
		return totalApp;
	}
	public int getRemainingSize() {
		int mem = memory;
		int sisamemory;
		sisamemory = 0;
		for (int i=0; i<appList.length; i++) {
			if (appList[i] != null) {
				sisamemory = sisamemory + appList[i].getAppSize();
			}
		}
		mem = mem - sisamemory;
		return mem;
	}
	
	public String toString() {
		return "memory size"+memory+"MB, "+totalApp+"application installed, remaining memory size: "+getRemainingSize()+"MB";
	}
}

