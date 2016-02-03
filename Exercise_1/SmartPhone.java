public class SmartPhone {
	private Application[] appList = new Application[10];
	private int totalApp = 0;
	private int memory;
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public void addApplication(AppStore appStore, int appid) {
		Application a = appStore.getApp(appid);
		appList[totalApp] = a;
		totalApp++;
	}
	
	public Application getApp(int id) {
		return appList[id];
	}
	
	public int getTotalApp() {
		return totalApp;
	}
	
	public int getRemainingSize() {
		int temp = 0;
		for (int i=0; i<appList.length; i++) {
			if (appList[i] != null)
			{
				temp=temp+appList[i].getAppSize();
			}
		}
		return memory-temp;
	}
	
	public String toString() {
		return ("Memory size "+memory+"MB, "+getTotalApp()+" application installed, remainging memory size: "+getRemainingSize()+"MB");
	}
}
