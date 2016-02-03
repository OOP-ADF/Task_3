/*
*name  : I Putu Prima Ananda
*class : IF-38-01
*NIM   : 1301144291
*/

public class Application {
	private String appName;
	private int appSize;
	
	public Application(String appName, int appSize){
		this.appName = appName;
		this.appSize = appSize;
	}
	public String getAppName(){
		return this.appName;
	}
	public int getAppSize(){
		return this.appSize;
	}
	public String toString(){
		return "Application name: "+this.appName+", with size: "+this.appSize;
	}
}
