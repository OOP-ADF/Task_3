//Nama : Ubassy Abdillah
//NIM : 1301148282

public class Application {
	private String appName;
	private int appSize;
	
	public Application (String appName, int appSize) {
		this.appName=appName;
		this.appSize=appSize;
	}

	public int getAppSize() {
		return appSize;
	}
	
	public String getAppName() {
		return appName;
	}
	
	public String toString() {
		return "Aplication name : "+appName+", with size: "+appSize;
	}
}

