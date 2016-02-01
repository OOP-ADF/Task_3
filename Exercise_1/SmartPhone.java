//Muhammad Andika
//1301140145
//IF 38-09

public class SmartPhone {
	
	private Application[] AppList = new Application[100];
	private int totalApp = 0;
	private int memory = 0;
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public int getRemainingSize() {
		int temp = 0;

		for(int i = 0; i < AppList.length; i++) {
			if(AppList[i] != null) {
				temp = temp + AppList[i].getAppSize();
			}
		}

		return memory - temp;
	}
	
	public void addApplication(AppStore appStore, int appId) {
		Application newApp = appStore.getApp(appId);
		if(newApp.getAppSize() <= getRemainingSize()) {
			AppList[totalApp] = newApp;
			totalApp++;
		}
	}
	
	public String toString() {
		return ("memory size "+memory+"MB, "+totalApp+" application installed, remaining memory size : "+getRemainingSize()+"MB");
	}
}