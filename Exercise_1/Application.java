public class Application {
	private String appName;
	private int appSize;
	
	
	public Application (String appName, int appSize) {
		this.appName = appName;
		this.appSize = appSize;
	}
	
	public String getappName () {
		return appName;
	}
	
	public int getappSize () {
		return appSize;
	}
	
	public String toString() {
		return ("Nama : " + appName +"\nSize : " + appSize);
	}
	
}
