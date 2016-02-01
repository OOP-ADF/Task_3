//IF-38-09_Adzan Nugraha_1301140249

public class SmartPhone
{
	private Application[] appList = new Application[10];
	private int totalApp;
	private int memory;
	
	public void setMemory(int memory)
	{
		this.memory = memory;
	}
	
	public Application getApp(int id)
	{
		return appList[id];
	}
	
	public int getTotalApp()
	{
		return totalApp;
	}
	
	public int getRemainingSize()
	{
		int mmr = memory;
		int rsize = 0;
		for (int i = 0;i<appList.length;i++)
		{
			if(appList[i] != null)
			{
				rsize = rsize + appList[i].getAppSize();
			}
		}
		mmr = mmr-rsize;
		return mmr;
	}
	
	public void addApplication(AppStore appStore, int appId)
	{
		if(getRemainingSize()>=appStore.getApp(appId).getAppSize())
		{
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
	}
	
	public String toString()
	{
		return ("memory size "+memory+", "+totalApp+" application installed, remaining memory size : "+getRemainingSize());
	}
}
