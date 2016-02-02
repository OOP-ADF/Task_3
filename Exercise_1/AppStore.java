public class AppStore{
 	private Application[] appList = new Application[100];
 	private  int totalApp = 0;
 	
 	public void createNewApp(String appName, int appSize) {
 		Application newApp = new Application(appName, appSize);
 		appList[totalApp] = newApp;
 		totalApp++;
 	}
	
	public int getTotalApp(){
 		return totalApp;
 	}
  
 	public Application getApp(int id){
 		return appList[id];
 	}
 	
 	public Application[] getAppList(){
 		return appList;
 	}
 	 
 	public String toString(){
 		return "There are " + totalApp + " applications ready to install";
 	}
 }
 
 //Ari Adrian Ibrahim
 //1301142301
 //IF 38 01
