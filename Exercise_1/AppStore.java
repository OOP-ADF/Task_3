//Nama : Ubassy Abdillah
//NIM : 1301148282

public class AppStore {
	private Application app;
	private Application[] appList= new Application[100];
	private int totalApp=-1;
	
	public void createNewApp(String appName, int appSize) {
		totalApp++;
		app=new Application(appName,appSize);
		appList[totalApp]=app;
	}

	public Application getApp(int id) {
		return appList[id];
	}
	
	public int getTotalApp() {
		return totalApp+1;
	}
	
	public Application[] getAppList() {
		return appList;
	}
	
	public String toString() {
		return "There are "+(totalApp+1)+" applications ready to install";
	}
}
