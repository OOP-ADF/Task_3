//Adrian G. Nurcahyo
//1301140092
//IF-38-02

public class SmartPhone 
{
	private Application[] appList = new Application[10];
	private int totalApp = 0;
	private int memory;
	
	public void setMemory(int memory) 
	{
		this.memory = memory;
	}
	public void addApplication(AppStore appStore, int appId) 
	{
		if(getRemainingSize()>=appStore.getApp(appId).getAppSize()) 
		{
            appList[totalApp] = appStore.getApp(appId);
			totalApp++;
        }
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
		int a = 0;
        int temp = memory;
        for(int k=0;k<appList.length;k++) 
		{
            if(appList[k]!=null) 
			{
                a+=appList[k].getAppSize();
            }
        }
        return temp-=a;
	}
	public String toString () 
	{
		return "memory size "+memory+", "+totalApp+" application installed, remaining memory size: "+getRemainingSize();
	}
}
