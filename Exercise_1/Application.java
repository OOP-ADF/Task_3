/*
* Name : Dede Kiswanto
* NIM : 1301140171
* Class : IF-38-01
* Ket : Tested
*/

public class Application {

	private String appName;
	private int appSize;

	public Application(String appName, int appSize) {
		this.appName = appName;
		this.appSize = appSize;
	}

	// Getter
	public String getAppName(){
		return appName;
	}

	public int getAppSize(){
		return appSize;
	}

	public String toString(){
		return "Application name : " + appName + ", with size : " + appSize + " MB";
	}

}
