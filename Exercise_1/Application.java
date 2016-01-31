/*
Name 	: Pima Hani Safitri
ID 		: 1301140202
Class 	: IF-38-02
*/
public class Application {
	private String appName;
	private int appSize;
	
	public Application(String appName, int appSize) {
		this.appName=appName;
		this.appSize=appSize;
	}
	public String getappName() {
		return appName;
	}
	public int getappSize() {
		return appSize;
	}
	public String toString() {
		return ("Application name: "+appName+", with size: "+appSize);
	}

}
	
	
