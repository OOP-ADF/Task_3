//@auth:Irfan Trianto/1301144111/IF-38-01

public class SmartPhone {

	//definisi atribut
	private Application[] appList =  new Application[10];
	private int totalApp = 0;
	private int memory;
	
	//definisi method
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public void addApplication(AppStore appStore, int appId) {
		if(appStore.getApp(appId).getappSize() < getRemainingSize()) {
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
		int a = 0;
		if(getTotalApp() > 0) {
			for(int i = 0; i < getTotalApp(); i++) {
				a += appList[i].getappSize();
			}
		}
		return memory - a;
	}
	
	public String toString() {
		return "Memory Size " + getRemainingSize() + ", " + getTotalApp() + " application installed, remaining memory size : " +  getRemainingSize() + " MB";
	}
}
