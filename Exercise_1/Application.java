// Name : Rizza Aulia Rahman
// Student ID : 1301144231
// Class : IF-38-01

public class Application {
	private String appName;
	private int appSize;
	
	public Application(String appName, int appSize) {
		this.appName = appName;
		this.appSize = appSize;
	}
	public String getAppName() {
		return appName;
	}
	public int getAppSize() {
		return appSize;
	}
	public String toString() {
		String a = "Application name : "+appName+", with size : "+appSize+" MB";
		return a;
	}
}
