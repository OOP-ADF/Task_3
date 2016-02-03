/* RIZMA NURVIARELDA
1301144229
IF 38 09
*/

public class SmartPhone {
	private Application[] appList = new Application[10];
	private int totalApp;
	private int memory;
	
	public void setMemory (int a) {
		this.memory = a;
	}
	public Application getApp (int id) {
		return appList[id];
	}
	public int getTotalApp () {
		return totalApp;
	}
	public int getRemainingSize() {
		int totalMemory = memory;
		int value = 0;
		for (int i = 0; i<appList.length; i++) {
			if (appList[i] != null) {
				value = value + appList[i].getSize();
			}
		}
		totalMemory = totalMemory - value;		
		return totalMemory;
	}
	public void addApplication (AppStore appStore, int appId) {
		if (getRemainingSize() >= appStore.getApp(appId).getSize()) {
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
	}
	
	public String toString() { 
		return "Memory size " + memory +", " + totalApp + " application installed, remaining memory size: " + getRemainingSize();
	}
}