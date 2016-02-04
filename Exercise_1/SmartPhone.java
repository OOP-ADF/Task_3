//Anang Kurniawan
//1301140192
//IF 38 02

public class SmartPhone{
	private Application[] appList= new Application[10];
	private int totalApp= 0;
	private int memory;
	private int memoryFix;
	
	public void setMemory(int memory)
	{
		this.memory = memory;
		memoryFix = memory;
	}
	
	public int getRemainingSize()
	{
		return memory;
	}
	
	public void addApplication(AppStore appStore, int appId)
	{
		if (getRemainingSize() >= appStore.getApp(appId).getAppSize())
		{
			appList[totalApp] = appStore.getApp(appId);
			memory = getRemainingSize() - appStore.getApp(appId).getAppSize();
			totalApp++;
		}
		else 
		{
			System.out.println("Storage not Enough");
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
	
	public String toString()
	{
		return "memory size "+memoryFix+" , "+getTotalApp()+" application installed, remaining memory size: "+getRemainingSize()+"MB";
	}
}