/*
	Riksa Meidy Karim
	1301142289
	IF-38-09
*/

public class AppStore{
	private Application appList[];
	private int totalApp;
	public AppStore(){
		totalApp = 0;
		appList = new Application[100];
	}
	
	public void createNewApp(String appName, int appSize){
		if(totalApp<=100){
			appList[totalApp] = new Application(appName,appSize);
			totalApp++;}
		else{
			System.out.println("Sudah Penuh");
		}
	}
	public Application  getApp(int id){
		return appList[id];
	}
	public int getTotalApp(){
		return totalApp;
	}
	public Application[] getAppList(){
		return appList;
	};
	public String toString(){
		return "There are " + Integer.toString(totalApp) + " Installed";
	}	
	
}
