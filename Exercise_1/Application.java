//@auth:Irfan Trianto/1301144111/IF-38-01

public class Application {

	//definisi atribut
 	private String appName;
 	private int appSize;

 	//definisi konstruktor
 	public Application(String appName, int appSize) {
 		this.appName = appName;
 		this.appSize = appSize;
 	}

 	//definisi method
 	public String getappName() {
 		return appName;
	}
	
 	public int getappSize() {
 		return appSize;
 	}
 	
 	public String toString() {
		return "Application name : "+appName+", with size : "+appSize+"MB";
	}
 }
