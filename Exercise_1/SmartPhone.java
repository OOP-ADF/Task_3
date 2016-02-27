public class SmartPhone {
	private Application[] appList = new Application[10];
	private int totalApp;
	private int memory;
	private int total;
	
	public void setMemory (int memory) {
		this.memory = memory;
	}
	
	public int getRemainingSize () {
		int x;
		x = 0;
		for (int i=0; i < totalApp; i++) {
			x = x + appList[i].getappSize();
		}
		return (memory - x);
	}
	
	public void addApplication (AppStore appStore, int appId) {
		if (appStore.getApp(appId).getappSize() < getRemainingSize()) {
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
		else {
			System.out.println("Memori Full");
		}
	}
	
	public Application getApp (int id) {
		return appList[id];
	}
	
	public int getTotalApp () {
		return totalApp;
	}

	
	public String toString () {
		return ("Memory: " + memory + "mb, "+totalApp+" application installed");
	}
	
	
	
}