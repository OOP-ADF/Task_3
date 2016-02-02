/* 
Nama  : Muhammad Yuslan Abubakar
NIM   : 1301141071
Kelas : IF-38-01
*/

public class AppStore {
	private Application[] appList = new Application[100];
	private int totalApp = 0;
	
	public void createNewApp(String appName, int appSize) {
		Application apps = new Application(appName, appSize);
		appList[totalApp] = apps;
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
		return ("There are " + getTotalApp() + " applications ready to install");
	}
}
