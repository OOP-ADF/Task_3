/*Nama: Adam Geraldy Katab
Kelas: IF-38-01
NIM: 1301140381*/

public class Application {
	private String appName;
	private int appSize;
	
	public Application(String appName, int appSize) {
		
	}
	
	public String getAppName() {
		return appName;
	}
	
	public int getAppSize() {
		return appSize;
	}
	
	public String toString() {
		return "Application name: " + appName + ", size: " + appSize + "MB";
	}
}
