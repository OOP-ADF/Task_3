//Anggi Agustian - 1301144149
public class AppStore{
	private Application[] appList = new Application[100];
	private int totalApp = 0;
	
	public void createNewApp(String appName, int appSize){
		Application a = new Application(appName, appSize);
		appList[totalApp] = a;
		totalApp++;
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int getTotalApp() {
		return totalApp;
	}
	
	public Application[] getAppList(){
		return appList;
	}
	
	public String toString(){
		return ("ada "+totalApp+" aplikasi yang siap diinstall.");
	}
}	
	
	