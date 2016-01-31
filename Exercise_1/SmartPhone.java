/*Nama : Dainty Amanda Fathurrohmi
Nim : 1301140062
Kelas : IF 38-02*/

public class SmartPhone {
	private Application[] smAppList = new Application[100];
	private int totalApp;
	private int memory;
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public int getRemainingSize() {
		int m = memory;
		int i, used;
		i=0;
		used=0;
		while (smAppList[i] != null) {
			used = used + smAppList[i].getAppSize();
			i++;
		}
		return m=m-used;
	}
	
	public void addApplication(AppStore appStore, int appId) {
		if (getRemainingSize() >= appStore.getApp(appId).getAppSize()) {
			smAppList[totalApp]=appStore.getApp(appId);
			totalApp++;
		}
	}
	
 	public String toString() {
		return ("memory size "+memory+"MB, "+totalApp+" application installed, remaining memory size : "+getRemainingSize()+"MB");
	}
}
