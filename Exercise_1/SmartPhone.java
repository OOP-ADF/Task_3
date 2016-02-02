
//Sulistiyo TR 1301144329 IF-38-09

public class SmartPhone
{
	private Application[] appList = new Application[10];
	private int totApp;
	private int memory;
	
	public void setMemory(int memory)
	{
		this.memory = memory;
	}
	
	public Application getApp(int id)
	{
		return appList[id];
	}
	
	public int getTotApp()
	{
		return totApp;
	}
	
	public int getRemainingSize()
	{
		int mmr = memory;
		int rsize = 0;
		for (int i = 0;i<appList.length;i++)
		{
			if(appList[i] != null)
			{
				rsize = rsize + appList[i].getAppUkuran();
			}
		}
		mmr = mmr-rsize;
		return mmr;
	}
	
	public void addApplication(AppStore appStore, int appId)
	{
		if(getRemainingSize()>=appStore.getApp(appId).getAppUkuran())
		{
			appList[totApp] = appStore.getApp(appId);
			totApp++;
		}
	}
	
	public String toString()
	{
		return ("memory size "+memory+", "+totApp+" application installed, remaining memory size : "+getRemainingSize());
	}
}
