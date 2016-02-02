/* 
Nama  : Muhammad Yuslan Abubakar
NIM   : 1301141071
Kelas : IF-38-01
*/

public class SmartPhone {
	private Application[] appList = new Application[10];
	private int totalApp = 0;
	private int memory;
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public void addApplication(AppStore appStore, int appId) {
		if (appStore.getApp(appId).getAppSize() < getRemainingSize()) {
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
		else {
			System.out.print("Memory is full");
		}
	}
	
	public Application getApp(int id) {
		return appList[id];
	}
	
	public int getTotalApp() {
		return totalApp;
	}
	
	public int getRemainingSize() {
		int tampung = 0;
		for (int i = 0; i < appList.length; i++) {
			if (appList[i] != null) {
				tampung = tampung + appList[i].getAppSize();
			}
		}
		return memory - tampung;
	}
	
	public String toString() {
		return ("Memory size " + memory + "MB, " + getTotalApp() + " application installed, remaining memory size: " + getRemainingSize() + "MB");
	}
}
