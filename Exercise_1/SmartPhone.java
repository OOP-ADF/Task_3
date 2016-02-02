/*Hizas Sabilal Rasyad
  1301140251
  IF3801
 */
public class SmartPhone
{
	private Application[] appList =  new Application[10];
	private int totalApp = 0;
	private int memory;
	
	public void setMemory(int memory)
	{
		this.memory = memory;
	}
	
	public void addApplication(AppStore appStore, int appId)
	{
		if(appStore.getApp(appId).getAppSize() < getRemainingSize())
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
		int x = 0;
		if(getTotalApp() > 0)
		{
			for(int a = 0; a < getTotalApp(); a++)
			{
				x += appList[a].getAppSize();
			}
		}
		return memory - x;
	}
	
	public String toString()
	{
		return "Memory Size " + getRemainingSize() + ", " + getTotalApp() + " application installed, remaining memory size : " +  getRemainingSize() + "MB";
	}
}
