// Nama : Andhika Gilang K
// Kelas : IF-38-01
// NIm : 1301140361

public class AppStore {
	private int totalApp=0;
	private Application [] appList = new Application[100];
	
	public void createNewApp(String appName, int appSize) {
		Application apps = new Application(appName,appSize);
		appList[totalApp]= apps;
		totalApp++;
	}
	
	public Application getApp(int id) {
		return appList[id];
	}
	
	public int getTotalApp() {
		return  totalApp;
	}
	
	public Application[] getAppList() {
		return appList;
	}
	
	public String toString() {
		return (" There are " +getTotalApp()+"  ready to install");
	}
}
