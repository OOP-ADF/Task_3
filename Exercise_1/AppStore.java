// Rana Renes Rengga-1301144351 (IF-38-01)

public class AppStore
{
	private Application appList[] = new Application[100];
	private int totalApp = 0;

	public void createNewApp(String appName, int appSize)
	{
		Application app = new Application(appName, appSize);
		appList[totalApp] = app;
		totalApp++;
	}

	int id = 0;
	public Application getApp(int id)
	{
		return appList[id];
	}

	public void setTotalApp(int totalApp)
	{
		this.totalApp = totalApp;
	}
	public int getTotalApp()
	{
		return this.totalApp;
	}

	public Application getAppList()
	{
		return getApp(id);
	}

	public String toString()
	{
		return ("There are " + getTotalApp() + " applications ready to be installed");
	}
}