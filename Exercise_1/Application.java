/* NAMA : ANGKY FAJRIATI MS MUSA
   KELAS : IF-38-01
   NIM : 1301141221
*/

public class Application {
	private String appName;
	private int appSize;
	
	public Application(String appName, int appSize) {
		this.appName=appName;
		this.appSize=appSize;
	}
	public String getAppName() {
		return appName;
	}
	public int getAppSize() {
		return appSize;
	}
	
	public String toString() {
		return  ("Application Name: "+appName+ ", with size"+appSize+"MB");
	}
}
