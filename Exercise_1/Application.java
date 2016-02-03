public class Application {
	private String appName;
	private int appSize;
	
	public Application (String appName, int appSize) {
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
		return ("Application Name: "+getAppName()+", with size: "+getAppSize()+"MB");
	}
}
