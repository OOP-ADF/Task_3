/*
Nama		: Zardarian Ahadika N.
NIM			: 1301140112
Kelas		: IF-38-02
*/

public class AppStore {
	private Application appList[] = new Application[10];
	private int totalApp;
	
	public void createNewApp(String appName, int appSize){
		appList[totalApp] = new Application(appName,appSize);
 		totalApp++;
	}
	
	public Application getApp(int id) {
 		return appList[id];
 	}
	
	public int getTotalApp() {
 		return totalApp;
 	}
 	
 	public Application[] getAppList() {
 		return appList;
 	}
 	
 	public String toString() {
 		return "There are "+totalApp+" applications ready to install";
 	}
}
