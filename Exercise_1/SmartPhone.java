/*
Name	: Rizkiyana Prima Putra
NIM		: 1301140181
Class 	: IF - 38 - 01
*/

public class SmartPhone {
	private Application[] appList = new Application[10];
	private int totalApp = 0;
	private int memory = 0;

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public void addApplication(AppStore appStore, int appId) {
		Application newApp = appStore.getApp(appId);
		if(newApp.getAppSize() < getRemainingSize()) {
			appList[totalApp] = newApp;
			totalApp++;
			System.out.println(newApp.getAppName() + " successful installed...");
		}
		else {
			System.out.println("Your memory is Full!");
		}
	}

	public Application getApp(int id) {
		return appList[id - 1];
	}

	public int getTotalApp() {
		return totalApp + 1;
	}

	public int getRemainingSize() {
		int temp = 0;

		for(int i = 0; i < appList.length; i++) {
			if(appList[i] != null) {
				temp = temp + appList[i].getAppSize();
			}
		}

		return memory - temp;
	}

	public String toString() {
		return "Memory size " + memory + "MB, " + totalApp + " application installed, remaining memory size : " + getRemainingSize() + "MB";
	}
}
