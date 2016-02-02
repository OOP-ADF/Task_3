//Dzakyta Afuzagani
//1301140122
//IF 38 02

public class AppStore{
	private Application app;
	private Application[] appList= new Application[50];
	private int totalApp=-1;
	
	public void createNewApp(String appName, int appSize) {
 		totalApp++;
 		app=new Application(appName,appSize);
		appList[totalApp]=app;
	}
	
	public Application getApp(int id) {
		return appList[id];
	}
	public String toString() {
		return "There Are "+(totalApp+1)+" Applications ready to install";
	
	}
	public int getTotalApp() {
 		return totalApp+1;
 	}
 	
 	public Application[] getAppList() {
 		return appList;
 	}
	
}
