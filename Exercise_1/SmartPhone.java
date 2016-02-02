public class SmartPhone{
 	private Application[] appList =  new Application[100];
 	private int totalApp = 0;
 	private int memory;
 	
 	public void setMemory(int memory){
 		this.memory = memory;
 	}
 
 	public void addApplication(AppStore appStore, int appId){
 		if(appStore.getApp(appId).getAppSize() < getRemainingSize()){
 			appList[totalApp] = appStore.getApp(appId); 
 			totalApp++;
			System.out.println(appStore.getApp(appId).getAppName()+" Installed ");
 		}
		else
		{
			System.out.println("Memory Full !");
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
 		if(getTotalApp() > 0){
 			for(int a = 0; a < getTotalApp(); a++){
 				x += appList[a].getAppSize();
 			}
 		}
 		return memory - x;
 	}
 	
 	public String toString(){
 		return "Memory Size " + getRemainingSize() + ", " + getTotalApp() + " application installed, remaining memory size : " +  getRemainingSize() + "MB";
 	}
 }
 
 //Ari Adrian Ibrahim
//1301142301
//IF 38 01
