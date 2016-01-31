/*Nama : Zulvan Firdaus Imanullah
NIM : 1301142292*/

public class Application {
	private String appName;
	private int appSize;

	public Application(String appName, int appSize) {
		this.appName=appName;
		this.appSize=appSize;
	}
	
	public String toString() {
		return "Application name: "+appName+", with size: "+appSize;
	}
	
	public String getappName() {
		return appName;
	}
	
	public int getappSize(){
		return appSize;
	}
}

