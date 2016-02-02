/*Nama: Adam Geraldy Katab
Kelas: IF-38-01
NIM: 1301140381*/

package Exercise_1;

public class SmartPhone {
	private Application[] appList;
	private int totalApp;
	private int memory;
	
	public SmartPhone() {
		appList = new Application[10];
		totalApp = 0;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public void addApplication(AppStore appStore, int appId) {
		Application new_app = appStore.getApp(appId);
		if(new_app.getAppSize() <= getRemainingSize()) {
			if(getTotalApp() < 10) {
				appList[getTotalApp()] = new_app;
			}
		}
	}
	
	public int getTotalApp() {
		totalApp = 0;
		for(Application app: appList) {
			if(app != null)
				totalApp++;
		}
		return totalApp;
	}
	
	public int getRemainingSize() {
		int used_memory = 0;
		for(Application app: appList) {
			if(app != null) {
				used_memory += app.getAppSize();
			}
		}
		return memory - used_memory;
	}
	
	public String toString() {
		return "Memory size: " + memory + "MB, " + getTotalApp() + " apps installed. (" + getRemainingSize() +
				"MB remaining)";
	}
}
