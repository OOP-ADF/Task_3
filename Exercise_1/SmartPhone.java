// Rana Renes Rengga-1301144351 (IF-38-01)

public class SmartPhone
{
	private Application appList[] = new Application[10];
	private int totalApp = 0;
	private int memory;

	public void setMemory(int memory)
	{
		this.memory = memory;
	}
	public void setTotalApp(int totalApp)
	{
		this.totalApp = totalApp;
	}
	public int getTotalApp()
	{
		return this.totalApp;
	}
	public int getMemory()
	{
		return this.memory;
	}
	public int getRemainingSize()
	{
		int jum = 0;

		for (int id=0; id<appList.length; id++)
		{
			if (appList[id] != null)
			{
				jum = jum + appList[id].getAppSize();
			}
		}
		
		int sisa = memory - jum;
		return sisa;
	}	
	public void addApplication(AppStore appStore, int appId)
	{
		Application _app = appStore.getApp(appId);

		if (_app.getAppSize() < getRemainingSize())
		{
			appList[totalApp] = _app;
			totalApp++;
		}
		else
			System.out.println("Insufficient memory");
	}
	
	public Application getApp(int id)
	{
		return appList[id];
	}

	public String toString()
	{
		return ("Memory size " + memory + ", " + totalApp + " installed, remaining memory size " + getRemainingSize());
	}
}
