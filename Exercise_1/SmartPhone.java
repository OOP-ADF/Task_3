/*
Hani Dika Riani
1301144012
IF-38-02
*/

public class SmartPhone {
	private Application appList[] = new Application[10];
	private int totalApp=0;
	private int memory;
	
	public void setMemory(int memory){
		this.memory=memory;
	}
	public int getTotalApp(){
		return totalApp;
	}
	public int getRemainingSize(){
		int a=0;
		for (int i=0;i<totalApp;i++){
			a = a + appList[i].getappSize();
		}
		return (memory-a);
	}
	public void addApplication(AppStore appStore, int appId){
		if(appStore.getApp(appId).getappSize()<getRemainingSize()){
			appList[totalApp]=appStore.getApp(appId);
			totalApp++;
		}
	}
	public String toString(){
		return "memory size "+memory+"MB, "+totalApp+" application installed, remaining memory size: "+getRemainingSize()+"MB";
	}
}
