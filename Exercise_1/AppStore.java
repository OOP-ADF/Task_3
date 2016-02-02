/* 
I Nyoman Tri Budhi Palantra
1301140089
IF-38-09
*/

public class AppStore {
	private Application[] appList = new Application[100];
	private int countApp=0;
	
	public void createNewApp(String appName, int appSize) {
		Application app = new Application(appName, appSize);
		appList[countApp] = app;
		countApp++;
	}
	
	public Application getApp(int id) {
		return appList[id];
	}
	
	public String toString() {
		return ("There are "+countApp+" applications ready to install");
	}
}
