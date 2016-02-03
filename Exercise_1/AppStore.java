/*
Name : Amalya Citra Pradana
Student ID : 1301140389
Class : IF-38-09
*/

public class AppStore {
	private Application appList[] =  new Application[100];
	private int totalApp = 0;
	
	public void createNewApp(String appName, int appSize){
		Application app = new Application (appName, appSize);
		appList[totalApp] = app;
		totalApp++;
	}
	
	public Application getApp (int id){
		return appList[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public Application[] getAppList(){
		return appList;
	}
	
	public String toString(){
		return "There are "+Integer.toString(totalApp)+" application(s) ready to install";
	}
}

