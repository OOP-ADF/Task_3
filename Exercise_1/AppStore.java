/*
*name  : I Putu Prima Ananda
*class : IF-38-01
*NIM   : 1301144291
*/

public class AppStore {
	private Application appList[] = new Application[100];
	private int totalApp = 0;
	public void createNewApp(String appName, int appSize){
		Application a = new Application(appName, appSize);
		if (totalApp<appList.length){
			appList[totalApp] = a;
			totalApp++;
		}
	}
	public Application getApp(int id){
		return appList[id];
	}
	public void setTotalApp(int totalApp){
		this.totalApp = totalApp;
	}
	public int getTotalApp(){
		return this.totalApp;
	}
	public Application[] getAppList(){
		Application[] a = new Application[100];
		for (int i = 0; i < appList.length; i++){
			a[i] = appList[i];
		}
		return a;
	}
	public String toString(){
		return "There are "+totalApp+" Applications ready to install";
	}
}
