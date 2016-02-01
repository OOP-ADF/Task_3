// Ferdy Dian Anugrah(1301140035) IF 3809
 
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
	
	public void setappName(String appName) {
		this.appName = appName;
	}
	
	public String toString() {
		return ("Application name : "+appName+", with size : "+appSize+"MB");
	}
}

