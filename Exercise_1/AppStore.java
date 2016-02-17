// 	Biyan Ilham Akbar, 1301144319, IF-38-09

 public class AppStore {
 	private Application[] appList = new Application[100];
 	private int jumApp=0;
 	
 	public void createNewApp(String appName, int kapasitasApp) {
 		Application app = new Application(appName, kapasitasApp);
 		appList[jumApp] = app;
 		jumApp++;}
 	
 	public Application getApp(int id) {
 		return appList[id];}
 	
 	public String toString() {
 		return ("There are "+jumApp+" applications ready to install");}
 }
