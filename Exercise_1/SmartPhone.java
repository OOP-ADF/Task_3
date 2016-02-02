/*
	Riksa Meidy Karim
	1301142289
	IF-38-09
*/

public class SmartPhone{
	private Application appList[];
	private int totalApp;
	private int memory;
	
	public SmartPhone(){
		appList = new Application[10];
		totalApp = 0;
		memory = 100;
	}
	
	public void setMemory(int memory){
		this.memory = memory;
	}
	
	public void addApplication(AppStore appStore, int appid){
		
		if (appStore.getApp(appid).getAppSize() < this.getRemainingSize()){ 
		appList[totalApp] = appStore.getApp(appid);
		totalApp++;}
		else {System.out.println("Memory Penuh");}
	}
	public Application getApp(int id){
		return appList[id];
	}
	public int getTotalApp(){
		return totalApp;
	}
	public int getRemainingSize(){
		int temp=0;
		for(int i=0;i<totalApp;i++){
			temp = temp + appList[i].getAppSize();
		}
		return memory - temp;
	}
	public String toString(){
		return "Memory Size " + Integer.toString(memory) + " MB , " + Integer.toString(totalApp) + " App Installed , " + Integer.toString(this.getRemainingSize()) + " MB Remaining" ;
	}
	
	
}