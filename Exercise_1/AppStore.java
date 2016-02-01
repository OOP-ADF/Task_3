//Name : Luthfi Fauzani Ahmad
//NIM  : 130140029
//Class: IF-38-09

public class AppStore{
	private Application[] applist = new Application [100];
	private int totalApp = 0;
	
	public void createNewApp(String appName, int appSize){
		Application app = new Application(appName, appSize);
		applist[totalApp] = app;
		totalApp++;
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public Application[] getAppList(){
		return appList;
	}
	
	public String toSting(){
		return ("There are " +  totalApp + " application ready to install");
	}
}

