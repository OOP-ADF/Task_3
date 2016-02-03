// Nama : Muhammad Hariz Arasy
// NIM	: 1301140259
// Kelas: IF-38-09

public class SmartPhone {
	private Application[] appList = new Application[10];
	private int totalApp = 0;
	private int memory;
	private int usedMemory = 0;
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public void addApplication(AppStore appStore, int appId) {
		if ((totalApp <=10) &&
		(getRemainingSize() >= appStore.getApp(appId).getAppSize())) {
			appList[totalApp] = appStore.getApp(appId);
			usedMemory = usedMemory + appList[totalApp].getAppSize();
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
		return (memory - usedMemory);
	}
	
	public String toString() {
		return ("Memory size " + memory + "MB, " + totalApp + 
		" application installed, remaining memory size: " +
		getRemainingSize() + "MB");
	}
}
