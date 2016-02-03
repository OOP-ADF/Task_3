//Syahidul Akba Mardhotillah (1301140331)

public class SmartPhone{
	private Application[] appList = new Application[10];
	private int totalApp;
	private int memory;
	
	public void setMemory(int memory){
		this.memory = memory;
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public int getRemainingSize(){
		int temp = 0;
		for(int i=0; i<appList.length; i++){
			if(appList[i] != null){
				temp = temp + appList[i].getAppSize();
			}
		}
		return memory - temp;
	}
	
	public void addApplication(AppStore appStore, int appId){
		if(appStore.getApp(appId).getAppSize() < getRemainingSize()){
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		} else {
			System.out.print("Memory is full");
		}
	}
}
