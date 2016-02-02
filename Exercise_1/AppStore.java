/* Thoriq Abdul Aziz
	1301144341
	IF-38-01
*/
public class AppStore {
    private Application[] appList= new Application[100];
    private int totalApp = 0;
    private int memory;
    
	public void createNewApp(String appName, int appSize){
		Application aplication = new Application(appName,appSize);
		appList[totalApp] = aplication;
		totalApp++;
	}
	
	public Application getApp(int id){
		return appList[id];
	}
	
	public int getTotalApp(){
		return totalApp;
	}
	
	public Application[] getAppList(){
		return appList;
	}
	
	public String toString(){
		return "There are "+totalApp+" applications ready to install";
	}
}

