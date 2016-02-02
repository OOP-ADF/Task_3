//dzakyta afuzagani
//1301140122
//IF 38 02

public class SmartPhone {
	private Application[] appList=new Application[50];
	private int totalMemory,memory,totalApp=-1;
		
	public void setMemory(int memory){
		this.memory=memory;
		totalMemory=memory;		
			
	}
	
	public void addApplication(AppStore appStore, int appId){
		Application app = appStore.getAppList()[appId];
		if(app.getAppSize()<=memory){
			totalApp++;
			appList[totalApp]=app;
			memory=memory-app.getAppSize();
		}
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int getTotalApp() {
		return totalApp+1;
	}
	
	public int getRemainingSize(){
		return memory;
	}
	
	public String  toString(){
		return "memory size "+totalMemory+" MB, "+(totalApp+1)+" application installed, remaining memory size: "+memory+" MB";
	}

}
	