//Dzakyta Afuzagani
//1301140122
//IF 38 02

public class Application {
	private String appName;
	private int appSize;
		
	public Application (String appName, int appSize) {
			this.appName=appName;
			this.appSize=appSize;
	}
	public int getAppSize(){
			return appSize;
	}
	
	public String getAppName(){
			return appName;
			
	}
	public String toString() {
 		return "Aplication name 	: "+appName+", with size	: "+appSize;
	
	}
	

}
