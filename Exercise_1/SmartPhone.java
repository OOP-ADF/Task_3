/*
Gentur Cipto Tri Atmaja
1301140239
IF 38-09
*/

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
        int mem = memory;
 	int remsi = 0;
 	for (int i = 0;i<appList.length;i++)
 	{
            if(appList[i] != null)
            {
                remsi = remsi + appList[i].getAppSize();
            }
 	}
 	mem = mem-remsi;
 	return mem;
 	}
 	
 	public void addApplication(AppStore appStore, int appId)
 	{
            if(getRemainingSize()>=appStore.getApp(appId).getAppSize())
            {
 		appList[totalApp] = appStore.getApp(appId);
 		totalApp++;
            }
            else
            {
               System.out.println("Need more memory");     
            }
 	}
 	
 	public String toString()
 	{
 		return ("Memory Size "+memory+", "+totalApp+" application installed, remaining memory size : "+getRemainingSize());
 	}
       
}

