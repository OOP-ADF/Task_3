
/*
Name : Erwin Yulizar F
NIM  : 1301144031
Class: IF-38-01
*/

public class Application {
	private String appName;
	private int appSize;
	
	public Application(String appName, int appSize){
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
		return ("Application name : "+appName+" with size : "+appSize+" MB");
	}
}
