/*
Name : Amalya Citra Pradana
Student ID : 1301140389
Class : IF-38-09
*/

public class Application{
	private String appName;
	private int appSize;
	
	public Application(String appName, int appSize){
		this.appName = appName;
		this.appSize = appSize;
	}
	
	public String toString(){
		return "Application Name: "+appName+", with size: "+Integer.toString(appSize)+" MB";
	}
	
	public String getappName(){
		return appName;
	}
	
	public void setappName(String appName){
		this.appName = appName;
	}
	
	public int getappSize(){
		return appSize;
	}
	
	public void setappSize(int appSize){
		this.appSize = appSize;
	}
}
