/*Nama	: Windy Israniati Jihan
NIM		: 1301144309
Kelas	: IF-38-09 */

public class AppStore{
	private Application[] appList = new Application[100] ;
	private int totalApp=0;
	
	public void createNewApp(String appName, int appSize){
		Application aplikasi = new Application();
		appList[totalApp] = aplikasi;
		totalApp++;
	}
	public Application getApp(int id) {
		return appList[id];
	}
	public int getTotalApp(){
		return totalApp;
	}
	public Application[] getAppList(){
		return appList;
	}
	public String toString() {
		return "There are "+totalApp+" applications ready to install";
	}
}

