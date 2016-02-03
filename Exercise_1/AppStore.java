/*
Nama:	Aryaditya Hendri Pratama
Kelas:	IF3802
NIM:	1301144162
*/

public class AppStore {
 	private Application appList[] = new Application[10];
 	private int totalApp;
 	
 	public void createNewApp(String appName, int appSize){
 		appList[totalApp] = new Application(appName,appSize);
  		totalApp++;
 	}
 	
 	public Application getApp(int id) {
  		return appList[id];
  	}
 	
 	public int getTotalApp() {
  		return totalApp;
 	}
  	
  	public Application[] getAppList() {
  		return appList;
  	}
  	
  	public String toString() {
  		return "there are "+totalApp+" application ready to install";
  	}
 }
