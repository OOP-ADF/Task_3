/*
* Name : Dede Kiswanto
* NIM : 1301140171
* Class : IF-38-01
* Ket : Not Tested
*/

public class SmartPhone {
	
	private Application[] appList = new Application[10];
	private int totalApp = 0;
	private int memory = 0;

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public void addApplication(AppStore appStore, int appId) {
		Application addApp = appStore.getApp(appId);
		if(addApp.getAppSize() < getRemainingSize()) {
			appList[totalApp] = addApp;
			totalApp++;
			System.out.println(addApp.toString() + " Installed");
		} else {
			System.out.println("Your memory is full, please wipe out you memory");
		}
	}

	public Application getApp(int id) {
		return appList[id];
	}

	public int getTotalApp() {
		return totalApp;
	}

	public int getRemainingSize() {
		int currentSize = 0;
		for (int i = 0; i < totalApp; i++){
			currentSize += appList[i].getAppSize();
		}
		return memory - currentSize;
	}

	public String toString() {
		return "memory size " + memory + "MB , " + totalApp + " application installed, remaining memory size : " + getRemainingSize() +"MB";
	}

}
