// Name : Rizza Aulia Rahman
// Student ID : 1301144231
// Class : IF-38-01

public class AppStore {
	private Application[] appList = new Application[100];
	private int totalApp;
	
	public void createNewApp(String appName, int appSize) {
		Application app = new Application(appName, appSize);
		if (totalApp < appList.length) {
			appList[totalApp] = app;
			totalApp++;
		}
	}
	public Application getApp(int id) {
		return appList[id];
	}
	public int getTotalApp() {
		return totalApp;
	}
	public Application[] getAppList() {
		Application[] app = new Application[100];
		for (int i = 0; i < appList.length; i++) {
			app[i] = appList[i];
		}
		return app;
	}
	public String toString() {
		String a = "There are "+totalApp+" Applications ready to install";
		return a;
	}
}
