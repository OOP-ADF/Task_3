/*Nama : Dainty Amanda Fathurrohmi
Nim : 1301140062
Kelas : IF 38-02*/

public class AppStore {
	private Application[] appList = new Application[100];
 	private int totalApp=0;
 	
 	public void createNewApp(String appName, int appSize) {
 		Application app = new Application(appName, appSize);
 		appList[totalApp] = app;
 		totalApp++;
 	}
 	
 	public Application getApp(int id) {
		return appList[id];
 	}
 	
	public String toString() {
 		return ("There are "+totalApp+" applications ready to install");
	}
	
	
}
