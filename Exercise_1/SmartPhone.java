//[IF-38-09]_1301144139_I Komang Hendra Wijaya Kusuma

public class SmartPhone {
	private Application[] appList= new Application[10];
	private int totalApp;
	private int memory;
	
	public void setMemory(int memory){
		this.memory=memory;
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int totalApp(){
		return totalApp;
	}
	
	public String toString(){
		return "Memory size "+memory+"MB, "+totalApp+" application installed, remaining memory size : "+getRemainingSize();
	}
	
	
	public void addApplication(AppStore appStore,int appId){
		if(getRemainingSize()>=appStore.getApp(appId).getAppSize()) {
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
	}
	
	public int getRemainingSize(){
 		int counter = 0;
 		int temp = memory;
 		for (int i=0; i<appList.length; i++){
 			if(appList[i]!=null)
 			{
 				counter+=appList[i].getAppSize();
			}
 		}
 		return temp-=counter;
	}
}



