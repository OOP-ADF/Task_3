/* Reza Aryadi 1301144179 - IF 38 09 */
public class SmartPhone{
	private Application[] appList = new Application[10];
	private int totalApp;
	private int memory;
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public void setMemory(int memory){
		this.memory = memory;
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public int getRemainingSize(){
		int x = 0;
		int m;
		m = memory;
		for (int i=0;i<appList.length;i++){
			if(appList[i]!=null)
			{
				x+=appList[i].getappSize();
				
			}
		}
		return m-=x;
		
	}
	
	public void addApplication(AppStore appStore, int appId){
		if (getRemainingSize()>=appStore.getApp(appId).getappSize())
		{
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
	}
	
	public String toString(){
		return ("memory size "+memory+", "+totalApp+" application installed.");
	}
} 
