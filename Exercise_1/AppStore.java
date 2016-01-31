//Hirianinda Malsegianty S.
//1301140262
//IF 38-02

public class AppStore {
	Application[] applist = new Application[100]; 
	int totalApp = 0;
	
	public void createNewApp (String appName, int appSize) {
		Application a = new Application(appName,appSize);
			applist[totalApp] = a;
			totalApp++;
		}
	
	public Application getApp(int id) {
		return applist[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public Application getAppList(){
			return(applist[totalApp]);
	}

	
	public String toString() { 
    
    return String.format("There are ",getTotalApp()," applications ready to install");
	}
}