// Name : Rizza Aulia Rahman
// Student ID : 1301144231
// Class : IF-38-01

public class Smartphone {
	private Application[] appList = new Application[10];
	private int totalApp;
	private int memory;
	private int remain;
	
	public void setMemory(int memory) {
		this.memory = memory;
		this.remain = memory;
	}
	public void addApplication(AppStore appStore, int appId) {
		if (totalApp < appList.length) {
			if (remain >= appStore.getApp(appId).getAppSize()) {
				appList[totalApp] = appStore.getApp(appId);
				remain = remain - appList[totalApp].getAppSize();
				totalApp++;
			} else System.out.println("Not enough memory for your app(s) installation");
		} else System.out.println("No more space(s) for your app(s) installation");
	}
	public Application getApp(int id) {
		return appList[id];
	}
	public int getTotalApp() {
		return totalApp;
	}
	public int getRemainingSize() {
		return remain;
	}
	public String toString() {
		String b = "Memory size "+memory+" MB, "+totalApp+" Applications installed, Remaining memory size : "+remain+" MB";
		return b;
	}
}
