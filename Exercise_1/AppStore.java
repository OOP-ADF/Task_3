//Fitrah Bima Nusantara
//1301140295
//IF 38-09
 
public class AppStore {
	private Application[] appList = new Application[100];
	private int totalApp = 0;

	public void createNewApp(String namaApp, int sizeApp) {
		Application newApp = new Application(namaApp, sizeApp);
		appList[totalApp] = newApp;
		totalApp++;
	}

	public Application getApp(int id) {
		return appList[id-1];
	}

	public String toString() {
		return "There are " + (totalApp) + " applications ready to install";
	}
}
