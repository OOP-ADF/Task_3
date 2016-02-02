//[IF-38-09]_1301144139_I Komang Hendra Wijaya Kusuma

public class Application{
	private String appName;
	private int appSize;
	
	public Application(String appName, int appSize){
		this.appName=appName;
		this.appSize=appSize;
	}
	
	public void setAppName(String appName){
		this.appName=appName;
	}
	
	public String getAppName(){
		return appName;
	}
	
	public void setAppSize(int appSize){
		this.appSize=appSize;
	}
	
	public int getAppSize(){
		return appSize;
	}
	
	public String toString(){
		return "Application name : "+appName+", with size : "+appSize;
	}
}

