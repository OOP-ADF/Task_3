//Agung Suhendar_1301140279_IF 38-09

public class SmartPhone{
	private Application[] applist = new Application[10];
	private int totalApp;
	private int memory;
	public void setMemory(int memory){
		this.memory = memory;
	}
	
	public void addApplication(AppStore appStore, int appId){
		if (appStore.getApp(appId).getSize()<getRemainingSize()){
			applist[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
		else{System.out.println("Not enough memory");}
	}
	
	public Application getApp(int id){
		return applist[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public int getRemainingSize(){
		int m = 0;
		int i = 0;
		while (applist[i] != null) {
			m = m + applist[i].getSize();
			i++;
		}
		return memory-m;
	}
	
	public int getMem(){
		return memory;
	}
	
	public String toString(){
		return "memory size "+memory+"MB, "+totalApp+"application installed, remaining memory size: "+getRemainingSize()+"MB";
	}
}
