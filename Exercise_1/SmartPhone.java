/*
Nama:	Aryaditya Hendri Pratama
Kelas:	IF3802
NIM:	1301144162
*/

public class SmartPhone {
 	private Application[] smAppList = new Application[100];
 	private int countApp;
 	private int memory;
 	
 	public void setMemory(int memory) {
 		this.memory = memory;
 	}
 	
	public void addApplication(AppStore appStore, int appId) {
 		if (getRemainingSize() >= appStore.getApp(appId).getAppSize()) {
 			smAppList[countApp]=appStore.getApp(appId);
 			countApp++;
 		}
 	}
	
	public Application getApp(int id){
 		return appList[id];
 	}
 	
 	public int getTotalApp(){
 		return totalApp;
 	}
	
 	public int getRemainingSize() {
 		int m = memory,i=0, used=0;
 		while (smAppList[i] != null) {
 			used = used + smAppList[i].getAppSize();
 			i++;
 		}
 		return m=m-used;
 	}
 	
 	public String toString() {
 		return ("memory size "+memory+", "+countApp+" application installed, remaining memory size : "+getRemainingSize()+" MB");
 	}
 }
