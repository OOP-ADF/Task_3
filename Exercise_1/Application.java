//Sulistiyo TR 1301144329 IF-38-09

public class AppStore
{
		private Application[] appList = new Application[100];
		private int totApp = 0;
		
		public void createNewApp(String appName, int appSize)
		{
			Application apps = new Application();
			appList[totApp] = apps;
			totApp++;
		}
		
		public Application getApp(int id)
		{
			return appList[id];
		}
		
		public int getTotalApp()
		{
			return totApp;
		}
		
		public Application[] getAppList()
		{
			return appList;
		}
		
		public String toString()
		{
			return("There are "+totApp+" applications ready to install");
		}
}
