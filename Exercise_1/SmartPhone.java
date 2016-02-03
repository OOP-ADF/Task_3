public class SmartPhone{
	private Application[] appList = new Application[100];
	private int totalApp=0;
	private int memory=0;
	int remainingSize =0;
	
	public void setMemory(int memory){
		this.memory = memory;	
		this.remainingSize = memory;
	}
	
	public void addApplication(AppStore appStore, int appId){
		if (totalApp < appList.length) {
			if (remainingSize >= appStore.getApp(appId).getAppSize()) {
				appList[totalApp] = appStore.getApp(appId);
				remainingSize = remainingSize - appList[totalApp].getAppSize();
				totalApp++;
			} else System.out.println("Not Enough Memory");
	}
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public int getRemainingSize(){
		return remainingSize;
	}
	
	public String toString(){
		return ("Memory size "+memory+"MB, " +totalApp+"application installed, remaining memory size: "+remainingSize+"MB");
	}
}

