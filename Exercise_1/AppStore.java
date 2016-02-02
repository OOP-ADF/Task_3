/*Nama: Adam Geraldy Katab
Kelas: IF-38-01
NIM: 1301140381*/

public class AppStore {
	private Application[] appList;
	private int totalApp = 0; // redundant?
	
	public AppStore() {
		appList = new Application[100];
	}
	
	public void createNewApp(String appName, int appSize) {
		Application app = new Application(appName, appSize);
		appList[getTotalApp()] = app;
	}
	
	public int getTotalApp() {
		for(Application app: appList) {
			if(app != null)
				totalApp++;
		}
		return totalApp;
	}
	
	public Application getApp(int id) {
		return appList[id];
	}
	
	public Application[] getAppList() {
		return appList;
	}
	
	public String toString() {
		return "There are " + getTotalApp() + " apps available!";
	}
}
