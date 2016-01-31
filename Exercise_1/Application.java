//Hirianinda Malsegianty S.
//1301140262
//IF 38-02

public class Application {
	String appName;
	int appSize;
	
	public Application (String appName, int appSize) {
		this.appName = appName;
		this.appSize = appSize;
	}
	
	public String getappName() {
        return appName;
    }

    public double getappSize() {
        return appSize;
    }
	
	public String toString() { 
	return String.format("Application name: ",getappName()," with size: ",getappSize()," MB");
	}
}