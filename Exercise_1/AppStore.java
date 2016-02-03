//Agung Suhendar_1301140279_IF 38-09

public class AppStore{
	private Application[] applist = new Application[100];
	private int totalApp;
	
	public void createNewApp(String appName,int appSize){
		if (totalApp<100){
			Application temp = new Application(appName,appSize);
			applist[totalApp] = temp;
			totalApp++;
		}
	}
	
	public Application getApp(int id){
		return applist[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public Application[] getAppList(){
		return applist;
	}
	
	public String toString(){
		return "There are "+totalApp+" applications ready to install";
	}
}
