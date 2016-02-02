//Vicha Octavia Tama_1301144209_IF-38-09
 
 public class AppStore
 {
	private Application[] appList = new Application[100];
	private int totalApp = 0;
 	
	public void createNewApp(String appName, int appSize)
	{
		Application app = new Application();
		appList[totalApp] = app; totalApp++;
	}
	public Application getApp(int id)
	{
		return appList[id];
	}
 	public int getTotalApp() 
	{
		return totalApp;
 	}
	public Application[] getAppList()
	{
 		return appList;
 	}
 	public String toString()
	{
 		return ("There are "+totalApp+" applications ready to install");
 	}
 }	
