//Agung Suhendar_1301140279_IF 38-09

public class Application{
	private String appName;
	private int appSize;
	public Application(String appName, int appSize){
		this.appName = appName;
		this.appSize = appSize;
	}
	
	public String getName(){
		return appName;
	}
	
	public int getSize(){
		return appSize;
	}
	
	public String toString(){
		return "Application name: "+appName+", with size: "+appSize+"MB";
	}
}
