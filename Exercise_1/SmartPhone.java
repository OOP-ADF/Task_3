public class SmartPhone {
	private Application[] appList=new Application[10];
	private int totalApp;
	private int memory;
	
	public void setMemory(int memory){
		this.memory=memory;
	}
	public void addApplication(AppStore appStore, int appId){
		if(appStore.getApp(appId).getAppSize()<getRemainingSize()){
			appList[totalApp]=appStore.getApp(appId);
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
		int i=0;
		if (getTotalApp()>0){
			for(int j=0; i<getTotalApp(); j++){
				i+=appList[j].getAppSize();
			}
		}
		return memory -i;
	}
	public String toString(){
		return "Memory Size "+getRemainingSize()+", "+getTotalApp()+" Application installed, remaining memory size : "+getRemainingSize()+"MB";
	}
}
