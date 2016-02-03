
//atika w  - 1301144211

public class AppStore{
	private Application[] appList = new Application[100];
	private int totalApp=0;
	
	public void createNewApp(String appName, int appSize){
		Application app = new Application(appName,appSize);
		appList[totalApp]=app;
		totalApp++;
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	public int getTotalApp(){
		return totalApp;
	}
	
	public Application[] getApplist(){
		return appList;
	}
	
	public String toString(){
			return ("There are "+getTotalApp()+" applications ready to install");
	}

}
