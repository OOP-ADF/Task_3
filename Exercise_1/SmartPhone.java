/* Thoriq Abdul Aziz
	1301144341
	IF-38-01
*/
public class SmartPhone{
    private Application[] appList = new Application[100];
	private int totalApp = 0;
	private int memory;
	
	public void setMemory(int memory){
		this.memory = memory;
	}
	
	public void addAplication(AppStore appStore, int appId){
		if(appStore.getApp(appId).getAppSize()<getRemainingSize()){
			appList[totalApp] = appStore.getApp(appId);
			totalApp++;
			System.out.println(appStore.getApp(appId).getAppName()+" installed");
		}
		else{
			System.out.println("Not Enough Memory");
		}
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public int getRemainingSize(){
		int use = 0;
		for(int i =0; i < appList.length; i++){
			if(appList[i] != null){
				use = use + appList[i].getAppSize();
			}
		}
		return memory - use;
	}
	
	public String toString(){
		return "memory size "+memory+", "+totalApp+" application installed, remaining memory size : "+getRemainingSize();
	}
}
