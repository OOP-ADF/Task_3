public class AppStore {
	private Application [] appList = new Application [100];
	private int totalApp;
	private String appName;
	private int appSize;
	
	public void createNewApp (String appName, int appSize)  {
		this.appName = appName;
		this.appSize = appSize;
	}
	
	public Application getApp (int id) {
		return appList[id];
	}
	
	public int getTotalApp () {
		return totalApp;
	}
	
	public Application getAppList (int i) {
		return appList[i];
	}
	
	public String toString () {
		return ("Nama : " + appName + "\nSize : " + appSize);
	}
	
}
