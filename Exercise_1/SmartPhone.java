//Vicha Octavia Tama_1301144209_IF-38-09

public class Smartphone {
	
	private Application[] appList=new Application[100];
	private int memory;
	private int totalApp;
	
	public void setMemory(int memory)
	{
		this.memory=memory;
	}
	public int getRemainingSize()
	{
		int m=memory;
		int i;
		int memoryUse;
		i=0;
		memoryUse=0;
		while(appList[i]!=null) {
			memoryUse=memoryUse+appList[i].getAppSize();
			i++;
		}
		return m=m-memoryUse;
	}
	public void addApplication(AppStore appStore, int appId)
	{
		if(getRemainingSize()>=appStore.getApp(appId).getAppSize())
		{
			appList[totalApp]=appStore.getApp(appId);
		}
	}
	public String toString()
	{
		return("Memory size "+memory+", "+totalApp+" application installed, remaining memory size : "+getRemainingSize());
	}
}
