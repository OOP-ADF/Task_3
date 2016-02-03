
//atika w - 1301144211
public class SmartPhone{
	private Application appList [] = new Application[10];
	private int totalApp=0;
	private int memory;
	
	public void setMemory(int memory){
		this.memory=memory;
	}
	
	public void addApplication ( AppStore appStore, int appId){
		 Application apps= appStore.getApp(appId);
		 appList[totalApp]=apps;
		 totalApp++;
		 
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public int getRemainingSize(){
		int x=0;
		for(int i=0;i<appList.length;i++){
			if(appList[i] != null){
				x=x+appList[i].getAppSize();
			}
		}
		return (memory-x);
	}
	
	public String toString(){
		return ("Memory size"+memory+"MB, "+getTotalApp()+" application installed, remaining memory size: "+getRemainingSize()+" MB");
	}
}
