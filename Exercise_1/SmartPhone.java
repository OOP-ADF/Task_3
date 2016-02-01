//Name : Luthfi Fauzani Ahmad
//NIM  : 130140029
//Class: IF-38-09

public class SmartPhone{
	private Application[] appList = new Application[10];
	private int totalApp;
	private int memory;
	
	public void setMemory(int memory){
		this.memory = memory;
	}
	
	public void addApplication(AppStore appStore, int appId){
		if (getRemainingSize()>=appStore.getApp(appId).getAppSize()){
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
		}
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public int getRemainingSize(){
		int x = 0;
		int y;
		y = memory;
		for (int i=0; i<appList.length; i++){
			if(appList[i]!= null){
				x+=appList[i].getAppSize();
			}
		}
		return y-=x;
	}
	
	public String toString(){
		return ("Memory size " + memory + ", " + totalApp + " application intsalled");
	}
}
