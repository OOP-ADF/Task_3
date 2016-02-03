/* RIZMA NURVIARELDA
1301144229
IF 38 09
*/

public class AppStore {
	private Application[] appList = new Application[100];
	private int totalApp = 0;
	
	public void createNewApp (String AppName, int AppSize) {
		Application app = new Application (AppName, AppSize);
		appList[totalApp] = app;
		totalApp++;
	}
	public Application getApp (int id) {
		return appList[id];
	}
	public int getTotalApp () {
		return totalApp;
	}
	public Application[] getAppList () {
		return appList;
	}
	public String toString() { 
		return "There are "+ totalApp +" applications ready to install";
	}
}