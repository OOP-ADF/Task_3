
public class AppStore {
	private Application[] appList = new Application[100];
	private int totalApp;
	
	public void createNewApp(String appName, int appSize) {
		totalApp++;
		appList[totalApp] = new Application(appName, appSize);
	}
	public Application getApp(int id) {
		return appList[id];
	}
	public int getTotalApp() {
		return totalApp;
	}
	public Application getAppList() {
		return appList[100];
	}
	public String toString() {
		return "There are "+totalApp+" applications ready to install";
	}
}