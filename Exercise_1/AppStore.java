/*Hizas Sabilal Rasyad
  1301140251
  IF3801
 */
public class AppStore
{
	private Application[] appList = new Application[100];
	private  int totalApp = 0;
	
	public void createNewApp(String appName, int appSize)
	{
		Application newApp = new Application(appName, appSize);
		//appList[totalApp] = new Application(appName, appSize);
		appList[totalApp] = newApp;
		totalApp++;
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
		return "There are " + totalApp + " applications ready to install";
	}
}
