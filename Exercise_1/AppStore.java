/*
Name	: Rizkiyana Prima Putra
NIM		: 1301140181
Class 	: IF - 38 - 01
*/

public class AppStore {
	private Application[] appList = new Application[100];
	private int totalApp = 0;

	public void createNewApp(String appName, int appSize) {
		Application newApp = new Application(appName, appSize);
		appList[totalApp] = newApp;
		totalApp++;
	}

	public Application getApp(int id) {
		return appList[id - 1];
	}

	public int getTotalApp() {
		return totalApp + 1;
	}

	public Application[] getAppList() {
		return appList;
	}

	public String toString() {
		return "There are " + (totalApp + 1) + " applications ready to install";
	}
}
