/*
	Riksa Meidy Karim
	1301142289
	IF-38-09
*/

public class Application{
	private String appName;
	private int appSize;
	
	public Application(){
		appName = "Default";
		appSize = 0;
	}
	
	public Application(String appName , int appSize){
		this.appName = appName;
		this.appSize = appSize;
	}
	
	
	public String getAppName(){
		return appName;
	}
	public int getAppSize(){
		return appSize;
	}
	public String toString(){
		return "Application Name: " + appName + "  Size: " + Integer.toString(appSize) + " MB";
	}
	
	
}